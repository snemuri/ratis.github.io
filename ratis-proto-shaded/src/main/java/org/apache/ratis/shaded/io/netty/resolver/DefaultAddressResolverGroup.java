/*
 * Copyright 2015 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.apache.ratis.shaded.io.netty.resolver;

import org.apache.ratis.shaded.io.netty.util.concurrent.EventExecutor;
import org.apache.ratis.shaded.io.netty.util.internal.UnstableApi;

import java.net.InetSocketAddress;

/**
 * A {@link AddressResolverGroup} of {@link DefaultNameResolver}s.
 */
@UnstableApi
public final class DefaultAddressResolverGroup extends AddressResolverGroup<InetSocketAddress> {

    public static final DefaultAddressResolverGroup INSTANCE = new DefaultAddressResolverGroup();

    private DefaultAddressResolverGroup() { }

    @Override
    protected AddressResolver<InetSocketAddress> newResolver(EventExecutor executor) throws Exception {
        return new DefaultNameResolver(executor).asAddressResolver();
    }
}
