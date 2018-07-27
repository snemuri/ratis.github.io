

package org.apache.ratis.shaded.io.opencensus.stats;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_BucketBoundaries extends BucketBoundaries {

  private final List<Double> boundaries;

  AutoValue_BucketBoundaries(
      List<Double> boundaries) {
    if (boundaries == null) {
      throw new NullPointerException("Null boundaries");
    }
    this.boundaries = boundaries;
  }

  @Override
  public List<Double> getBoundaries() {
    return boundaries;
  }

  @Override
  public String toString() {
    return "BucketBoundaries{"
         + "boundaries=" + boundaries
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BucketBoundaries) {
      BucketBoundaries that = (BucketBoundaries) o;
      return (this.boundaries.equals(that.getBoundaries()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= boundaries.hashCode();
    return h$;
  }

}
