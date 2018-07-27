/*
 * Copyright 2016, gRPC Authors All rights reserved.
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

import static org.apache.ratis.shaded.com.google.common.base.MoreObjects.firstNonNull;
import static org.apache.ratis.shaded.com.google.common.base.Preconditions.checkNotNull;

import org.apache.ratis.shaded.io.grpc.Attributes;
import org.apache.ratis.shaded.io.grpc.CallCredentials;
import org.apache.ratis.shaded.io.grpc.CallOptions;
import org.apache.ratis.shaded.io.grpc.Metadata;
import org.apache.ratis.shaded.io.grpc.MethodDescriptor;
import org.apache.ratis.shaded.io.grpc.SecurityLevel;
import org.apache.ratis.shaded.io.grpc.Status;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

final class CallCredentialsApplyingTransportFactory implements ClientTransportFactory {
  private final ClientTransportFactory delegate;
  private final Executor appExecutor;

  CallCredentialsApplyingTransportFactory(
      ClientTransportFactory delegate, Executor appExecutor) {
    this.delegate = checkNotNull(delegate, "delegate");
    this.appExecutor = checkNotNull(appExecutor, "appExecutor");
  }

  @Override
  public ConnectionClientTransport newClientTransport(
      SocketAddress serverAddress, String authority, @Nullable String userAgent,
      @Nullable ProxyParameters proxy) {
    return new CallCredentialsApplyingTransport(
        delegate.newClientTransport(serverAddress, authority, userAgent, proxy), authority);
  }

  @Override
  public ScheduledExecutorService getScheduledExecutorService() {
    return delegate.getScheduledExecutorService();
  }

  @Override
  public void close() {
    delegate.close();
  }

  private class CallCredentialsApplyingTransport extends ForwardingConnectionClientTransport {
    private final ConnectionClientTransport delegate;
    private final String authority;

    CallCredentialsApplyingTransport(ConnectionClientTransport delegate, String authority) {
      this.delegate = checkNotNull(delegate, "delegate");
      this.authority = checkNotNull(authority, "authority");
    }

    @Override
    protected ConnectionClientTransport delegate() {
      return delegate;
    }

    @Override
    public ClientStream newStream(
        MethodDescriptor<?, ?> method, Metadata headers, CallOptions callOptions) {
      CallCredentials creds = callOptions.getCredentials();
      if (creds != null) {
        MetadataApplierImpl applier = new MetadataApplierImpl(
            delegate, method, headers, callOptions);
        Attributes.Builder effectiveAttrsBuilder = Attributes.newBuilder()
            .set(CallCredentials.ATTR_AUTHORITY, authority)
            .set(CallCredentials.ATTR_SECURITY_LEVEL, SecurityLevel.NONE)
            .setAll(delegate.getAttributes());
        if (callOptions.getAuthority() != null) {
          effectiveAttrsBuilder.set(CallCredentials.ATTR_AUTHORITY, callOptions.getAuthority());
        }
        try {
          creds.applyRequestMetadata(method, effectiveAttrsBuilder.build(),
              firstNonNull(callOptions.getExecutor(), appExecutor), applier);
        } catch (Throwable t) {
          applier.fail(Status.UNAUTHENTICATED
              .withDescription("Credentials should use fail() instead of throwing exceptions")
              .withCause(t));
        }
        return applier.returnStream();
      } else {
        return delegate.newStream(method, headers, callOptions);
      }
    }
  }
}