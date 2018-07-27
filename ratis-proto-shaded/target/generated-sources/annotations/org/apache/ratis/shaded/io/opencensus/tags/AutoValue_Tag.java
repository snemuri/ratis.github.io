

package org.apache.ratis.shaded.io.opencensus.tags;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Tag extends Tag {

  private final TagKey key;
  private final TagValue value;

  AutoValue_Tag(
      TagKey key,
      TagValue value) {
    if (key == null) {
      throw new NullPointerException("Null key");
    }
    this.key = key;
    if (value == null) {
      throw new NullPointerException("Null value");
    }
    this.value = value;
  }

  @Override
  public TagKey getKey() {
    return key;
  }

  @Override
  public TagValue getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "Tag{"
         + "key=" + key + ", "
         + "value=" + value
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Tag) {
      Tag that = (Tag) o;
      return (this.key.equals(that.getKey()))
           && (this.value.equals(that.getValue()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= key.hashCode();
    h$ *= 1000003;
    h$ ^= value.hashCode();
    return h$;
  }

}
