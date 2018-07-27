/*
 * Copyright 2015, gRPC Authors All rights reserved.
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

package org.apache.ratis.shaded.io.grpc.netty;

import org.apache.ratis.shaded.io.grpc.Internal;
import org.apache.ratis.shaded.io.grpc.ManagedChannelProvider;

/** Provider for {@link NettyChannelBuilder} instances. */
@Internal
public final class NettyChannelProvider extends ManagedChannelProvider {
  @Override
  public boolean isAvailable() {
    return true;
  }

  @Override
  public int priority() {
    return 5;
  }

  @Override
  public NettyChannelBuilder builderForAddress(String name, int port) {
    return NettyChannelBuilder.forAddress(name, port);
  }

  @Override
  public NettyChannelBuilder builderForTarget(String target) {
    return NettyChannelBuilder.forTarget(target);
  }
}