

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;
import org.apache.ratis.shaded.io.opencensus.common.Duration;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_View_AggregationWindow_Interval extends View.AggregationWindow.Interval {

  private final Duration duration;

  AutoValue_View_AggregationWindow_Interval(
      Duration duration) {
    if (duration == null) {
      throw new NullPointerException("Null duration");
    }
    this.duration = duration;
  }

  @Override
  public Duration getDuration() {
    return duration;
  }

  @Override
  public String toString() {
    return "Interval{"
         + "duration=" + duration
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof View.AggregationWindow.Interval) {
      View.AggregationWindow.Interval that = (View.AggregationWindow.Interval) o;
      return (this.duration.equals(that.getDuration()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= duration.hashCode();
    return h$;
  }

}
