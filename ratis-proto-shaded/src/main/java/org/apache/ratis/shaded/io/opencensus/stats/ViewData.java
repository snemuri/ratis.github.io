/*
 * Copyright 2016-17, OpenCensus Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ratis.shaded.io.opencensus.stats;

import static org.apache.ratis.shaded.com.google.common.base.Preconditions.checkArgument;

import com.google.auto.value.AutoValue;
import org.apache.ratis.shaded.com.google.common.collect.Maps;
import org.apache.ratis.shaded.io.opencensus.common.Function;
import org.apache.ratis.shaded.io.opencensus.common.Functions;
import org.apache.ratis.shaded.io.opencensus.common.Timestamp;
import org.apache.ratis.shaded.io.opencensus.stats.Aggregation.Count;
import org.apache.ratis.shaded.io.opencensus.stats.Aggregation.Distribution;
import org.apache.ratis.shaded.io.opencensus.stats.Aggregation.Mean;
import org.apache.ratis.shaded.io.opencensus.stats.Aggregation.Sum;
import org.apache.ratis.shaded.io.opencensus.stats.AggregationData.CountData;
import org.apache.ratis.shaded.io.opencensus.stats.AggregationData.DistributionData;
import org.apache.ratis.shaded.io.opencensus.stats.AggregationData.MeanData;
import org.apache.ratis.shaded.io.opencensus.stats.AggregationData.SumDataDouble;
import org.apache.ratis.shaded.io.opencensus.stats.AggregationData.SumDataLong;
import org.apache.ratis.shaded.io.opencensus.stats.Measure.MeasureDouble;
import org.apache.ratis.shaded.io.opencensus.stats.Measure.MeasureLong;
import org.apache.ratis.shaded.io.opencensus.stats.View.AggregationWindow;
import org.apache.ratis.shaded.io.opencensus.tags.TagValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.concurrent.Immutable;

/*>>>
import org.checkerframework.checker.nullness.qual.Nullable;
*/

/**
 * The aggregated data for a particular {@link View}.
 *
 * @since 0.8
 */
@Immutable
@AutoValue
// Suppress Checker Framework warning about missing @Nullable in generated equals method.
@AutoValue.CopyAnnotations
@SuppressWarnings("nullness")
public abstract class ViewData {

  // Prevents this class from being subclassed anywhere else.
  ViewData() {}

  /**
   * The {@link View} associated with this {@link ViewData}.
   *
   * @since 0.8
   */
  public abstract View getView();

  /**
   * The {@link AggregationData} grouped by combination of tag values, associated with this {@link
   * ViewData}.
   *
   * @since 0.8
   */
  public abstract Map<List</*@Nullable*/ TagValue>, AggregationData> getAggregationMap();

  /**
   * Returns the {@link AggregationWindowData} associated with this {@link ViewData}.
   *
   * @return the {@code AggregationWindowData}.
   * @since 0.8
   */
  public abstract AggregationWindowData getWindowData();

  /**
   * Constructs a new {@link ViewData}.
   *
   * @param view the {@link View} associated with this {@link ViewData}.
   * @param map the mapping from {@link TagValue} list to {@link AggregationData}.
   * @param windowData the {@link AggregationWindowData}.
   * @return a {@code ViewData}.
   * @throws IllegalArgumentException if the types of {@code Aggregation} and {@code
   *     AggregationData} don't match, or the types of {@code Window} and {@code WindowData} don't
   *     match.
   * @since 0.8
   */
  public static ViewData create(
      View view,
      Map<? extends List</*@Nullable*/ TagValue>, ? extends AggregationData> map,
      final AggregationWindowData windowData) {
    checkWindow(view.getWindow(), windowData);
    Map<List<TagValue>, AggregationData> deepCopy = Maps.newHashMap();
    for (Entry<? extends List<TagValue>, ? extends AggregationData> entry : map.entrySet()) {
      checkAggregation(view.getAggregation(), entry.getValue(), view.getMeasure());
      deepCopy.put(
          Collections.unmodifiableList(new ArrayList</*@Nullable*/ TagValue>(entry.getKey())),
          entry.getValue());
    }
    return new AutoValue_ViewData(view, Collections.unmodifiableMap(deepCopy), windowData);
  }

  private static void checkWindow(
      AggregationWindow window, final AggregationWindowData windowData) {
    window.match(
        new Function<View.AggregationWindow.Cumulative, Void>() {
          @Override
          public Void apply(View.AggregationWindow.Cumulative arg) {
            checkArgument(
                windowData instanceof AggregationWindowData.CumulativeData,
                createErrorMessageForWindow(arg, windowData));
            return null;
          }
        },
        new Function<View.AggregationWindow.Interval, Void>() {
          @Override
          public Void apply(View.AggregationWindow.Interval arg) {
            checkArgument(
                windowData instanceof AggregationWindowData.IntervalData,
                createErrorMessageForWindow(arg, windowData));
            return null;
          }
        },
        Functions.</*@Nullable*/ Void>throwIllegalArgumentException());
  }

  private static String createErrorMessageForWindow(
      AggregationWindow window, AggregationWindowData windowData) {
    return "AggregationWindow and AggregationWindowData types mismatch. "
        + "AggregationWindow: "
        + window
        + " AggregationWindowData: "
        + windowData;
  }

  private static void checkAggregation(
      final Aggregation aggregation, final AggregationData aggregationData, final Measure measure) {
    aggregation.match(
        new Function<Sum, Void>() {
          @Override
          public Void apply(Sum arg) {
            measure.match(
                new Function<MeasureDouble, Void>() {
                  @Override
                  public Void apply(MeasureDouble arg) {
                    checkArgument(
                        aggregationData instanceof SumDataDouble,
                        createErrorMessageForAggregation(aggregation, aggregationData));
                    return null;
                  }
                },
                new Function<MeasureLong, Void>() {
                  @Override
                  public Void apply(MeasureLong arg) {
                    checkArgument(
                        aggregationData instanceof SumDataLong,
                        createErrorMessageForAggregation(aggregation, aggregationData));
                    return null;
                  }
                },
                Functions.<Void>throwAssertionError());
            return null;
          }
        },
        new Function<Count, Void>() {
          @Override
          public Void apply(Count arg) {
            checkArgument(
                aggregationData instanceof CountData,
                createErrorMessageForAggregation(aggregation, aggregationData));
            return null;
          }
        },
        new Function<Mean, Void>() {
          @Override
          public Void apply(Mean arg) {
            checkArgument(
                aggregationData instanceof MeanData,
                createErrorMessageForAggregation(aggregation, aggregationData));
            return null;
          }
        },
        new Function<Distribution, Void>() {
          @Override
          public Void apply(Distribution arg) {
            checkArgument(
                aggregationData instanceof DistributionData,
                createErrorMessageForAggregation(aggregation, aggregationData));
            return null;
          }
        },
        Functions.<Void>throwAssertionError());
  }

  private static String createErrorMessageForAggregation(
      Aggregation aggregation, AggregationData aggregationData) {
    return "Aggregation and AggregationData types mismatch. "
        + "Aggregation: "
        + aggregation
        + " AggregationData: "
        + aggregationData;
  }

  /**
   * The {@code AggregationWindowData} for a {@link ViewData}.
   *
   * @since 0.8
   */
  @Immutable
  public abstract static class AggregationWindowData {

    private AggregationWindowData() {}

    /**
     * Applies the given match function to the underlying data type.
     *
     * @since 0.8
     */
    public abstract <T> T match(
        Function<? super CumulativeData, T> p0,
        Function<? super IntervalData, T> p1,
        Function<? super AggregationWindowData, T> defaultFunction);

    /**
     * Cumulative {@code AggregationWindowData}.
     *
     * @since 0.8
     */
    @Immutable
    @AutoValue
    // Suppress Checker Framework warning about missing @Nullable in generated equals method.
    @AutoValue.CopyAnnotations
    @SuppressWarnings("nullness")
    public abstract static class CumulativeData extends AggregationWindowData {

      CumulativeData() {}

      /**
       * Returns the start {@code Timestamp} for a {@link CumulativeData}.
       *
       * @return the start {@code Timestamp}.
       * @since 0.8
       */
      public abstract Timestamp getStart();

      /**
       * Returns the end {@code Timestamp} for a {@link CumulativeData}.
       *
       * @return the end {@code Timestamp}.
       * @since 0.8
       */
      public abstract Timestamp getEnd();

      @Override
      public final <T> T match(
          Function<? super CumulativeData, T> p0,
          Function<? super IntervalData, T> p1,
          Function<? super AggregationWindowData, T> defaultFunction) {
        return p0.apply(this);
      }

      /**
       * Constructs a new {@link CumulativeData}.
       *
       * @since 0.8
       */
      public static CumulativeData create(Timestamp start, Timestamp end) {
        if (start.compareTo(end) > 0) {
          throw new IllegalArgumentException("Start time is later than end time.");
        }
        return new AutoValue_ViewData_AggregationWindowData_CumulativeData(start, end);
      }
    }

    /**
     * Interval {@code AggregationWindowData}.
     *
     * @since 0.8
     */
    @Immutable
    @AutoValue
    // Suppress Checker Framework warning about missing @Nullable in generated equals method.
    @AutoValue.CopyAnnotations
    @SuppressWarnings("nullness")
    public abstract static class IntervalData extends AggregationWindowData {

      IntervalData() {}

      /**
       * Returns the end {@code Timestamp} for an {@link IntervalData}.
       *
       * @return the end {@code Timestamp}.
       * @since 0.8
       */
      public abstract Timestamp getEnd();

      @Override
      public final <T> T match(
          Function<? super CumulativeData, T> p0,
          Function<? super IntervalData, T> p1,
          Function<? super AggregationWindowData, T> defaultFunction) {
        return p1.apply(this);
      }

      /**
       * Constructs a new {@link IntervalData}.
       *
       * @since 0.8
       */
      public static IntervalData create(Timestamp end) {
        return new AutoValue_ViewData_AggregationWindowData_IntervalData(end);
      }
    }
  }
}
