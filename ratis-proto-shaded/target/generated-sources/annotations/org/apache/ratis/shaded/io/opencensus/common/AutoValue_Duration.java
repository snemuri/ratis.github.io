

package org.apache.ratis.shaded.io.opencensus.common;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Duration extends Duration {

  private final long seconds;
  private final int nanos;

  AutoValue_Duration(
      long seconds,
      int nanos) {
    this.seconds = seconds;
    this.nanos = nanos;
  }

  @Override
  public long getSeconds() {
    return seconds;
  }

  @Override
  public int getNanos() {
    return nanos;
  }

  @Override
  public String toString() {
    return "Duration{"
         + "seconds=" + seconds + ", "
         + "nanos=" + nanos
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Duration) {
      Duration that = (Duration) o;
      return (this.seconds == that.getSeconds())
           && (this.nanos == that.getNanos());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (int) ((seconds >>> 32) ^ seconds);
    h$ *= 1000003;
    h$ ^= nanos;
    return h$;
  }

}
