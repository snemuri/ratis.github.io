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

package org.apache.ratis.shaded.io.netty.example.http2.tiles;

import static org.apache.ratis.shaded.io.netty.buffer.Unpooled.copiedBuffer;
import static org.apache.ratis.shaded.io.netty.buffer.Unpooled.unreleasableBuffer;
import static org.apache.ratis.shaded.io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH;
import static org.apache.ratis.shaded.io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE;
import static org.apache.ratis.shaded.io.netty.handler.codec.http.HttpResponseStatus.CONTINUE;
import static org.apache.ratis.shaded.io.netty.handler.codec.http.HttpResponseStatus.OK;
import static org.apache.ratis.shaded.io.netty.handler.codec.http.HttpVersion.HTTP_1_1;
import static org.apache.ratis.shaded.io.netty.util.CharsetUtil.UTF_8;
import org.apache.ratis.shaded.io.netty.buffer.ByteBuf;
import org.apache.ratis.shaded.io.netty.channel.ChannelFutureListener;
import org.apache.ratis.shaded.io.netty.channel.ChannelHandlerContext;
import org.apache.ratis.shaded.io.netty.channel.SimpleChannelInboundHandler;
import org.apache.ratis.shaded.io.netty.handler.codec.http.DefaultFullHttpResponse;
import org.apache.ratis.shaded.io.netty.handler.codec.http.FullHttpResponse;
import org.apache.ratis.shaded.io.netty.handler.codec.http.HttpUtil;
import org.apache.ratis.shaded.io.netty.handler.codec.http.HttpRequest;
import org.apache.ratis.shaded.io.netty.handler.codec.http2.Http2CodecUtil;

/**
 * Handles the exceptional case where HTTP 1.x was negotiated under TLS.
 */
public final class FallbackRequestHandler extends SimpleChannelInboundHandler<HttpRequest> {

    private static final ByteBuf response = unreleasableBuffer(copiedBuffer("<!DOCTYPE html>"
            + "<html><body><h2>To view the example you need a browser that supports HTTP/2 ("
            + Http2CodecUtil.TLS_UPGRADE_PROTOCOL_NAME
            + ")</h2></body></html>", UTF_8)).asReadOnly();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HttpRequest req) throws Exception {
        if (HttpUtil.is100ContinueExpected(req)) {
            ctx.write(new DefaultFullHttpResponse(HTTP_1_1, CONTINUE));
        }

        ByteBuf content = ctx.alloc().buffer();
        content.writeBytes(response.duplicate());

        FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, OK, content);
        response.headers().set(CONTENT_TYPE, "text/html; charset=UTF-8");
        response.headers().setInt(CONTENT_LENGTH, response.content().readableBytes());

        ctx.write(response).addListener(ChannelFutureListener.CLOSE);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
