

package org.apache.ratis.shaded.io.opencensus.trace;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AttributeValue_AttributeValueLong extends AttributeValue.AttributeValueLong {

  private final Long longValue;

  AutoValue_AttributeValue_AttributeValueLong(
      Long longValue) {
    if (longValue == null) {
      throw new NullPointerException("Null longValue");
    }
    this.longValue = longValue;
  }

  @Override
  Long getLongValue() {
    return longValue;
  }

  @Override
  public String toString() {
    return "AttributeValueLong{"
         + "longValue=" + longValue
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AttributeValue.AttributeValueLong) {
      AttributeValue.AttributeValueLong that = (AttributeValue.AttributeValueLong) o;
      return (this.longValue.equals(that.getLongValue()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= longValue.hashCode();
    return h$;
  }

}
