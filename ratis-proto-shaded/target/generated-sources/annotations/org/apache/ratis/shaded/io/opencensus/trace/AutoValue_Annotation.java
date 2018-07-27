

package org.apache.ratis.shaded.io.opencensus.trace;

import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Annotation extends Annotation {

  private final String description;
  private final Map<String, AttributeValue> attributes;

  AutoValue_Annotation(
      String description,
      Map<String, AttributeValue> attributes) {
    if (description == null) {
      throw new NullPointerException("Null description");
    }
    this.description = description;
    if (attributes == null) {
      throw new NullPointerException("Null attributes");
    }
    this.attributes = attributes;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public Map<String, AttributeValue> getAttributes() {
    return attributes;
  }

  @Override
  public String toString() {
    return "Annotation{"
         + "description=" + description + ", "
         + "attributes=" + attributes
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Annotation) {
      Annotation that = (Annotation) o;
      return (this.description.equals(that.getDescription()))
           && (this.attributes.equals(that.getAttributes()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= description.hashCode();
    h$ *= 1000003;
    h$ ^= attributes.hashCode();
    return h$;
  }

}
