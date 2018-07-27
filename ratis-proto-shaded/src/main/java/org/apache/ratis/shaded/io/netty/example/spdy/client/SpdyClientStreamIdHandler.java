/*
 * Copyright 2014 The Netty Project
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
package org.apache.ratis.shaded.io.netty.example.spdy.client;

import org.apache.ratis.shaded.io.netty.channel.ChannelHandlerContext;
import org.apache.ratis.shaded.io.netty.channel.ChannelOutboundHandlerAdapter;
import org.apache.ratis.shaded.io.netty.channel.ChannelPromise;
import org.apache.ratis.shaded.io.netty.handler.codec.http.HttpMessage;
import org.apache.ratis.shaded.io.netty.handler.codec.spdy.SpdyHttpHeaders;
import org.apache.ratis.shaded.io.netty.handler.codec.spdy.SpdyHttpHeaders.Names;

/**
 * Adds a unique client stream ID to the SPDY header. Client stream IDs MUST be odd.
 */
public class SpdyClientStreamIdHandler extends ChannelOutboundHandlerAdapter {

    private int currentStreamId = 1;

    public boolean acceptOutboundMessage(Object msg) {
        return msg instanceof HttpMessage;
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) {
        if (acceptOutboundMessage(msg)) {
            HttpMessage httpMsg = (HttpMessage) msg;
            if (!httpMsg.headers().contains(SpdyHttpHeaders.Names.STREAM_ID)) {
                httpMsg.headers().setInt(Names.STREAM_ID, currentStreamId);
                // Client stream IDs are always odd
                currentStreamId += 2;
            }
        }
        ctx.write(msg, promise);
    }
}
