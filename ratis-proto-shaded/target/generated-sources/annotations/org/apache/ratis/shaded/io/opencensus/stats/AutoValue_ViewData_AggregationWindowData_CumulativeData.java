

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;
import org.apache.ratis.shaded.io.opencensus.common.Timestamp;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_ViewData_AggregationWindowData_CumulativeData extends ViewData.AggregationWindowData.CumulativeData {

  private final Timestamp start;
  private final Timestamp end;

  AutoValue_ViewData_AggregationWindowData_CumulativeData(
      Timestamp start,
      Timestamp end) {
    if (start == null) {
      throw new NullPointerException("Null start");
    }
    this.start = start;
    if (end == null) {
      throw new NullPointerException("Null end");
    }
    this.end = end;
  }

  @Override
  public Timestamp getStart() {
    return start;
  }

  @Override
  public Timestamp getEnd() {
    return end;
  }

  @Override
  public String toString() {
    return "CumulativeData{"
         + "start=" + start + ", "
         + "end=" + end
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ViewData.AggregationWindowData.CumulativeData) {
      ViewData.AggregationWindowData.CumulativeData that = (ViewData.AggregationWindowData.CumulativeData) o;
      return (this.start.equals(that.getStart()))
           && (this.end.equals(that.getEnd()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= start.hashCode();
    h$ *= 1000003;
    h$ ^= end.hashCode();
    return h$;
  }

}
