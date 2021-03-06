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

import static org.apache.ratis.shaded.com.google.common.base.Preconditions.checkArgument;
import static org.apache.ratis.shaded.com.google.common.base.Preconditions.checkNotNull;

import org.apache.ratis.shaded.io.grpc.ExperimentalApi;
import org.apache.ratis.shaded.io.grpc.Metadata;
import org.apache.ratis.shaded.io.grpc.Status;
import org.apache.ratis.shaded.io.grpc.StatusException;
import org.apache.ratis.shaded.io.grpc.StatusRuntimeException;
import org.apache.ratis.shaded.io.grpc.protobuf.lite.ProtoLiteUtils;
import javax.annotation.Nullable;

/** Utility methods for working with {@link org.apache.ratis.shaded.com.google.rpc.Status}. */
@ExperimentalApi
public final class StatusProto {
  private StatusProto() {}

  private static final Metadata.Key<org.apache.ratis.shaded.com.google.rpc.Status> STATUS_DETAILS_KEY =
      Metadata.Key.of(
          "grpc-status-details-bin",
          ProtoLiteUtils.metadataMarshaller(org.apache.ratis.shaded.com.google.rpc.Status.getDefaultInstance()));

  /**
   * Convert a {@link org.apache.ratis.shaded.com.google.rpc.Status} instance to a {@link StatusRuntimeException}.
   *
   * <p>The returned {@link StatusRuntimeException} will wrap a {@link Status} whose code and
   * description are set from the code and message in {@code statusProto}. {@code statusProto} will
   * be serialized and placed into the metadata of the returned {@link StatusRuntimeException}.
   *
   * @throws IllegalArgumentException if the value of {@code statusProto.getCode()} is not a valid
   *     gRPC status code.
   */
  public static StatusRuntimeException toStatusRuntimeException(org.apache.ratis.shaded.com.google.rpc.Status statusProto) {
    return toStatus(statusProto).asRuntimeException(toMetadata(statusProto));
  }

  /**
   * Convert a {@link org.apache.ratis.shaded.com.google.rpc.Status} instance to a {@link StatusRuntimeException} with
   * additional metadata.
   *
   * <p>The returned {@link StatusRuntimeException} will wrap a {@link Status} whose code and
   * description are set from the code and message in {@code statusProto}. {@code statusProto} will
   * be serialized and added to {@code metadata}. {@code metadata} will be set as the metadata of
   * the returned {@link StatusRuntimeException}.
   *
   * @throws IllegalArgumentException if the value of {@code statusProto.getCode()} is not a valid
   *     gRPC status code.
   */
  public static StatusRuntimeException toStatusRuntimeException(
      org.apache.ratis.shaded.com.google.rpc.Status statusProto, Metadata metadata) {
    return toStatus(statusProto).asRuntimeException(toMetadata(statusProto, metadata));
  }

  /**
   * Convert a {@link org.apache.ratis.shaded.com.google.rpc.Status} instance to a {@link StatusException}.
   *
   * <p>The returned {@link StatusException} will wrap a {@link Status} whose code and description
   * are set from the code and message in {@code statusProto}. {@code statusProto} will be
   * serialized and placed into the metadata of the returned {@link StatusException}.
   *
   * @throws IllegalArgumentException if the value of {@code statusProto.getCode()} is not a valid
   *     gRPC status code.
   */
  public static StatusException toStatusException(org.apache.ratis.shaded.com.google.rpc.Status statusProto) {
    return toStatus(statusProto).asException(toMetadata(statusProto));
  }

  /**
   * Convert a {@link org.apache.ratis.shaded.com.google.rpc.Status} instance to a {@link StatusException} with additional
   * metadata.
   *
   * <p>The returned {@link StatusException} will wrap a {@link Status} whose code and description
   * are set from the code and message in {@code statusProto}. {@code statusProto} will be
   * serialized and added to {@code metadata}. {@code metadata} will be set as the metadata of the
   * returned {@link StatusException}.
   *
   * @throws IllegalArgumentException if the value of {@code statusProto.getCode()} is not a valid
   *     gRPC status code.
   */
  public static StatusException toStatusException(
      org.apache.ratis.shaded.com.google.rpc.Status statusProto, Metadata metadata) {
    return toStatus(statusProto).asException(toMetadata(statusProto, metadata));
  }

  private static Status toStatus(org.apache.ratis.shaded.com.google.rpc.Status statusProto) {
    Status status = Status.fromCodeValue(statusProto.getCode());
    checkArgument(status.getCode().value() == statusProto.getCode(), "invalid status code");
    return status.withDescription(statusProto.getMessage());
  }

  private static Metadata toMetadata(org.apache.ratis.shaded.com.google.rpc.Status statusProto) {
    Metadata metadata = new Metadata();
    metadata.put(STATUS_DETAILS_KEY, statusProto);
    return metadata;
  }

  private static Metadata toMetadata(org.apache.ratis.shaded.com.google.rpc.Status statusProto, Metadata metadata) {
    checkNotNull(metadata, "metadata must not be null");
    metadata.discardAll(STATUS_DETAILS_KEY);
    metadata.put(STATUS_DETAILS_KEY, statusProto);
    return metadata;
  }

  /**
   * Extract a {@link org.apache.ratis.shaded.com.google.rpc.Status} instance from the causal chain of a {@link Throwable}.
   *
   * @return the extracted {@link org.apache.ratis.shaded.com.google.rpc.Status} instance, or {@code null} if none exists.
   * @throws IllegalArgumentException if an embedded {@link org.apache.ratis.shaded.com.google.rpc.Status} is found and its
   *     code does not match the gRPC {@link Status} code.
   */
  @Nullable
  public static org.apache.ratis.shaded.com.google.rpc.Status fromThrowable(Throwable t) {
    Throwable cause = checkNotNull(t, "t");
    while (cause != null) {
      if (cause instanceof StatusException) {
        StatusException e = (StatusException) cause;
        return toStatusProto(e.getStatus(), e.getTrailers());
      } else if (cause instanceof StatusRuntimeException) {
        StatusRuntimeException e = (StatusRuntimeException) cause;
        return toStatusProto(e.getStatus(), e.getTrailers());
      }
      cause = cause.getCause();
    }
    return null;
  }

  @Nullable
  private static org.apache.ratis.shaded.com.google.rpc.Status toStatusProto(Status status, Metadata trailers) {
    if (trailers != null) {
      org.apache.ratis.shaded.com.google.rpc.Status statusProto = trailers.get(STATUS_DETAILS_KEY);
      if (statusProto != null) {
        checkArgument(
            status.getCode().value() == statusProto.getCode(),
            "org.apache.ratis.shaded.com.google.rpc.Status code must match gRPC status code");
        return statusProto;
      }
    }
    return null;
  }
}
