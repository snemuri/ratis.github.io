

package org.apache.ratis.shaded.io.opencensus.trace.export;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;
import org.apache.ratis.shaded.io.opencensus.trace.Link;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_SpanData_Links extends SpanData.Links {

  private final List<Link> links;
  private final int droppedLinksCount;

  AutoValue_SpanData_Links(
      List<Link> links,
      int droppedLinksCount) {
    if (links == null) {
      throw new NullPointerException("Null links");
    }
    this.links = links;
    this.droppedLinksCount = droppedLinksCount;
  }

  @Override
  public List<Link> getLinks() {
    return links;
  }

  @Override
  public int getDroppedLinksCount() {
    return droppedLinksCount;
  }

  @Override
  public String toString() {
    return "Links{"
         + "links=" + links + ", "
         + "droppedLinksCount=" + droppedLinksCount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpanData.Links) {
      SpanData.Links that = (SpanData.Links) o;
      return (this.links.equals(that.getLinks()))
           && (this.droppedLinksCount == that.getDroppedLinksCount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= links.hashCode();
    h$ *= 1000003;
    h$ ^= droppedLinksCount;
    return h$;
  }

}
