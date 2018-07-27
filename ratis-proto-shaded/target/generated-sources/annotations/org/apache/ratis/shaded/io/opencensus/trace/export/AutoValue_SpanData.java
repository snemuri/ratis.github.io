

package org.apache.ratis.shaded.io.opencensus.trace.export;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import org.apache.ratis.shaded.io.opencensus.common.Timestamp;
import org.apache.ratis.shaded.io.opencensus.trace.Annotation;
import org.apache.ratis.shaded.io.opencensus.trace.MessageEvent;
import org.apache.ratis.shaded.io.opencensus.trace.SpanContext;
import org.apache.ratis.shaded.io.opencensus.trace.SpanId;
import org.apache.ratis.shaded.io.opencensus.trace.Status;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_SpanData extends SpanData {

  private final SpanContext context;
  private final SpanId parentSpanId;
  private final Boolean hasRemoteParent;
  private final String name;
  private final Timestamp startTimestamp;
  private final SpanData.Attributes attributes;
  private final SpanData.TimedEvents<Annotation> annotations;
  private final SpanData.TimedEvents<MessageEvent> messageEvents;
  private final SpanData.Links links;
  private final Integer childSpanCount;
  private final Status status;
  private final Timestamp endTimestamp;

  AutoValue_SpanData(
      SpanContext context,
      @Nullable SpanId parentSpanId,
      @Nullable Boolean hasRemoteParent,
      String name,
      Timestamp startTimestamp,
      SpanData.Attributes attributes,
      SpanData.TimedEvents<Annotation> annotations,
      SpanData.TimedEvents<MessageEvent> messageEvents,
      SpanData.Links links,
      @Nullable Integer childSpanCount,
      @Nullable Status status,
      @Nullable Timestamp endTimestamp) {
    if (context == null) {
      throw new NullPointerException("Null context");
    }
    this.context = context;
    this.parentSpanId = parentSpanId;
    this.hasRemoteParent = hasRemoteParent;
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (startTimestamp == null) {
      throw new NullPointerException("Null startTimestamp");
    }
    this.startTimestamp = startTimestamp;
    if (attributes == null) {
      throw new NullPointerException("Null attributes");
    }
    this.attributes = attributes;
    if (annotations == null) {
      throw new NullPointerException("Null annotations");
    }
    this.annotations = annotations;
    if (messageEvents == null) {
      throw new NullPointerException("Null messageEvents");
    }
    this.messageEvents = messageEvents;
    if (links == null) {
      throw new NullPointerException("Null links");
    }
    this.links = links;
    this.childSpanCount = childSpanCount;
    this.status = status;
    this.endTimestamp = endTimestamp;
  }

  @Override
  public SpanContext getContext() {
    return context;
  }

  @Nullable
  @Override
  public SpanId getParentSpanId() {
    return parentSpanId;
  }

  @Nullable
  @Override
  public Boolean getHasRemoteParent() {
    return hasRemoteParent;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Timestamp getStartTimestamp() {
    return startTimestamp;
  }

  @Override
  public SpanData.Attributes getAttributes() {
    return attributes;
  }

  @Override
  public SpanData.TimedEvents<Annotation> getAnnotations() {
    return annotations;
  }

  @Override
  public SpanData.TimedEvents<MessageEvent> getMessageEvents() {
    return messageEvents;
  }

  @Override
  public SpanData.Links getLinks() {
    return links;
  }

  @Nullable
  @Override
  public Integer getChildSpanCount() {
    return childSpanCount;
  }

  @Nullable
  @Override
  public Status getStatus() {
    return status;
  }

  @Nullable
  @Override
  public Timestamp getEndTimestamp() {
    return endTimestamp;
  }

  @Override
  public String toString() {
    return "SpanData{"
         + "context=" + context + ", "
         + "parentSpanId=" + parentSpanId + ", "
         + "hasRemoteParent=" + hasRemoteParent + ", "
         + "name=" + name + ", "
         + "startTimestamp=" + startTimestamp + ", "
         + "attributes=" + attributes + ", "
         + "annotations=" + annotations + ", "
         + "messageEvents=" + messageEvents + ", "
         + "links=" + links + ", "
         + "childSpanCount=" + childSpanCount + ", "
         + "status=" + status + ", "
         + "endTimestamp=" + endTimestamp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpanData) {
      SpanData that = (SpanData) o;
      return (this.context.equals(that.getContext()))
           && ((this.parentSpanId == null) ? (that.getParentSpanId() == null) : this.parentSpanId.equals(that.getParentSpanId()))
           && ((this.hasRemoteParent == null) ? (that.getHasRemoteParent() == null) : this.hasRemoteParent.equals(that.getHasRemoteParent()))
           && (this.name.equals(that.getName()))
           && (this.startTimestamp.equals(that.getStartTimestamp()))
           && (this.attributes.equals(that.getAttributes()))
           && (this.annotations.equals(that.getAnnotations()))
           && (this.messageEvents.equals(that.getMessageEvents()))
           && (this.links.equals(that.getLinks()))
           && ((this.childSpanCount == null) ? (that.getChildSpanCount() == null) : this.childSpanCount.equals(that.getChildSpanCount()))
           && ((this.status == null) ? (that.getStatus() == null) : this.status.equals(that.getStatus()))
           && ((this.endTimestamp == null) ? (that.getEndTimestamp() == null) : this.endTimestamp.equals(that.getEndTimestamp()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= context.hashCode();
    h$ *= 1000003;
    h$ ^= (parentSpanId == null) ? 0 : parentSpanId.hashCode();
    h$ *= 1000003;
    h$ ^= (hasRemoteParent == null) ? 0 : hasRemoteParent.hashCode();
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= startTimestamp.hashCode();
    h$ *= 1000003;
    h$ ^= attributes.hashCode();
    h$ *= 1000003;
    h$ ^= annotations.hashCode();
    h$ *= 1000003;
    h$ ^= messageEvents.hashCode();
    h$ *= 1000003;
    h$ ^= links.hashCode();
    h$ *= 1000003;
    h$ ^= (childSpanCount == null) ? 0 : childSpanCount.hashCode();
    h$ *= 1000003;
    h$ ^= (status == null) ? 0 : status.hashCode();
    h$ *= 1000003;
    h$ ^= (endTimestamp == null) ? 0 : endTimestamp.hashCode();
    return h$;
  }

}
