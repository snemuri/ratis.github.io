

package org.apache.ratis.shaded.io.opencensus.tags;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_TagValue extends TagValue {

  private final String asString;

  AutoValue_TagValue(
      String asString) {
    if (asString == null) {
      throw new NullPointerException("Null asString");
    }
    this.asString = asString;
  }

  @Override
  public String asString() {
    return asString;
  }

  @Override
  public String toString() {
    return "TagValue{"
         + "asString=" + asString
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TagValue) {
      TagValue that = (TagValue) o;
      return (this.asString.equals(that.asString()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= asString.hashCode();
    return h$;
  }

}
