

package org.apache.ratis.shaded.io.opencensus.stats;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Measure_MeasureDouble extends Measure.MeasureDouble {

  private final String name;
  private final String description;
  private final String unit;

  AutoValue_Measure_MeasureDouble(
      String name,
      String description,
      String unit) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (description == null) {
      throw new NullPointerException("Null description");
    }
    this.description = description;
    if (unit == null) {
      throw new NullPointerException("Null unit");
    }
    this.unit = unit;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public String getUnit() {
    return unit;
  }

  @Override
  public String toString() {
    return "MeasureDouble{"
         + "name=" + name + ", "
         + "description=" + description + ", "
         + "unit=" + unit
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Measure.MeasureDouble) {
      Measure.MeasureDouble that = (Measure.MeasureDouble) o;
      return (this.name.equals(that.getName()))
           && (this.description.equals(that.getDescription()))
           && (this.unit.equals(that.getUnit()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= description.hashCode();
    h$ *= 1000003;
    h$ ^= unit.hashCode();
    return h$;
  }

}
