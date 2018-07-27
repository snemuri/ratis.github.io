

package org.apache.ratis.shaded.io.opencensus.trace;

import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Link extends Link {

  private final TraceId traceId;
  private final SpanId spanId;
  private final Link.Type type;
  private final Map<String, AttributeValue> attributes;

  AutoValue_Link(
      TraceId traceId,
      SpanId spanId,
      Link.Type type,
      Map<String, AttributeValue> attributes) {
    if (traceId == null) {
      throw new NullPointerException("Null traceId");
    }
    this.traceId = traceId;
    if (spanId == null) {
      throw new NullPointerException("Null spanId");
    }
    this.spanId = spanId;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    if (attributes == null) {
      throw new NullPointerException("Null attributes");
    }
    this.attributes = attributes;
  }

  @Override
  public TraceId getTraceId() {
    return traceId;
  }

  @Override
  public SpanId getSpanId() {
    return spanId;
  }

  @Override
  public Link.Type getType() {
    return type;
  }

  @Override
  public Map<String, AttributeValue> getAttributes() {
    return attributes;
  }

  @Override
  public String toString() {
    return "Link{"
         + "traceId=" + traceId + ", "
         + "spanId=" + spanId + ", "
         + "type=" + type + ", "
         + "attributes=" + attributes
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Link) {
      Link that = (Link) o;
      return (this.traceId.equals(that.getTraceId()))
           && (this.spanId.equals(that.getSpanId()))
           && (this.type.equals(that.getType()))
           && (this.attributes.equals(that.getAttributes()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= traceId.hashCode();
    h$ *= 1000003;
    h$ ^= spanId.hashCode();
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= attributes.hashCode();
    return h$;
  }

}
