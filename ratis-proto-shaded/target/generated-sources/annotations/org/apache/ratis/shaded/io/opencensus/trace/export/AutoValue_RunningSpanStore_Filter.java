

package org.apache.ratis.shaded.io.opencensus.trace.export;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_RunningSpanStore_Filter extends RunningSpanStore.Filter {

  private final String spanName;
  private final int maxSpansToReturn;

  AutoValue_RunningSpanStore_Filter(
      String spanName,
      int maxSpansToReturn) {
    if (spanName == null) {
      throw new NullPointerException("Null spanName");
    }
    this.spanName = spanName;
    this.maxSpansToReturn = maxSpansToReturn;
  }

  @Override
  public String getSpanName() {
    return spanName;
  }

  @Override
  public int getMaxSpansToReturn() {
    return maxSpansToReturn;
  }

  @Override
  public String toString() {
    return "Filter{"
         + "spanName=" + spanName + ", "
         + "maxSpansToReturn=" + maxSpansToReturn
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RunningSpanStore.Filter) {
      RunningSpanStore.Filter that = (RunningSpanStore.Filter) o;
      return (this.spanName.equals(that.getSpanName()))
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
    h$ ^= maxSpansToReturn;
    return h$;
  }

}
