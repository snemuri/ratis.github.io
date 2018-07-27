

package org.apache.ratis.shaded.io.opencensus.trace;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness", "deprecation"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_MessageEvent extends MessageEvent {

  private final MessageEvent.Type type;
  private final long messageId;
  private final long uncompressedMessageSize;
  private final long compressedMessageSize;

  private AutoValue_MessageEvent(
      MessageEvent.Type type,
      long messageId,
      long uncompressedMessageSize,
      long compressedMessageSize) {
    this.type = type;
    this.messageId = messageId;
    this.uncompressedMessageSize = uncompressedMessageSize;
    this.compressedMessageSize = compressedMessageSize;
  }

  @Override
  public MessageEvent.Type getType() {
    return type;
  }

  @Override
  public long getMessageId() {
    return messageId;
  }

  @Override
  public long getUncompressedMessageSize() {
    return uncompressedMessageSize;
  }

  @Override
  public long getCompressedMessageSize() {
    return compressedMessageSize;
  }

  @Override
  public String toString() {
    return "MessageEvent{"
         + "type=" + type + ", "
         + "messageId=" + messageId + ", "
         + "uncompressedMessageSize=" + uncompressedMessageSize + ", "
         + "compressedMessageSize=" + compressedMessageSize
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MessageEvent) {
      MessageEvent that = (MessageEvent) o;
      return (this.type.equals(that.getType()))
           && (this.messageId == that.getMessageId())
           && (this.uncompressedMessageSize == that.getUncompressedMessageSize())
           && (this.compressedMessageSize == that.getCompressedMessageSize());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= (int) ((messageId >>> 32) ^ messageId);
    h$ *= 1000003;
    h$ ^= (int) ((uncompressedMessageSize >>> 32) ^ uncompressedMessageSize);
    h$ *= 1000003;
    h$ ^= (int) ((compressedMessageSize >>> 32) ^ compressedMessageSize);
    return h$;
  }

  static final class Builder extends MessageEvent.Builder {
    private MessageEvent.Type type;
    private Long messageId;
    private Long uncompressedMessageSize;
    private Long compressedMessageSize;
    Builder() {
    }
    @Override
    MessageEvent.Builder setType(MessageEvent.Type type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    MessageEvent.Builder setMessageId(long messageId) {
      this.messageId = messageId;
      return this;
    }
    @Override
    public MessageEvent.Builder setUncompressedMessageSize(long uncompressedMessageSize) {
      this.uncompressedMessageSize = uncompressedMessageSize;
      return this;
    }
    @Override
    public MessageEvent.Builder setCompressedMessageSize(long compressedMessageSize) {
      this.compressedMessageSize = compressedMessageSize;
      return this;
    }
    @Override
    public MessageEvent build() {
      String missing = "";
      if (this.type == null) {
        missing += " type";
      }
      if (this.messageId == null) {
        missing += " messageId";
      }
      if (this.uncompressedMessageSize == null) {
        missing += " uncompressedMessageSize";
      }
      if (this.compressedMessageSize == null) {
        missing += " compressedMessageSize";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MessageEvent(
          this.type,
          this.messageId,
          this.uncompressedMessageSize,
          this.compressedMessageSize);
    }
  }

}
