

package org.apache.ratis.shaded.io.opencensus.trace.export;

import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;
import org.apache.ratis.shaded.io.opencensus.trace.Status;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_SampledSpanStore_PerSpanNameSummary extends SampledSpanStore.PerSpanNameSummary {

  private final Map<SampledSpanStore.LatencyBucketBoundaries, Integer> numbersOfLatencySampledSpans;
  private final Map<Status.CanonicalCode, Integer> numbersOfErrorSampledSpans;

  AutoValue_SampledSpanStore_PerSpanNameSummary(
      Map<SampledSpanStore.LatencyBucketBoundaries, Integer> numbersOfLatencySampledSpans,
      Map<Status.CanonicalCode, Integer> numbersOfErrorSampledSpans) {
    if (numbersOfLatencySampledSpans == null) {
      throw new NullPointerException("Null numbersOfLatencySampledSpans");
    }
    this.numbersOfLatencySampledSpans = numbersOfLatencySampledSpans;
    if (numbersOfErrorSampledSpans == null) {
      throw new NullPointerException("Null numbersOfErrorSampledSpans");
    }
    this.numbersOfErrorSampledSpans = numbersOfErrorSampledSpans;
  }

  @Override
  public Map<SampledSpanStore.LatencyBucketBoundaries, Integer> getNumbersOfLatencySampledSpans() {
    return numbersOfLatencySampledSpans;
  }

  @Override
  public Map<Status.CanonicalCode, Integer> getNumbersOfErrorSampledSpans() {
    return numbersOfErrorSampledSpans;
  }

  @Override
  public String toString() {
    return "PerSpanNameSummary{"
         + "numbersOfLatencySampledSpans=" + numbersOfLatencySampledSpans + ", "
         + "numbersOfErrorSampledSpans=" + numbersOfErrorSampledSpans
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SampledSpanStore.PerSpanNameSummary) {
      SampledSpanStore.PerSpanNameSummary that = (SampledSpanStore.PerSpanNameSummary) o;
      return (this.numbersOfLatencySampledSpans.equals(that.getNumbersOfLatencySampledSpans()))
           && (this.numbersOfErrorSampledSpans.equals(that.getNumbersOfErrorSampledSpans()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= numbersOfLatencySampledSpans.hashCode();
    h$ *= 1000003;
    h$ ^= numbersOfErrorSampledSpans.hashCode();
    return h$;
  }

}
