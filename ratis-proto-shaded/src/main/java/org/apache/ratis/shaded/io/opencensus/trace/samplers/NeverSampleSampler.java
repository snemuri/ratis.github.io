/*
 * Copyright 2017, OpenCensus Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ratis.shaded.io.opencensus.trace.samplers;

import org.apache.ratis.shaded.io.opencensus.trace.Sampler;
import org.apache.ratis.shaded.io.opencensus.trace.Span;
import org.apache.ratis.shaded.io.opencensus.trace.SpanContext;
import org.apache.ratis.shaded.io.opencensus.trace.SpanId;
import org.apache.ratis.shaded.io.opencensus.trace.TraceId;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/** Sampler that always makes a "no" decision on {@link Span} sampling. */
@Immutable
final class NeverSampleSampler extends Sampler {

  NeverSampleSampler() {}

  // Returns always makes a "no" decision on {@link Span} sampling.
  @Override
  public boolean shouldSample(
      @Nullable SpanContext parentContext,
      @Nullable Boolean hasRemoteParent,
      TraceId traceId,
      SpanId spanId,
      String name,
      List<Span> parentLinks) {
    return false;
  }

  @Override
  public String getDescription() {
    return toString();
  }

  @Override
  public String toString() {
    return "NeverSampleSampler";
  }
}
