

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_View_Name extends View.Name {

  private final String asString;

  AutoValue_View_Name(
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
    return "Name{"
         + "asString=" + asString
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof View.Name) {
      View.Name that = (View.Name) o;
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
