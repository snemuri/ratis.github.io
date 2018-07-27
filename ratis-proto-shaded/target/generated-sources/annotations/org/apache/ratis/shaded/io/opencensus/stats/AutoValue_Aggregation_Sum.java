

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Aggregation_Sum extends Aggregation.Sum {

  AutoValue_Aggregation_Sum(
 ) {
  }

  @Override
  public String toString() {
    return "Sum{"
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Aggregation.Sum) {
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
