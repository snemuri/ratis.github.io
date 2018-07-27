

package org.apache.ratis.shaded.io.opencensus.trace.samplers;

import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_ProbabilitySampler extends ProbabilitySampler {

  private final double probability;
  private final long idUpperBound;

  AutoValue_ProbabilitySampler(
      double probability,
      long idUpperBound) {
    this.probability = probability;
    this.idUpperBound = idUpperBound;
  }

  @Override
  double getProbability() {
    return probability;
  }

  @Override
  long getIdUpperBound() {
    return idUpperBound;
  }

  @Override
  public String toString() {
    return "ProbabilitySampler{"
         + "probability=" + probability + ", "
         + "idUpperBound=" + idUpperBound
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProbabilitySampler) {
      ProbabilitySampler that = (ProbabilitySampler) o;
      return (Double.doubleToLongBits(this.probability) == Double.doubleToLongBits(that.getProbability()))
           && (this.idUpperBound == that.getIdUpperBound());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(probability) >>> 32) ^ Double.doubleToLongBits(probability));
    h$ *= 1000003;
    h$ ^= (int) ((idUpperBound >>> 32) ^ idUpperBound);
    return h$;
  }

}
