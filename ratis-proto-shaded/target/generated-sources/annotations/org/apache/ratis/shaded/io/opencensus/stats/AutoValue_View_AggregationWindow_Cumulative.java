

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_View_AggregationWindow_Cumulative extends View.AggregationWindow.Cumulative {

  AutoValue_View_AggregationWindow_Cumulative(
 ) {
  }

  @Override
  public String toString() {
    return "Cumulative{"
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof View.AggregationWindow.Cumulative) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    return h$;
  }

}
