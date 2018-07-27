

package org.apache.ratis.shaded.io.opencensus.trace.export;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import org.apache.ratis.shaded.io.opencensus.trace.Status;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_SampledSpanStore_ErrorFilter extends SampledSpanStore.ErrorFilter {

  private final String spanName;
  private final Status.CanonicalCode canonicalCode;
  private final int maxSpansToReturn;

  AutoValue_SampledSpanStore_ErrorFilter(
      String spanName,
      @Nullable Status.CanonicalCode canonicalCode,
      int maxSpansToReturn) {
    if (spanName == null) {
      throw new NullPointerException("Null spanName");
    }
    this.spanName = spanName;
    this.canonicalCode = canonicalCode;
    this.maxSpansToReturn = maxSpansToReturn;
  }

  @Override
  public String getSpanName() {
    return spanName;
  }

  @Nullable
  @Override
  public Status.CanonicalCode getCanonicalCode() {
    return canonicalCode;
  }

  @Override
  public int getMaxSpansToReturn() {
    return maxSpansToReturn;
  }

  @Override
  public String toString() {
    return "ErrorFilter{"
         + "spanName=" + spanName + ", "
         + "canonicalCode=" + canonicalCode + ", "
         + "maxSpansToReturn=" + maxSpansToReturn
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SampledSpanStore.ErrorFilter) {
      SampledSpanStore.ErrorFilter that = (SampledSpanStore.ErrorFilter) o;
      return (this.spanName.equals(that.getSpanName()))
           && ((this.canonicalCode == null) ? (that.getCanonicalCode() == null) : this.canonicalCode.equals(that.getCanonicalCode()))
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
    h$ ^= (canonicalCode == null) ? 0 : canonicalCode.hashCode();
    h$ *= 1000003;
    h$ ^= maxSpansToReturn;
    return h$;
  }

}
