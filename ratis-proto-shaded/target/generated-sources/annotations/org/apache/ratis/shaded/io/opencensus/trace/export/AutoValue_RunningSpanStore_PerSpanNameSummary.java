

package org.apache.ratis.shaded.io.opencensus.trace.export;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_RunningSpanStore_PerSpanNameSummary extends RunningSpanStore.PerSpanNameSummary {

  private final int numRunningSpans;

  AutoValue_RunningSpanStore_PerSpanNameSummary(
      int numRunningSpans) {
    this.numRunningSpans = numRunningSpans;
  }

  @Override
  public int getNumRunningSpans() {
    return numRunningSpans;
  }

  @Override
  public String toString() {
    return "PerSpanNameSummary{"
         + "numRunningSpans=" + numRunningSpans
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RunningSpanStore.PerSpanNameSummary) {
      RunningSpanStore.PerSpanNameSummary that = (RunningSpanStore.PerSpanNameSummary) o;
      return (this.numRunningSpans == that.getNumRunningSpans());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= numRunningSpans;
    return h$;
  }

}
