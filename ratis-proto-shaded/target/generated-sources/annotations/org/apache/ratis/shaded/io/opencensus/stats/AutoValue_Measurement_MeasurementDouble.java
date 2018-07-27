

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Measurement_MeasurementDouble extends Measurement.MeasurementDouble {

  private final Measure.MeasureDouble measure;
  private final double value;

  AutoValue_Measurement_MeasurementDouble(
      Measure.MeasureDouble measure,
      double value) {
    if (measure == null) {
      throw new NullPointerException("Null measure");
    }
    this.measure = measure;
    this.value = value;
  }

  @Override
  public Measure.MeasureDouble getMeasure() {
    return measure;
  }

  @Override
  public double getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "MeasurementDouble{"
         + "measure=" + measure + ", "
         + "value=" + value
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Measurement.MeasurementDouble) {
      Measurement.MeasurementDouble that = (Measurement.MeasurementDouble) o;
      return (this.measure.equals(that.getMeasure()))
           && (Double.doubleToLongBits(this.value) == Double.doubleToLongBits(that.getValue()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= measure.hashCode();
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(value) >>> 32) ^ Double.doubleToLongBits(value));
    return h$;
  }

}
