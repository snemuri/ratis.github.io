/*
 * Copyright 2016 The Netty Project
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
package org.apache.ratis.shaded.io.netty.channel.kqueue;

import org.apache.ratis.shaded.io.netty.buffer.ByteBufAllocator;
import org.apache.ratis.shaded.io.netty.channel.ChannelOption;
import org.apache.ratis.shaded.io.netty.channel.DefaultChannelConfig;
import org.apache.ratis.shaded.io.netty.channel.MessageSizeEstimator;
import org.apache.ratis.shaded.io.netty.channel.RecvByteBufAllocator;
import org.apache.ratis.shaded.io.netty.channel.WriteBufferWaterMark;
import org.apache.ratis.shaded.io.netty.util.internal.UnstableApi;

import java.util.Map;

import static org.apache.ratis.shaded.io.netty.channel.kqueue.KQueueChannelOption.RCV_ALLOC_TRANSPORT_PROVIDES_GUESS;

@UnstableApi
public class KQueueChannelConfig extends DefaultChannelConfig {
    final AbstractKQueueChannel channel;
    private volatile boolean transportProvidesGuess;

    KQueueChannelConfig(AbstractKQueueChannel channel) {
        super(channel);
        this.channel = channel;
    }

    @Override
    @SuppressWarnings("deprecation")
    public Map<ChannelOption<?>, Object> getOptions() {
        return getOptions(super.getOptions(), RCV_ALLOC_TRANSPORT_PROVIDES_GUESS);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T getOption(ChannelOption<T> option) {
        if (option == RCV_ALLOC_TRANSPORT_PROVIDES_GUESS) {
            return (T) Boolean.valueOf(getRcvAllocTransportProvidesGuess());
        }
        return super.getOption(option);
    }

    @Override
    public <T> boolean setOption(ChannelOption<T> option, T value) {
        validate(option, value);

        if (option == RCV_ALLOC_TRANSPORT_PROVIDES_GUESS) {
            setRcvAllocTransportProvidesGuess((Boolean) value);
        } else {
            return super.setOption(option, value);
        }

        return true;
    }

    /**
     * If this is {@code true} then the {@link RecvByteBufAllocator.Handle#guess()} will be overriden to always attempt
     * to read as many bytes as kqueue says are available.
     */
    public KQueueChannelConfig setRcvAllocTransportProvidesGuess(boolean transportProvidesGuess) {
        this.transportProvidesGuess = transportProvidesGuess;
        return this;
    }

    /**
     * If this is {@code true} then the {@link RecvByteBufAllocator.Handle#guess()} will be overriden to always attempt
     * to read as many bytes as kqueue says are available.
     */
    public boolean getRcvAllocTransportProvidesGuess() {
        return transportProvidesGuess;
    }

    @Override
    public KQueueChannelConfig setConnectTimeoutMillis(int connectTimeoutMillis) {
        super.setConnectTimeoutMillis(connectTimeoutMillis);
        return this;
    }

    @Override
    @Deprecated
    public KQueueChannelConfig setMaxMessagesPerRead(int maxMessagesPerRead) {
        super.setMaxMessagesPerRead(maxMessagesPerRead);
        return this;
    }

    @Override
    public KQueueChannelConfig setWriteSpinCount(int writeSpinCount) {
        super.setWriteSpinCount(writeSpinCount);
        return this;
    }

    @Override
    public KQueueChannelConfig setAllocator(ByteBufAllocator allocator) {
        super.setAllocator(allocator);
        return this;
    }

    @Override
    public KQueueChannelConfig setRecvByteBufAllocator(RecvByteBufAllocator allocator) {
        if (!(allocator.newHandle() instanceof RecvByteBufAllocator.ExtendedHandle)) {
            throw new IllegalArgumentException("allocator.newHandle() must return an object of type: " +
                    RecvByteBufAllocator.ExtendedHandle.class);
        }
        super.setRecvByteBufAllocator(allocator);
        return this;
    }

    @Override
    public KQueueChannelConfig setAutoRead(boolean autoRead) {
        super.setAutoRead(autoRead);
        return this;
    }

    @Override
    @Deprecated
    public KQueueChannelConfig setWriteBufferHighWaterMark(int writeBufferHighWaterMark) {
        super.setWriteBufferHighWaterMark(writeBufferHighWaterMark);
        return this;
    }

    @Override
    @Deprecated
    public KQueueChannelConfig setWriteBufferLowWaterMark(int writeBufferLowWaterMark) {
        super.setWriteBufferLowWaterMark(writeBufferLowWaterMark);
        return this;
    }

    @Override
    public KQueueChannelConfig setWriteBufferWaterMark(WriteBufferWaterMark writeBufferWaterMark) {
        super.setWriteBufferWaterMark(writeBufferWaterMark);
        return this;
    }

    @Override
    public KQueueChannelConfig setMessageSizeEstimator(MessageSizeEstimator estimator) {
        super.setMessageSizeEstimator(estimator);
        return this;
    }

    @Override
    protected final void autoReadCleared() {
        channel.clearReadFilter();
    }
}