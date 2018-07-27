/*
 * Copyright 2017, gRPC Authors All rights reserved.
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

package org.apache.ratis.shaded.io.grpc.protobuf;

import org.apache.ratis.shaded.com.google.protobuf.Descriptors.ServiceDescriptor;

/**
 * Provides access to the underlying proto service descriptor.
 *
 * @since 1.7.0
 */
public interface ProtoServiceDescriptorSupplier extends ProtoFileDescriptorSupplier {
  /**
   * Returns service descriptor to the proto service.
   */
  ServiceDescriptor getServiceDescriptor();
}