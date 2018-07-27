

package org.apache.ratis.shaded.io.opencensus.stats;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;
import org.apache.ratis.shaded.io.opencensus.tags.TagKey;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_View extends View {

  private final View.Name name;
  private final String description;
  private final Measure measure;
  private final Aggregation aggregation;
  private final List<TagKey> columns;
  private final View.AggregationWindow window;

  AutoValue_View(
      View.Name name,
      String description,
      Measure measure,
      Aggregation aggregation,
      List<TagKey> columns,
      View.AggregationWindow window) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (description == null) {
      throw new NullPointerException("Null description");
    }
    this.description = description;
    if (measure == null) {
      throw new NullPointerException("Null measure");
    }
    this.measure = measure;
    if (aggregation == null) {
      throw new NullPointerException("Null aggregation");
    }
    this.aggregation = aggregation;
    if (columns == null) {
      throw new NullPointerException("Null columns");
    }
    this.columns = columns;
    if (window == null) {
      throw new NullPointerException("Null window");
    }
    this.window = window;
  }

  @Override
  public View.Name getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public Measure getMeasure() {
    return measure;
  }

  @Override
  public Aggregation getAggregation() {
    return aggregation;
  }

  @Override
  public List<TagKey> getColumns() {
    return columns;
  }

  @Override
  public View.AggregationWindow getWindow() {
    return window;
  }

  @Override
  public String toString() {
    return "View{"
         + "name=" + name + ", "
         + "description=" + description + ", "
         + "measure=" + measure + ", "
         + "aggregation=" + aggregation + ", "
         + "columns=" + columns + ", "
         + "window=" + window
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof View) {
      View that = (View) o;
      return (this.name.equals(that.getName()))
           && (this.description.equals(that.getDescription()))
           && (this.measure.equals(that.getMeasure()))
           && (this.aggregation.equals(that.getAggregation()))
           && (this.columns.equals(that.getColumns()))
           && (this.window.equals(that.getWindow()));
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
    h$ ^= measure.hashCode();
    h$ *= 1000003;
    h$ ^= aggregation.hashCode();
    h$ *= 1000003;
    h$ ^= columns.hashCode();
    h$ *= 1000003;
    h$ ^= window.hashCode();
    return h$;
  }

}
