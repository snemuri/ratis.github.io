

package org.apache.ratis.shaded.io.opencensus.trace.export;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_SpanData_TimedEvents<T> extends SpanData.TimedEvents<T> {

  private final List<SpanData.TimedEvent<T>> events;
  private final int droppedEventsCount;

  AutoValue_SpanData_TimedEvents(
      List<SpanData.TimedEvent<T>> events,
      int droppedEventsCount) {
    if (events == null) {
      throw new NullPointerException("Null events");
    }
    this.events = events;
    this.droppedEventsCount = droppedEventsCount;
  }

  @Override
  public List<SpanData.TimedEvent<T>> getEvents() {
    return events;
  }

  @Override
  public int getDroppedEventsCount() {
    return droppedEventsCount;
  }

  @Override
  public String toString() {
    return "TimedEvents{"
         + "events=" + events + ", "
         + "droppedEventsCount=" + droppedEventsCount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpanData.TimedEvents) {
      SpanData.TimedEvents<?> that = (SpanData.TimedEvents<?>) o;
      return (this.events.equals(that.getEvents()))
           && (this.droppedEventsCount == that.getDroppedEventsCount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= events.hashCode();
    h$ *= 1000003;
    h$ ^= droppedEventsCount;
    return h$;
  }

}
