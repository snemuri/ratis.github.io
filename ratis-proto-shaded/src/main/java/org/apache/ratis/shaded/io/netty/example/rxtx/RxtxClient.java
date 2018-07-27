/*
 * Copyright 2013 The Netty Project
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
package org.apache.ratis.shaded.io.netty.example.rxtx;

import org.apache.ratis.shaded.io.netty.bootstrap.Bootstrap;
import org.apache.ratis.shaded.io.netty.channel.ChannelFuture;
import org.apache.ratis.shaded.io.netty.channel.ChannelInitializer;
import org.apache.ratis.shaded.io.netty.channel.EventLoopGroup;
import org.apache.ratis.shaded.io.netty.channel.oio.OioEventLoopGroup;
import org.apache.ratis.shaded.io.netty.channel.rxtx.RxtxChannel;
import org.apache.ratis.shaded.io.netty.channel.rxtx.RxtxDeviceAddress;
import org.apache.ratis.shaded.io.netty.handler.codec.LineBasedFrameDecoder;
import org.apache.ratis.shaded.io.netty.handler.codec.string.StringDecoder;
import org.apache.ratis.shaded.io.netty.handler.codec.string.StringEncoder;

/**
 * Sends one message to a serial device
 */
public final class RxtxClient {

    static final String PORT = System.getProperty("port", "/dev/ttyUSB0");

    public static void main(String[] args) throws Exception {
        EventLoopGroup group = new OioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
             .channel(RxtxChannel.class)
             .handler(new ChannelInitializer<RxtxChannel>() {
                 @Override
                 public void initChannel(RxtxChannel ch) throws Exception {
                     ch.pipeline().addLast(
                         new LineBasedFrameDecoder(32768),
                         new StringEncoder(),
                         new StringDecoder(),
                         new RxtxClientHandler()
                     );
                 }
             });

            ChannelFuture f = b.connect(new RxtxDeviceAddress(PORT)).sync();

            f.channel().closeFuture().sync();
        } finally {
            group.shutdownGracefully();
        }
    }
}
