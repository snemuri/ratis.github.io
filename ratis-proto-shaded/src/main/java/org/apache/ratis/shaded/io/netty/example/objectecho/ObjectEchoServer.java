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
package org.apache.ratis.shaded.io.netty.example.objectecho;

import org.apache.ratis.shaded.io.netty.bootstrap.ServerBootstrap;
import org.apache.ratis.shaded.io.netty.channel.ChannelInitializer;
import org.apache.ratis.shaded.io.netty.channel.ChannelPipeline;
import org.apache.ratis.shaded.io.netty.channel.EventLoopGroup;
import org.apache.ratis.shaded.io.netty.channel.nio.NioEventLoopGroup;
import org.apache.ratis.shaded.io.netty.channel.socket.SocketChannel;
import org.apache.ratis.shaded.io.netty.channel.socket.nio.NioServerSocketChannel;
import org.apache.ratis.shaded.io.netty.example.echo.EchoServer;
import org.apache.ratis.shaded.io.netty.handler.codec.serialization.ClassResolvers;
import org.apache.ratis.shaded.io.netty.handler.codec.serialization.ObjectDecoder;
import org.apache.ratis.shaded.io.netty.handler.codec.serialization.ObjectEncoder;
import org.apache.ratis.shaded.io.netty.handler.logging.LogLevel;
import org.apache.ratis.shaded.io.netty.handler.logging.LoggingHandler;
import org.apache.ratis.shaded.io.netty.handler.ssl.SslContext;
import org.apache.ratis.shaded.io.netty.handler.ssl.SslContextBuilder;
import org.apache.ratis.shaded.io.netty.handler.ssl.util.SelfSignedCertificate;

/**
 * Modification of {@link EchoServer} which utilizes Java object serialization.
 */
public final class ObjectEchoServer {

    static final boolean SSL = System.getProperty("ssl") != null;
    static final int PORT = Integer.parseInt(System.getProperty("port", "8007"));

    public static void main(String[] args) throws Exception {
        // Configure SSL.
        final SslContext sslCtx;
        if (SSL) {
            SelfSignedCertificate ssc = new SelfSignedCertificate();
            sslCtx = SslContextBuilder.forServer(ssc.certificate(), ssc.privateKey()).build();
        } else {
            sslCtx = null;
        }

        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)
             .channel(NioServerSocketChannel.class)
             .handler(new LoggingHandler(LogLevel.INFO))
             .childHandler(new ChannelInitializer<SocketChannel>() {
                @Override
                public void initChannel(SocketChannel ch) throws Exception {
                    ChannelPipeline p = ch.pipeline();
                    if (sslCtx != null) {
                        p.addLast(sslCtx.newHandler(ch.alloc()));
                    }
                    p.addLast(
                            new ObjectEncoder(),
                            new ObjectDecoder(ClassResolvers.cacheDisabled(null)),
                            new ObjectEchoServerHandler());
                }
             });

            // Bind and start to accept incoming connections.
            b.bind(PORT).sync().channel().closeFuture().sync();
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}