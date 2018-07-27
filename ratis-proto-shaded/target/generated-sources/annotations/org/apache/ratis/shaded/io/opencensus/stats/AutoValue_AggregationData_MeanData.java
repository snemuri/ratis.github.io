

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AggregationData_MeanData extends AggregationData.MeanData {

  private final double mean;
  private final long count;

  AutoValue_AggregationData_MeanData(
      double mean,
      long count) {
    this.mean = mean;
    this.count = count;
  }

  @Override
  public double getMean() {
    return mean;
  }

  @Override
  public long getCount() {
    return count;
  }

  @Override
  public String toString() {
    return "MeanData{"
         + "mean=" + mean + ", "
         + "count=" + count
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AggregationData.MeanData) {
      AggregationData.MeanData that = (AggregationData.MeanData) o;
      return (Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(that.getMean()))
           && (this.count == that.getCount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(mean) >>> 32) ^ Double.doubleToLongBits(mean));
    h$ *= 1000003;
    h$ ^= (int) ((count >>> 32) ^ count);
    return h$;
  }

}
