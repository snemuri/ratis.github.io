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
package org.apache.ratis.shaded.io.netty.example.echo;

import org.apache.ratis.shaded.io.netty.bootstrap.ServerBootstrap;
import org.apache.ratis.shaded.io.netty.channel.ChannelFuture;
import org.apache.ratis.shaded.io.netty.channel.ChannelInitializer;
import org.apache.ratis.shaded.io.netty.channel.ChannelOption;
import org.apache.ratis.shaded.io.netty.channel.ChannelPipeline;
import org.apache.ratis.shaded.io.netty.channel.EventLoopGroup;
import org.apache.ratis.shaded.io.netty.channel.nio.NioEventLoopGroup;
import org.apache.ratis.shaded.io.netty.channel.socket.SocketChannel;
import org.apache.ratis.shaded.io.netty.channel.socket.nio.NioServerSocketChannel;
import org.apache.ratis.shaded.io.netty.handler.logging.LogLevel;
import org.apache.ratis.shaded.io.netty.handler.logging.LoggingHandler;
import org.apache.ratis.shaded.io.netty.handler.ssl.SslContext;
import org.apache.ratis.shaded.io.netty.handler.ssl.SslContextBuilder;
import org.apache.ratis.shaded.io.netty.handler.ssl.util.SelfSignedCertificate;

/**
 * Echoes back any received data from a client.
 */
public final class EchoServer {

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

        // Configure the server.
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)
             .channel(NioServerSocketChannel.class)
             .option(ChannelOption.SO_BACKLOG, 100)
             .handler(new LoggingHandler(LogLevel.INFO))
             .childHandler(new ChannelInitializer<SocketChannel>() {
                 @Override
                 public void initChannel(SocketChannel ch) throws Exception {
                     ChannelPipeline p = ch.pipeline();
                     if (sslCtx != null) {
                         p.addLast(sslCtx.newHandler(ch.alloc()));
                     }
                     //p.addLast(new LoggingHandler(LogLevel.INFO));
                     p.addLast(new EchoServerHandler());
                 }
             });

            // Start the server.
            ChannelFuture f = b.bind(PORT).sync();

            // Wait until the server socket is closed.
            f.channel().closeFuture().sync();
        } finally {
            // Shut down all event loops to terminate all threads.
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
