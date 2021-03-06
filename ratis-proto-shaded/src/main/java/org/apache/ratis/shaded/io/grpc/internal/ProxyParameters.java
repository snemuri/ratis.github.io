/*
 * Copyright 2017, gRPC Authors All rights reserved.
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

package org.apache.ratis.shaded.io.grpc.internal;

import org.apache.ratis.shaded.com.google.common.base.Objects;
import org.apache.ratis.shaded.com.google.common.base.Preconditions;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;

/**
 * Used to express the result of a proxy lookup.
 */
public final class ProxyParameters {
  public final InetSocketAddress proxyAddress;
  @Nullable public final String username;
  @Nullable public final String password;

  ProxyParameters(
      InetSocketAddress proxyAddress,
      @Nullable String username,
      @Nullable String password) {
    this.proxyAddress = Preconditions.checkNotNull(proxyAddress);
    this.username = username;
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof ProxyParameters)) {
      return false;
    }
    ProxyParameters that = (ProxyParameters) o;
    return Objects.equal(proxyAddress, that.proxyAddress)
        && Objects.equal(username, that.username)
        && Objects.equal(password, that.password);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(proxyAddress, username, password);
  }
}
