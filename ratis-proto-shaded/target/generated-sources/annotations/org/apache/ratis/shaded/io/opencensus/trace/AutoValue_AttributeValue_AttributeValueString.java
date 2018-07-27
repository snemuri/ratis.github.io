

package org.apache.ratis.shaded.io.opencensus.trace;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AttributeValue_AttributeValueString extends AttributeValue.AttributeValueString {

  private final String stringValue;

  AutoValue_AttributeValue_AttributeValueString(
      String stringValue) {
    if (stringValue == null) {
      throw new NullPointerException("Null stringValue");
    }
    this.stringValue = stringValue;
  }

  @Override
  String getStringValue() {
    return stringValue;
  }

  @Override
  public String toString() {
    return "AttributeValueString{"
         + "stringValue=" + stringValue
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AttributeValue.AttributeValueString) {
      AttributeValue.AttributeValueString that = (AttributeValue.AttributeValueString) o;
      return (this.stringValue.equals(that.getStringValue()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= stringValue.hashCode();
    return h$;
  }

}
