

package org.apache.ratis.shaded.io.opencensus.trace;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AttributeValue_AttributeValueBoolean extends AttributeValue.AttributeValueBoolean {

  private final Boolean booleanValue;

  AutoValue_AttributeValue_AttributeValueBoolean(
      Boolean booleanValue) {
    if (booleanValue == null) {
      throw new NullPointerException("Null booleanValue");
    }
    this.booleanValue = booleanValue;
  }

  @Override
  Boolean getBooleanValue() {
    return booleanValue;
  }

  @Override
  public String toString() {
    return "AttributeValueBoolean{"
         + "booleanValue=" + booleanValue
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AttributeValue.AttributeValueBoolean) {
      AttributeValue.AttributeValueBoolean that = (AttributeValue.AttributeValueBoolean) o;
      return (this.booleanValue.equals(that.getBooleanValue()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= booleanValue.hashCode();
    return h$;
  }

}
