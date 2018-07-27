

package org.apache.ratis.shaded.io.opencensus.stats;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AggregationData_DistributionData extends AggregationData.DistributionData {

  private final double mean;
  private final long count;
  private final double min;
  private final double max;
  private final double sumOfSquaredDeviations;
  private final List<Long> bucketCounts;

  AutoValue_AggregationData_DistributionData(
      double mean,
      long count,
      double min,
      double max,
      double sumOfSquaredDeviations,
      List<Long> bucketCounts) {
    this.mean = mean;
    this.count = count;
    this.min = min;
    this.max = max;
    this.sumOfSquaredDeviations = sumOfSquaredDeviations;
    if (bucketCounts == null) {
      throw new NullPointerException("Null bucketCounts");
    }
    this.bucketCounts = bucketCounts;
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
  public double getMin() {
    return min;
  }

  @Override
  public double getMax() {
    return max;
  }

  @Override
  public double getSumOfSquaredDeviations() {
    return sumOfSquaredDeviations;
  }

  @Override
  public List<Long> getBucketCounts() {
    return bucketCounts;
  }

  @Override
  public String toString() {
    return "DistributionData{"
         + "mean=" + mean + ", "
         + "count=" + count + ", "
         + "min=" + min + ", "
         + "max=" + max + ", "
         + "sumOfSquaredDeviations=" + sumOfSquaredDeviations + ", "
         + "bucketCounts=" + bucketCounts
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AggregationData.DistributionData) {
      AggregationData.DistributionData that = (AggregationData.DistributionData) o;
      return (Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(that.getMean()))
           && (this.count == that.getCount())
           && (Double.doubleToLongBits(this.min) == Double.doubleToLongBits(that.getMin()))
           && (Double.doubleToLongBits(this.max) == Double.doubleToLongBits(that.getMax()))
           && (Double.doubleToLongBits(this.sumOfSquaredDeviations) == Double.doubleToLongBits(that.getSumOfSquaredDeviations()))
           && (this.bucketCounts.equals(that.getBucketCounts()));
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
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(min) >>> 32) ^ Double.doubleToLongBits(min));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(max) >>> 32) ^ Double.doubleToLongBits(max));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(sumOfSquaredDeviations) >>> 32) ^ Double.doubleToLongBits(sumOfSquaredDeviations));
    h$ *= 1000003;
    h$ ^= bucketCounts.hashCode();
    return h$;
  }

}
