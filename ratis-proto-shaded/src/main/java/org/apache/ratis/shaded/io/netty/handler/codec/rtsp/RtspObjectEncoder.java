/*
 * Copyright 2012 The Netty Project
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
package org.apache.ratis.shaded.io.netty.handler.codec.rtsp;

import org.apache.ratis.shaded.io.netty.buffer.ByteBuf;
import org.apache.ratis.shaded.io.netty.channel.ChannelHandler.Sharable;
import org.apache.ratis.shaded.io.netty.handler.codec.http.FullHttpMessage;
import org.apache.ratis.shaded.io.netty.handler.codec.http.HttpMessage;
import org.apache.ratis.shaded.io.netty.handler.codec.http.HttpObjectEncoder;

/**
 * Encodes an RTSP message represented in {@link FullHttpMessage} into
 * a {@link ByteBuf}.
 *
 * @deprecated Use {@link RtspEncoder} instead.
 */
@Sharable
@Deprecated
public abstract class RtspObjectEncoder<H extends HttpMessage> extends HttpObjectEncoder<H> {

    /**
     * Creates a new instance.
     */
    protected RtspObjectEncoder() {
    }

    @Override
    public boolean acceptOutboundMessage(Object msg) throws Exception {
        return msg instanceof FullHttpMessage;
    }
}
