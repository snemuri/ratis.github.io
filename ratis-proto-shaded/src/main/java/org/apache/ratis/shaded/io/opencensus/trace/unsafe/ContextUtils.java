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

package org.apache.ratis.shaded.io.opencensus.trace.unsafe;

import org.apache.ratis.shaded.io.grpc.Context;
import org.apache.ratis.shaded.io.opencensus.trace.Span;

/**
 * Util methods/functionality to interact with the {@link org.apache.ratis.shaded.io.grpc.Context}.
 *
 * <p>Users must interact with the current Context via the public APIs in {@link
 * org.apache.ratis.shaded.io.opencensus.trace.Tracer} and avoid usages of the {@link #CONTEXT_SPAN_KEY} directly.
 *
 * @since 0.5
 */
public final class ContextUtils {
  // No instance of this class.
  private ContextUtils() {}

  /**
   * The {@link org.apache.ratis.shaded.io.grpc.Context.Key} used to interact with {@link org.apache.ratis.shaded.io.grpc.Context}.
   *
   * @since 0.5
   */
  public static final Context.Key<Span> CONTEXT_SPAN_KEY = Context.key("opencensus-trace-span-key");
}
