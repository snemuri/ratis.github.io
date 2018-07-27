

package org.apache.ratis.shaded.io.opencensus.trace;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import org.apache.ratis.shaded.io.opencensus.common.ExperimentalApi;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_EndSpanOptions extends EndSpanOptions {

  private final boolean sampleToLocalSpanStore;
  private final Status status;

  private AutoValue_EndSpanOptions(
      boolean sampleToLocalSpanStore,
      @Nullable Status status) {
    this.sampleToLocalSpanStore = sampleToLocalSpanStore;
    this.status = status;
  }

  @ExperimentalApi
  @Override
  public boolean getSampleToLocalSpanStore() {
    return sampleToLocalSpanStore;
  }

  @Nullable
  @Override
  public Status getStatus() {
    return status;
  }

  @Override
  public String toString() {
    return "EndSpanOptions{"
         + "sampleToLocalSpanStore=" + sampleToLocalSpanStore + ", "
         + "status=" + status
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EndSpanOptions) {
      EndSpanOptions that = (EndSpanOptions) o;
      return (this.sampleToLocalSpanStore == that.getSampleToLocalSpanStore())
           && ((this.status == null) ? (that.getStatus() == null) : this.status.equals(that.getStatus()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= sampleToLocalSpanStore ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= (status == null) ? 0 : status.hashCode();
    return h$;
  }

  static final class Builder extends EndSpanOptions.Builder {
    private Boolean sampleToLocalSpanStore;
    private Status status;
    Builder() {
    }
    @Override
    public EndSpanOptions.Builder setSampleToLocalSpanStore(boolean sampleToLocalSpanStore) {
      this.sampleToLocalSpanStore = sampleToLocalSpanStore;
      return this;
    }
    @Override
    public EndSpanOptions.Builder setStatus(@Nullable Status status) {
      this.status = status;
      return this;
    }
    @Override
    public EndSpanOptions build() {
      String missing = "";
      if (this.sampleToLocalSpanStore == null) {
        missing += " sampleToLocalSpanStore";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_EndSpanOptions(
          this.sampleToLocalSpanStore,
          this.status);
    }
  }

}
