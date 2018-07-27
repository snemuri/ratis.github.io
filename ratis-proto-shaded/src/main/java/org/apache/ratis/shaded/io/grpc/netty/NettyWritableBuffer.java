/*
 * Copyright 2015, gRPC Authors All rights reserved.
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

package org.apache.ratis.shaded.io.grpc.netty;

import org.apache.ratis.shaded.io.grpc.internal.WritableBuffer;
import org.apache.ratis.shaded.io.netty.buffer.ByteBuf;

/**
 * The {@link WritableBuffer} used by the Netty transport.
 */
class NettyWritableBuffer implements WritableBuffer {

  private final ByteBuf bytebuf;

  NettyWritableBuffer(ByteBuf bytebuf) {
    this.bytebuf = bytebuf;
  }

  @Override
  public void write(byte[] src, int srcIndex, int length) {
    bytebuf.writeBytes(src, srcIndex, length);
  }

  @Override
  public void write(byte b) {
    bytebuf.writeByte(b);
  }

  @Override
  public int writableBytes() {
    return bytebuf.writableBytes();
  }

  @Override
  public int readableBytes() {
    return bytebuf.readableBytes();
  }

  @Override
  public void release() {
    bytebuf.release();
  }

  ByteBuf bytebuf() {
    return bytebuf;
  }
}
