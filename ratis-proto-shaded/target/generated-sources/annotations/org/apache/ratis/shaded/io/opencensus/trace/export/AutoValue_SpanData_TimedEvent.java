

package org.apache.ratis.shaded.io.opencensus.trace.export;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;
import org.apache.ratis.shaded.io.opencensus.common.Timestamp;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_SpanData_TimedEvent<T> extends SpanData.TimedEvent<T> {

  private final Timestamp timestamp;
  private final T event;

  AutoValue_SpanData_TimedEvent(
      Timestamp timestamp,
      T event) {
    if (timestamp == null) {
      throw new NullPointerException("Null timestamp");
    }
    this.timestamp = timestamp;
    if (event == null) {
      throw new NullPointerException("Null event");
    }
    this.event = event;
  }

  @Override
  public Timestamp getTimestamp() {
    return timestamp;
  }

  @Override
  public T getEvent() {
    return event;
  }

  @Override
  public String toString() {
    return "TimedEvent{"
         + "timestamp=" + timestamp + ", "
         + "event=" + event
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpanData.TimedEvent) {
      SpanData.TimedEvent<?> that = (SpanData.TimedEvent<?>) o;
      return (this.timestamp.equals(that.getTimestamp()))
           && (this.event.equals(that.getEvent()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= timestamp.hashCode();
    h$ *= 1000003;
    h$ ^= event.hashCode();
    return h$;
  }

}
