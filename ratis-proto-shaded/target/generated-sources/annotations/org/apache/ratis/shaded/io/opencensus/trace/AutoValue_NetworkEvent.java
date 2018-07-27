

package org.apache.ratis.shaded.io.opencensus.trace;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import org.apache.ratis.shaded.io.opencensus.common.Timestamp;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Deprecated
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_NetworkEvent extends NetworkEvent {

  private final Timestamp kernelTimestamp;
  private final NetworkEvent.Type type;
  private final long messageId;
  private final long uncompressedMessageSize;
  private final long compressedMessageSize;

  private AutoValue_NetworkEvent(
      @Nullable Timestamp kernelTimestamp,
      NetworkEvent.Type type,
      long messageId,
      long uncompressedMessageSize,
      long compressedMessageSize) {
    this.kernelTimestamp = kernelTimestamp;
    this.type = type;
    this.messageId = messageId;
    this.uncompressedMessageSize = uncompressedMessageSize;
    this.compressedMessageSize = compressedMessageSize;
  }

  @Nullable
  @Override
  public Timestamp getKernelTimestamp() {
    return kernelTimestamp;
  }

  @Override
  public NetworkEvent.Type getType() {
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
    return "NetworkEvent{"
         + "kernelTimestamp=" + kernelTimestamp + ", "
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
    if (o instanceof NetworkEvent) {
      NetworkEvent that = (NetworkEvent) o;
      return ((this.kernelTimestamp == null) ? (that.getKernelTimestamp() == null) : this.kernelTimestamp.equals(that.getKernelTimestamp()))
           && (this.type.equals(that.getType()))
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
    h$ ^= (kernelTimestamp == null) ? 0 : kernelTimestamp.hashCode();
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

  static final class Builder extends NetworkEvent.Builder {
    private Timestamp kernelTimestamp;
    private NetworkEvent.Type type;
    private Long messageId;
    private Long uncompressedMessageSize;
    private Long compressedMessageSize;
    Builder() {
    }
    @Override
    public NetworkEvent.Builder setKernelTimestamp(@Nullable Timestamp kernelTimestamp) {
      this.kernelTimestamp = kernelTimestamp;
      return this;
    }
    @Override
    NetworkEvent.Builder setType(NetworkEvent.Type type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    NetworkEvent.Builder setMessageId(long messageId) {
      this.messageId = messageId;
      return this;
    }
    @Override
    public NetworkEvent.Builder setUncompressedMessageSize(long uncompressedMessageSize) {
      this.uncompressedMessageSize = uncompressedMessageSize;
      return this;
    }
    @Override
    public NetworkEvent.Builder setCompressedMessageSize(long compressedMessageSize) {
      this.compressedMessageSize = compressedMessageSize;
      return this;
    }
    @Override
    public NetworkEvent build() {
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
      return new AutoValue_NetworkEvent(
          this.kernelTimestamp,
          this.type,
          this.messageId,
          this.uncompressedMessageSize,
          this.compressedMessageSize);
    }
  }

}
