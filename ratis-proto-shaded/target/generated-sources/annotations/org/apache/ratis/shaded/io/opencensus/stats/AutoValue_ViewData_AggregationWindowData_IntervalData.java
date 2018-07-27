

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;
import org.apache.ratis.shaded.io.opencensus.common.Timestamp;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_ViewData_AggregationWindowData_IntervalData extends ViewData.AggregationWindowData.IntervalData {

  private final Timestamp end;

  AutoValue_ViewData_AggregationWindowData_IntervalData(
      Timestamp end) {
    if (end == null) {
      throw new NullPointerException("Null end");
    }
    this.end = end;
  }

  @Override
  public Timestamp getEnd() {
    return end;
  }

  @Override
  public String toString() {
    return "IntervalData{"
         + "end=" + end
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ViewData.AggregationWindowData.IntervalData) {
      ViewData.AggregationWindowData.IntervalData that = (ViewData.AggregationWindowData.IntervalData) o;
      return (this.end.equals(that.getEnd()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= end.hashCode();
    return h$;
  }

}
