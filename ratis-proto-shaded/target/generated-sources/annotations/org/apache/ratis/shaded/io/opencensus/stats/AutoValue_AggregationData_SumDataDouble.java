

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AggregationData_SumDataDouble extends AggregationData.SumDataDouble {

  private final double sum;

  AutoValue_AggregationData_SumDataDouble(
      double sum) {
    this.sum = sum;
  }

  @Override
  public double getSum() {
    return sum;
  }

  @Override
  public String toString() {
    return "SumDataDouble{"
         + "sum=" + sum
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AggregationData.SumDataDouble) {
      AggregationData.SumDataDouble that = (AggregationData.SumDataDouble) o;
      return (Double.doubleToLongBits(this.sum) == Double.doubleToLongBits(that.getSum()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(sum) >>> 32) ^ Double.doubleToLongBits(sum));
    return h$;
  }

}
