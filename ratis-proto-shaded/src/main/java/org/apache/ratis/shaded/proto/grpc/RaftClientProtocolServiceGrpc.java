package org.apache.ratis.shaded.proto.grpc;

import static org.apache.ratis.shaded.io.grpc.MethodDescriptor.generateFullMethodName;
import static org.apache.ratis.shaded.io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static org.apache.ratis.shaded.io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static org.apache.ratis.shaded.io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static org.apache.ratis.shaded.io.grpc.stub.ClientCalls.asyncUnaryCall;
import static org.apache.ratis.shaded.io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static org.apache.ratis.shaded.io.grpc.stub.ClientCalls.blockingUnaryCall;
import static org.apache.ratis.shaded.io.grpc.stub.ClientCalls.futureUnaryCall;
import static org.apache.ratis.shaded.io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static org.apache.ratis.shaded.io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static org.apache.ratis.shaded.io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static org.apache.ratis.shaded.io.grpc.stub.ServerCalls.asyncUnaryCall;
import static org.apache.ratis.shaded.io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static org.apache.ratis.shaded.io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: GRpc.proto")
public final class RaftClientProtocolServiceGrpc {

  private RaftClientProtocolServiceGrpc() {}

  public static final String SERVICE_NAME = "ratis.grpc.RaftClientProtocolService";

  // Static method descriptors that strictly reflect the proto.
  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSetConfigurationMethod()} instead. 
  public static final org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> METHOD_SET_CONFIGURATION = getSetConfigurationMethodHelper();

  private static volatile org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getSetConfigurationMethod;

  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getSetConfigurationMethod() {
    return getSetConfigurationMethodHelper();
  }

  private static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getSetConfigurationMethodHelper() {
    org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto, org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getSetConfigurationMethod;
    if ((getSetConfigurationMethod = RaftClientProtocolServiceGrpc.getSetConfigurationMethod) == null) {
      synchronized (RaftClientProtocolServiceGrpc.class) {
        if ((getSetConfigurationMethod = RaftClientProtocolServiceGrpc.getSetConfigurationMethod) == null) {
          RaftClientProtocolServiceGrpc.getSetConfigurationMethod = getSetConfigurationMethod = 
              org.apache.ratis.shaded.io.grpc.MethodDescriptor.<org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto, org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>newBuilder()
              .setType(org.apache.ratis.shaded.io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ratis.grpc.RaftClientProtocolService", "setConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto.getDefaultInstance()))
              .setResponseMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftClientProtocolServiceMethodDescriptorSupplier("setConfiguration"))
                  .build();
          }
        }
     }
     return getSetConfigurationMethod;
  }
  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAppendMethod()} instead. 
  public static final org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> METHOD_APPEND = getAppendMethodHelper();

  private static volatile org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getAppendMethod;

  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getAppendMethod() {
    return getAppendMethodHelper();
  }

  private static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getAppendMethodHelper() {
    org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto, org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getAppendMethod;
    if ((getAppendMethod = RaftClientProtocolServiceGrpc.getAppendMethod) == null) {
      synchronized (RaftClientProtocolServiceGrpc.class) {
        if ((getAppendMethod = RaftClientProtocolServiceGrpc.getAppendMethod) == null) {
          RaftClientProtocolServiceGrpc.getAppendMethod = getAppendMethod = 
              org.apache.ratis.shaded.io.grpc.MethodDescriptor.<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto, org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>newBuilder()
              .setType(org.apache.ratis.shaded.io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ratis.grpc.RaftClientProtocolService", "append"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto.getDefaultInstance()))
              .setResponseMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftClientProtocolServiceMethodDescriptorSupplier("append"))
                  .build();
          }
        }
     }
     return getAppendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RaftClientProtocolServiceStub newStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
    return new RaftClientProtocolServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RaftClientProtocolServiceBlockingStub newBlockingStub(
      org.apache.ratis.shaded.io.grpc.Channel channel) {
    return new RaftClientProtocolServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RaftClientProtocolServiceFutureStub newFutureStub(
      org.apache.ratis.shaded.io.grpc.Channel channel) {
    return new RaftClientProtocolServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RaftClientProtocolServiceImplBase implements org.apache.ratis.shaded.io.grpc.BindableService {

    /**
     * <pre>
     * A client-to-server RPC to set new raft configuration
     * </pre>
     */
    public void setConfiguration(org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> responseObserver) {
      asyncUnimplementedUnaryCall(getSetConfigurationMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * A client-to-server stream RPC to append data
     * </pre>
     */
    public org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto> append(
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> responseObserver) {
      return asyncUnimplementedStreamingCall(getAppendMethodHelper(), responseObserver);
    }

    @java.lang.Override public final org.apache.ratis.shaded.io.grpc.ServerServiceDefinition bindService() {
      return org.apache.ratis.shaded.io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetConfigurationMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto,
                org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>(
                  this, METHODID_SET_CONFIGURATION)))
          .addMethod(
            getAppendMethodHelper(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto,
                org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>(
                  this, METHODID_APPEND)))
          .build();
    }
  }

  /**
   */
  public static final class RaftClientProtocolServiceStub extends org.apache.ratis.shaded.io.grpc.stub.AbstractStub<RaftClientProtocolServiceStub> {
    private RaftClientProtocolServiceStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
      super(channel);
    }

    private RaftClientProtocolServiceStub(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftClientProtocolServiceStub build(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      return new RaftClientProtocolServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * A client-to-server RPC to set new raft configuration
     * </pre>
     */
    public void setConfiguration(org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetConfigurationMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A client-to-server stream RPC to append data
     * </pre>
     */
    public org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto> append(
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAppendMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RaftClientProtocolServiceBlockingStub extends org.apache.ratis.shaded.io.grpc.stub.AbstractStub<RaftClientProtocolServiceBlockingStub> {
    private RaftClientProtocolServiceBlockingStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
      super(channel);
    }

    private RaftClientProtocolServiceBlockingStub(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftClientProtocolServiceBlockingStub build(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      return new RaftClientProtocolServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A client-to-server RPC to set new raft configuration
     * </pre>
     */
    public org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto setConfiguration(org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto request) {
      return blockingUnaryCall(
          getChannel(), getSetConfigurationMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RaftClientProtocolServiceFutureStub extends org.apache.ratis.shaded.io.grpc.stub.AbstractStub<RaftClientProtocolServiceFutureStub> {
    private RaftClientProtocolServiceFutureStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
      super(channel);
    }

    private RaftClientProtocolServiceFutureStub(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftClientProtocolServiceFutureStub build(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      return new RaftClientProtocolServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A client-to-server RPC to set new raft configuration
     * </pre>
     */
    public org.apache.ratis.shaded.com.google.common.util.concurrent.ListenableFuture<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> setConfiguration(
        org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto request) {
      return futureUnaryCall(
          getChannel().newCall(getSetConfigurationMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_CONFIGURATION = 0;
  private static final int METHODID_APPEND = 1;

  private static final class MethodHandlers<Req, Resp> implements
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RaftClientProtocolServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RaftClientProtocolServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, org.apache.ratis.shaded.io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_CONFIGURATION:
          serviceImpl.setConfiguration((org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto) request,
              (org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public org.apache.ratis.shaded.io.grpc.stub.StreamObserver<Req> invoke(
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_APPEND:
          return (org.apache.ratis.shaded.io.grpc.stub.StreamObserver<Req>) serviceImpl.append(
              (org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RaftClientProtocolServiceBaseDescriptorSupplier
      implements org.apache.ratis.shaded.io.grpc.protobuf.ProtoFileDescriptorSupplier, org.apache.ratis.shaded.io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RaftClientProtocolServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.ratis.shaded.proto.grpc.GRpcProtos.getDescriptor();
    }

    @java.lang.Override
    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RaftClientProtocolService");
    }
  }

  private static final class RaftClientProtocolServiceFileDescriptorSupplier
      extends RaftClientProtocolServiceBaseDescriptorSupplier {
    RaftClientProtocolServiceFileDescriptorSupplier() {}
  }

  private static final class RaftClientProtocolServiceMethodDescriptorSupplier
      extends RaftClientProtocolServiceBaseDescriptorSupplier
      implements org.apache.ratis.shaded.io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RaftClientProtocolServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile org.apache.ratis.shaded.io.grpc.ServiceDescriptor serviceDescriptor;

  public static org.apache.ratis.shaded.io.grpc.ServiceDescriptor getServiceDescriptor() {
    org.apache.ratis.shaded.io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RaftClientProtocolServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = org.apache.ratis.shaded.io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RaftClientProtocolServiceFileDescriptorSupplier())
              .addMethod(getSetConfigurationMethodHelper())
              .addMethod(getAppendMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
