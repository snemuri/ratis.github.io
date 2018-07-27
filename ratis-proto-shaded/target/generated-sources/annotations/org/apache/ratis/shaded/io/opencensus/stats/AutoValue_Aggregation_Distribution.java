

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Aggregation_Distribution extends Aggregation.Distribution {

  private final BucketBoundaries bucketBoundaries;

  AutoValue_Aggregation_Distribution(
      BucketBoundaries bucketBoundaries) {
    if (bucketBoundaries == null) {
      throw new NullPointerException("Null bucketBoundaries");
    }
    this.bucketBoundaries = bucketBoundaries;
  }

  @Override
  public BucketBoundaries getBucketBoundaries() {
    return bucketBoundaries;
  }

  @Override
  public String toString() {
    return "Distribution{"
         + "bucketBoundaries=" + bucketBoundaries
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Aggregation.Distribution) {
      Aggregation.Distribution that = (Aggregation.Distribution) o;
      return (this.bucketBoundaries.equals(that.getBucketBoundaries()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= bucketBoundaries.hashCode();
    return h$;
  }

}
