

package org.apache.ratis.shaded.io.opencensus.trace.export;

import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;
import org.apache.ratis.shaded.io.opencensus.trace.AttributeValue;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_SpanData_Attributes extends SpanData.Attributes {

  private final Map<String, AttributeValue> attributeMap;
  private final int droppedAttributesCount;

  AutoValue_SpanData_Attributes(
      Map<String, AttributeValue> attributeMap,
      int droppedAttributesCount) {
    if (attributeMap == null) {
      throw new NullPointerException("Null attributeMap");
    }
    this.attributeMap = attributeMap;
    this.droppedAttributesCount = droppedAttributesCount;
  }

  @Override
  public Map<String, AttributeValue> getAttributeMap() {
    return attributeMap;
  }

  @Override
  public int getDroppedAttributesCount() {
    return droppedAttributesCount;
  }

  @Override
  public String toString() {
    return "Attributes{"
         + "attributeMap=" + attributeMap + ", "
         + "droppedAttributesCount=" + droppedAttributesCount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpanData.Attributes) {
      SpanData.Attributes that = (SpanData.Attributes) o;
      return (this.attributeMap.equals(that.getAttributeMap()))
           && (this.droppedAttributesCount == that.getDroppedAttributesCount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= attributeMap.hashCode();
    h$ *= 1000003;
    h$ ^= droppedAttributesCount;
    return h$;
  }

}
