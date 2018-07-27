

package org.apache.ratis.shaded.io.opencensus.trace.export;

import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_SampledSpanStore_Summary extends SampledSpanStore.Summary {

  private final Map<String, SampledSpanStore.PerSpanNameSummary> perSpanNameSummary;

  AutoValue_SampledSpanStore_Summary(
      Map<String, SampledSpanStore.PerSpanNameSummary> perSpanNameSummary) {
    if (perSpanNameSummary == null) {
      throw new NullPointerException("Null perSpanNameSummary");
    }
    this.perSpanNameSummary = perSpanNameSummary;
  }

  @Override
  public Map<String, SampledSpanStore.PerSpanNameSummary> getPerSpanNameSummary() {
    return perSpanNameSummary;
  }

  @Override
  public String toString() {
    return "Summary{"
         + "perSpanNameSummary=" + perSpanNameSummary
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SampledSpanStore.Summary) {
      SampledSpanStore.Summary that = (SampledSpanStore.Summary) o;
      return (this.perSpanNameSummary.equals(that.getPerSpanNameSummary()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= perSpanNameSummary.hashCode();
    return h$;
  }

}
