

package org.apache.ratis.shaded.io.opencensus.trace.export;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_SampledSpanStore_LatencyFilter extends SampledSpanStore.LatencyFilter {

  private final String spanName;
  private final long latencyLowerNs;
  private final long latencyUpperNs;
  private final int maxSpansToReturn;

  AutoValue_SampledSpanStore_LatencyFilter(
      String spanName,
      long latencyLowerNs,
      long latencyUpperNs,
      int maxSpansToReturn) {
    if (spanName == null) {
      throw new NullPointerException("Null spanName");
    }
    this.spanName = spanName;
    this.latencyLowerNs = latencyLowerNs;
    this.latencyUpperNs = latencyUpperNs;
    this.maxSpansToReturn = maxSpansToReturn;
  }

  @Override
  public String getSpanName() {
    return spanName;
  }

  @Override
  public long getLatencyLowerNs() {
    return latencyLowerNs;
  }

  @Override
  public long getLatencyUpperNs() {
    return latencyUpperNs;
  }

  @Override
  public int getMaxSpansToReturn() {
    return maxSpansToReturn;
  }

  @Override
  public String toString() {
    return "LatencyFilter{"
         + "spanName=" + spanName + ", "
         + "latencyLowerNs=" + latencyLowerNs + ", "
         + "latencyUpperNs=" + latencyUpperNs + ", "
         + "maxSpansToReturn=" + maxSpansToReturn
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SampledSpanStore.LatencyFilter) {
      SampledSpanStore.LatencyFilter that = (SampledSpanStore.LatencyFilter) o;
      return (this.spanName.equals(that.getSpanName()))
           && (this.latencyLowerNs == that.getLatencyLowerNs())
           && (this.latencyUpperNs == that.getLatencyUpperNs())
           && (this.maxSpansToReturn == that.getMaxSpansToReturn());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= spanName.hashCode();
    h$ *= 1000003;
    h$ ^= (int) ((latencyLowerNs >>> 32) ^ latencyLowerNs);
    h$ *= 1000003;
    h$ ^= (int) ((latencyUpperNs >>> 32) ^ latencyUpperNs);
    h$ *= 1000003;
    h$ ^= maxSpansToReturn;
    return h$;
  }

}
