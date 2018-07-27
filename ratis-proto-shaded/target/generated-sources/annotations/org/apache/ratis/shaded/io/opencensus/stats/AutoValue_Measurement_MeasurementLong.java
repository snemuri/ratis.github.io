

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Measurement_MeasurementLong extends Measurement.MeasurementLong {

  private final Measure.MeasureLong measure;
  private final long value;

  AutoValue_Measurement_MeasurementLong(
      Measure.MeasureLong measure,
      long value) {
    if (measure == null) {
      throw new NullPointerException("Null measure");
    }
    this.measure = measure;
    this.value = value;
  }

  @Override
  public Measure.MeasureLong getMeasure() {
    return measure;
  }

  @Override
  public long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "MeasurementLong{"
         + "measure=" + measure + ", "
         + "value=" + value
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Measurement.MeasurementLong) {
      Measurement.MeasurementLong that = (Measurement.MeasurementLong) o;
      return (this.measure.equals(that.getMeasure()))
           && (this.value == that.getValue());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= measure.hashCode();
    h$ *= 1000003;
    h$ ^= (int) ((value >>> 32) ^ value);
    return h$;
  }

}
