package org.apache.ratis.shaded.proto.hadoop;

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
    comments = "Source: Hadoop.proto")
public final class CombinedClientProtocolServiceGrpc {

  private CombinedClientProtocolServiceGrpc() {}

  public static final String SERVICE_NAME = "ratis.hadoop.CombinedClientProtocolService";

  // Static method descriptors that strictly reflect the proto.
  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSubmitClientRequestMethod()} instead. 
  public static final org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> METHOD_SUBMIT_CLIENT_REQUEST = getSubmitClientRequestMethodHelper();

  private static volatile org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getSubmitClientRequestMethod;

  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getSubmitClientRequestMethod() {
    return getSubmitClientRequestMethodHelper();
  }

  private static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getSubmitClientRequestMethodHelper() {
    org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto, org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> getSubmitClientRequestMethod;
    if ((getSubmitClientRequestMethod = CombinedClientProtocolServiceGrpc.getSubmitClientRequestMethod) == null) {
      synchronized (CombinedClientProtocolServiceGrpc.class) {
        if ((getSubmitClientRequestMethod = CombinedClientProtocolServiceGrpc.getSubmitClientRequestMethod) == null) {
          CombinedClientProtocolServiceGrpc.getSubmitClientRequestMethod = getSubmitClientRequestMethod = 
              org.apache.ratis.shaded.io.grpc.MethodDescriptor.<org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto, org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>newBuilder()
              .setType(org.apache.ratis.shaded.io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ratis.hadoop.CombinedClientProtocolService", "submitClientRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto.getDefaultInstance()))
              .setResponseMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto.getDefaultInstance()))
                  .setSchemaDescriptor(new CombinedClientProtocolServiceMethodDescriptorSupplier("submitClientRequest"))
                  .build();
          }
        }
     }
     return getSubmitClientRequestMethod;
  }
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
    if ((getSetConfigurationMethod = CombinedClientProtocolServiceGrpc.getSetConfigurationMethod) == null) {
      synchronized (CombinedClientProtocolServiceGrpc.class) {
        if ((getSetConfigurationMethod = CombinedClientProtocolServiceGrpc.getSetConfigurationMethod) == null) {
          CombinedClientProtocolServiceGrpc.getSetConfigurationMethod = getSetConfigurationMethod = 
              org.apache.ratis.shaded.io.grpc.MethodDescriptor.<org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto, org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>newBuilder()
              .setType(org.apache.ratis.shaded.io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ratis.hadoop.CombinedClientProtocolService", "setConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto.getDefaultInstance()))
              .setResponseMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto.getDefaultInstance()))
                  .setSchemaDescriptor(new CombinedClientProtocolServiceMethodDescriptorSupplier("setConfiguration"))
                  .build();
          }
        }
     }
     return getSetConfigurationMethod;
  }
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
    if ((getReinitializeMethod = CombinedClientProtocolServiceGrpc.getReinitializeMethod) == null) {
      synchronized (CombinedClientProtocolServiceGrpc.class) {
        if ((getReinitializeMethod = CombinedClientProtocolServiceGrpc.getReinitializeMethod) == null) {
          CombinedClientProtocolServiceGrpc.getReinitializeMethod = getReinitializeMethod = 
              org.apache.ratis.shaded.io.grpc.MethodDescriptor.<org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto, org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>newBuilder()
              .setType(org.apache.ratis.shaded.io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ratis.hadoop.CombinedClientProtocolService", "reinitialize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.ReinitializeRequestProto.getDefaultInstance()))
              .setResponseMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto.getDefaultInstance()))
                  .setSchemaDescriptor(new CombinedClientProtocolServiceMethodDescriptorSupplier("reinitialize"))
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
    if ((getServerInformationMethod = CombinedClientProtocolServiceGrpc.getServerInformationMethod) == null) {
      synchronized (CombinedClientProtocolServiceGrpc.class) {
        if ((getServerInformationMethod = CombinedClientProtocolServiceGrpc.getServerInformationMethod) == null) {
          CombinedClientProtocolServiceGrpc.getServerInformationMethod = getServerInformationMethod = 
              org.apache.ratis.shaded.io.grpc.MethodDescriptor.<org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto, org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto>newBuilder()
              .setType(org.apache.ratis.shaded.io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ratis.hadoop.CombinedClientProtocolService", "serverInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.ServerInformationRequestProto.getDefaultInstance()))
              .setResponseMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.ServerInformationReplyProto.getDefaultInstance()))
                  .setSchemaDescriptor(new CombinedClientProtocolServiceMethodDescriptorSupplier("serverInformation"))
                  .build();
          }
        }
     }
     return getServerInformationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CombinedClientProtocolServiceStub newStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
    return new CombinedClientProtocolServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CombinedClientProtocolServiceBlockingStub newBlockingStub(
      org.apache.ratis.shaded.io.grpc.Channel channel) {
    return new CombinedClientProtocolServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CombinedClientProtocolServiceFutureStub newFutureStub(
      org.apache.ratis.shaded.io.grpc.Channel channel) {
    return new CombinedClientProtocolServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CombinedClientProtocolServiceImplBase implements org.apache.ratis.shaded.io.grpc.BindableService {

    /**
     */
    public void submitClientRequest(org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitClientRequestMethodHelper(), responseObserver);
    }

    /**
     */
    public void setConfiguration(org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> responseObserver) {
      asyncUnimplementedUnaryCall(getSetConfigurationMethodHelper(), responseObserver);
    }

    /**
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
            getSubmitClientRequestMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto,
                org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>(
                  this, METHODID_SUBMIT_CLIENT_REQUEST)))
          .addMethod(
            getSetConfigurationMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto,
                org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>(
                  this, METHODID_SET_CONFIGURATION)))
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
  public static final class CombinedClientProtocolServiceStub extends org.apache.ratis.shaded.io.grpc.stub.AbstractStub<CombinedClientProtocolServiceStub> {
    private CombinedClientProtocolServiceStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
      super(channel);
    }

    private CombinedClientProtocolServiceStub(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CombinedClientProtocolServiceStub build(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      return new CombinedClientProtocolServiceStub(channel, callOptions);
    }

    /**
     */
    public void submitClientRequest(org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitClientRequestMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setConfiguration(org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetConfigurationMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
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
  public static final class CombinedClientProtocolServiceBlockingStub extends org.apache.ratis.shaded.io.grpc.stub.AbstractStub<CombinedClientProtocolServiceBlockingStub> {
    private CombinedClientProtocolServiceBlockingStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
      super(channel);
    }

    private CombinedClientProtocolServiceBlockingStub(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CombinedClientProtocolServiceBlockingStub build(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      return new CombinedClientProtocolServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto submitClientRequest(org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto request) {
      return blockingUnaryCall(
          getChannel(), getSubmitClientRequestMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto setConfiguration(org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto request) {
      return blockingUnaryCall(
          getChannel(), getSetConfigurationMethodHelper(), getCallOptions(), request);
    }

    /**
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
  public static final class CombinedClientProtocolServiceFutureStub extends org.apache.ratis.shaded.io.grpc.stub.AbstractStub<CombinedClientProtocolServiceFutureStub> {
    private CombinedClientProtocolServiceFutureStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
      super(channel);
    }

    private CombinedClientProtocolServiceFutureStub(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CombinedClientProtocolServiceFutureStub build(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      return new CombinedClientProtocolServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public org.apache.ratis.shaded.com.google.common.util.concurrent.ListenableFuture<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> submitClientRequest(
        org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitClientRequestMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public org.apache.ratis.shaded.com.google.common.util.concurrent.ListenableFuture<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto> setConfiguration(
        org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto request) {
      return futureUnaryCall(
          getChannel().newCall(getSetConfigurationMethodHelper(), getCallOptions()), request);
    }

    /**
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

  private static final int METHODID_SUBMIT_CLIENT_REQUEST = 0;
  private static final int METHODID_SET_CONFIGURATION = 1;
  private static final int METHODID_REINITIALIZE = 2;
  private static final int METHODID_SERVER_INFORMATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CombinedClientProtocolServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CombinedClientProtocolServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, org.apache.ratis.shaded.io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBMIT_CLIENT_REQUEST:
          serviceImpl.submitClientRequest((org.apache.ratis.shaded.proto.RaftProtos.RaftClientRequestProto) request,
              (org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>) responseObserver);
          break;
        case METHODID_SET_CONFIGURATION:
          serviceImpl.setConfiguration((org.apache.ratis.shaded.proto.RaftProtos.SetConfigurationRequestProto) request,
              (org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RaftClientReplyProto>) responseObserver);
          break;
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

  private static abstract class CombinedClientProtocolServiceBaseDescriptorSupplier
      implements org.apache.ratis.shaded.io.grpc.protobuf.ProtoFileDescriptorSupplier, org.apache.ratis.shaded.io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CombinedClientProtocolServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.ratis.shaded.proto.hadoop.HadoopProtos.getDescriptor();
    }

    @java.lang.Override
    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CombinedClientProtocolService");
    }
  }

  private static final class CombinedClientProtocolServiceFileDescriptorSupplier
      extends CombinedClientProtocolServiceBaseDescriptorSupplier {
    CombinedClientProtocolServiceFileDescriptorSupplier() {}
  }

  private static final class CombinedClientProtocolServiceMethodDescriptorSupplier
      extends CombinedClientProtocolServiceBaseDescriptorSupplier
      implements org.apache.ratis.shaded.io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CombinedClientProtocolServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CombinedClientProtocolServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = org.apache.ratis.shaded.io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CombinedClientProtocolServiceFileDescriptorSupplier())
              .addMethod(getSubmitClientRequestMethodHelper())
              .addMethod(getSetConfigurationMethodHelper())
              .addMethod(getReinitializeMethodHelper())
              .addMethod(getServerInformationMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
