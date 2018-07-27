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
public final class AdminProtocolServiceGrpc {

  private AdminProtocolServiceGrpc() {}

  public static final String SERVICE_NAME = "ratis.grpc.AdminProtocolService";

  // Static method descriptors that strictly reflect the proto.
  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReinitializeMethod()} instead. 
  public static final org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> METHOD_REINITIALIZE = getReinitializeMethodHelper();

  private static volatile org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getReinitializeMethod;

  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getReinitializeMethod() {
    return getReinitializeMethodHelper();
  }

  private static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getReinitializeMethodHelper() {
    org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto, org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getReinitializeMethod;
    if ((getReinitializeMethod = AdminProtocolServiceGrpc.getReinitializeMethod) == null) {
      synchronized (AdminProtocolServiceGrpc.class) {
        if ((getReinitializeMethod = AdminProtocolServiceGrpc.getReinitializeMethod) == null) {
          AdminProtocolServiceGrpc.getReinitializeMethod = getReinitializeMethod = 
              org.apache.ratis.shaded.io.grpc.MethodDescriptor.<org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto, org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>newBuilder()
              .setType(org.apache.ratis.shaded.io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ratis.grpc.AdminProtocolService", "reinitialize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto.getDefaultInstance()))
              .setResponseMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto.getDefaultInstance()))
                  .setSchemaDescriptor(new AdminProtocolServiceMethodDescriptorSupplier("reinitialize"))
                  .build();
          }
        }
     }
     return getReinitializeMethod;
  }
  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getServerInformationMethod()} instead. 
  public static final org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto> METHOD_SERVER_INFORMATION = getServerInformationMethodHelper();

  private static volatile org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto> getServerInformationMethod;

  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto> getServerInformationMethod() {
    return getServerInformationMethodHelper();
  }

  private static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto> getServerInformationMethodHelper() {
    org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto, org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto> getServerInformationMethod;
    if ((getServerInformationMethod = AdminProtocolServiceGrpc.getServerInformationMethod) == null) {
      synchronized (AdminProtocolServiceGrpc.class) {
        if ((getServerInformationMethod = AdminProtocolServiceGrpc.getServerInformationMethod) == null) {
          AdminProtocolServiceGrpc.getServerInformationMethod = getServerInformationMethod = 
              org.apache.ratis.shaded.io.grpc.MethodDescriptor.<org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto, org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto>newBuilder()
              .setType(org.apache.ratis.shaded.io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ratis.grpc.AdminProtocolService", "serverInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto.getDefaultInstance()))
              .setResponseMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto.getDefaultInstance()))
                  .setSchemaDescriptor(new AdminProtocolServiceMethodDescriptorSupplier("serverInformation"))
                  .build();
          }
        }
     }
     return getServerInformationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdminProtocolServiceStub newStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
    return new AdminProtocolServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdminProtocolServiceBlockingStub newBlockingStub(
      org.apache.ratis.shaded.io.grpc.Channel channel) {
    return new AdminProtocolServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdminProtocolServiceFutureStub newFutureStub(
      org.apache.ratis.shaded.io.grpc.Channel channel) {
    return new AdminProtocolServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AdminProtocolServiceImplBase implements org.apache.ratis.shaded.io.grpc.BindableService {

    /**
     * <pre>
     * A client-to-server RPC to reinitialize the server
     * </pre>
     */
    public void reinitialize(org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> responseObserver) {
      asyncUnimplementedUnaryCall(getReinitializeMethodHelper(), responseObserver);
    }

    /**
     */
    public void serverInformation(org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto> responseObserver) {
      asyncUnimplementedUnaryCall(getServerInformationMethodHelper(), responseObserver);
    }

    @java.lang.Override public final org.apache.ratis.shaded.io.grpc.ServerServiceDefinition bindService() {
      return org.apache.ratis.shaded.io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReinitializeMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto,
                org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>(
                  this, METHODID_REINITIALIZE)))
          .addMethod(
            getServerInformationMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto,
                org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto>(
                  this, METHODID_SERVER_INFORMATION)))
          .build();
    }
  }

  /**
   */
  public static final class AdminProtocolServiceStub extends org.apache.ratis.shaded.io.grpc.stub.AbstractStub<AdminProtocolServiceStub> {
    private AdminProtocolServiceStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
      super(channel);
    }

    private AdminProtocolServiceStub(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminProtocolServiceStub build(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      return new AdminProtocolServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * A client-to-server RPC to reinitialize the server
     * </pre>
     */
    public void reinitialize(org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReinitializeMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverInformation(org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getServerInformationMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AdminProtocolServiceBlockingStub extends org.apache.ratis.shaded.io.grpc.stub.AbstractStub<AdminProtocolServiceBlockingStub> {
    private AdminProtocolServiceBlockingStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
      super(channel);
    }

    private AdminProtocolServiceBlockingStub(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminProtocolServiceBlockingStub build(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      return new AdminProtocolServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A client-to-server RPC to reinitialize the server
     * </pre>
     */
    public org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto reinitialize(org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto request) {
      return blockingUnaryCall(
          getChannel(), getReinitializeMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto serverInformation(org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto request) {
      return blockingUnaryCall(
          getChannel(), getServerInformationMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AdminProtocolServiceFutureStub extends org.apache.ratis.shaded.io.grpc.stub.AbstractStub<AdminProtocolServiceFutureStub> {
    private AdminProtocolServiceFutureStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
      super(channel);
    }

    private AdminProtocolServiceFutureStub(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminProtocolServiceFutureStub build(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      return new AdminProtocolServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A client-to-server RPC to reinitialize the server
     * </pre>
     */
    public org.apache.ratis.shaded.com.google.common.util.concurrent.ListenableFuture<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> reinitialize(
        org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto request) {
      return futureUnaryCall(
          getChannel().newCall(getReinitializeMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public org.apache.ratis.shaded.com.google.common.util.concurrent.ListenableFuture<org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto> serverInformation(
        org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto request) {
      return futureUnaryCall(
          getChannel().newCall(getServerInformationMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REINITIALIZE = 0;
  private static final int METHODID_SERVER_INFORMATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdminProtocolServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdminProtocolServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, org.apache.ratis.shaded.io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REINITIALIZE:
          serviceImpl.reinitialize((org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto) request,
              (org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>) responseObserver);
          break;
        case METHODID_SERVER_INFORMATION:
          serviceImpl.serverInformation((org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto) request,
              (org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AdminProtocolServiceBaseDescriptorSupplier
      implements org.apache.ratis.shaded.io.grpc.protobuf.ProtoFileDescriptorSupplier, org.apache.ratis.shaded.io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdminProtocolServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.ratis.shaded.proto.grpc.GRpcProtos.getDescriptor();
    }

    @java.lang.Override
    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdminProtocolService");
    }
  }

  private static final class AdminProtocolServiceFileDescriptorSupplier
      extends AdminProtocolServiceBaseDescriptorSupplier {
    AdminProtocolServiceFileDescriptorSupplier() {}
  }

  private static final class AdminProtocolServiceMethodDescriptorSupplier
      extends AdminProtocolServiceBaseDescriptorSupplier
      implements org.apache.ratis.shaded.io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdminProtocolServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdminProtocolServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = org.apache.ratis.shaded.io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdminProtocolServiceFileDescriptorSupplier())
              .addMethod(getReinitializeMethodHelper())
              .addMethod(getServerInformationMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
