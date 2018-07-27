

package org.apache.ratis.shaded.io.opencensus.stats;

import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.concurrent.Immutable;
import org.apache.ratis.shaded.io.opencensus.tags.TagValue;

@Immutable
@SuppressWarnings(value = {"nullness"})
@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_ViewData extends ViewData {

  private final View view;
  private final Map<List<TagValue>, AggregationData> aggregationMap;
  private final ViewData.AggregationWindowData windowData;

  AutoValue_ViewData(
      View view,
      Map<List<TagValue>, AggregationData> aggregationMap,
      ViewData.AggregationWindowData windowData) {
    if (view == null) {
      throw new NullPointerException("Null view");
    }
    this.view = view;
    if (aggregationMap == null) {
      throw new NullPointerException("Null aggregationMap");
    }
    this.aggregationMap = aggregationMap;
    if (windowData == null) {
      throw new NullPointerException("Null windowData");
    }
    this.windowData = windowData;
  }

  @Override
  public View getView() {
    return view;
  }

  @Override
  public Map<List<TagValue>, AggregationData> getAggregationMap() {
    return aggregationMap;
  }

  @Override
  public ViewData.AggregationWindowData getWindowData() {
    return windowData;
  }

  @Override
  public String toString() {
    return "ViewData{"
         + "view=" + view + ", "
         + "aggregationMap=" + aggregationMap + ", "
         + "windowData=" + windowData
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ViewData) {
      ViewData that = (ViewData) o;
      return (this.view.equals(that.getView()))
           && (this.aggregationMap.equals(that.getAggregationMap()))
           && (this.windowData.equals(that.getWindowData()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= view.hashCode();
    h$ *= 1000003;
    h$ ^= aggregationMap.hashCode();
    h$ *= 1000003;
    h$ ^= windowData.hashCode();
    return h$;
  }

}
