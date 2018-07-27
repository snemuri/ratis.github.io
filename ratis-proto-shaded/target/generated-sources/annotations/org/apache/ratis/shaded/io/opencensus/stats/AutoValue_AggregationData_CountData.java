

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AggregationData_CountData extends AggregationData.CountData {

  private final long count;

  AutoValue_AggregationData_CountData(
      long count) {
    this.count = count;
  }

  @Override
  public long getCount() {
    return count;
  }

  @Override
  public String toString() {
    return "CountData{"
         + "count=" + count
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AggregationData.CountData) {
      AggregationData.CountData that = (AggregationData.CountData) o;
      return (this.count == that.getCount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (int) ((count >>> 32) ^ count);
    return h$;
  }

}
