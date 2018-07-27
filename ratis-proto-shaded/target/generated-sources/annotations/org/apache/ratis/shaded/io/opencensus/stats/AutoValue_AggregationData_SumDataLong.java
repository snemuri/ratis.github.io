

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AggregationData_SumDataLong extends AggregationData.SumDataLong {

  private final long sum;

  AutoValue_AggregationData_SumDataLong(
      long sum) {
    this.sum = sum;
  }

  @Override
  public long getSum() {
    return sum;
  }

  @Override
  public String toString() {
    return "SumDataLong{"
         + "sum=" + sum
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AggregationData.SumDataLong) {
      AggregationData.SumDataLong that = (AggregationData.SumDataLong) o;
      return (this.sum == that.getSum());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (int) ((sum >>> 32) ^ sum);
    return h$;
  }

}
