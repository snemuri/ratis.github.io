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
package org.apache.ratis.shaded.io.netty.handler.codec.http.websocketx.extensions.compression;

import org.apache.ratis.shaded.io.netty.channel.ChannelHandlerContext;
import org.apache.ratis.shaded.io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import org.apache.ratis.shaded.io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame;
import org.apache.ratis.shaded.io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.apache.ratis.shaded.io.netty.handler.codec.http.websocketx.WebSocketFrame;
import org.apache.ratis.shaded.io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension;

import java.util.List;

/**
 * Per-message implementation of deflate compressor.
 */
class PerMessageDeflateEncoder extends DeflateEncoder {

    private boolean compressing;

    /**
     * Constructor
     * @param compressionLevel compression level of the compressor.
     * @param windowSize maximum size of the window compressor buffer.
     * @param noContext true to disable context takeover.
     */
    public PerMessageDeflateEncoder(int compressionLevel, int windowSize, boolean noContext) {
        super(compressionLevel, windowSize, noContext);
    }

    @Override
    public boolean acceptOutboundMessage(Object msg) throws Exception {
        return ((msg instanceof TextWebSocketFrame ||
                msg instanceof BinaryWebSocketFrame) &&
                   (((WebSocketFrame) msg).rsv() & WebSocketExtension.RSV1) == 0) ||
               (msg instanceof ContinuationWebSocketFrame && compressing);
    }

    @Override
    protected int rsv(WebSocketFrame msg) {
        return msg instanceof TextWebSocketFrame || msg instanceof BinaryWebSocketFrame ?
                msg.rsv() | WebSocketExtension.RSV1 : msg.rsv();
    }

    @Override
    protected boolean removeFrameTail(WebSocketFrame msg) {
        return msg.isFinalFragment();
    }

    @Override
    protected void encode(ChannelHandlerContext ctx, WebSocketFrame msg,
            List<Object> out) throws Exception {
        super.encode(ctx, msg, out);

        if (msg.isFinalFragment()) {
            compressing = false;
        } else if (msg instanceof TextWebSocketFrame || msg instanceof BinaryWebSocketFrame) {
            compressing = true;
        }
    }

}