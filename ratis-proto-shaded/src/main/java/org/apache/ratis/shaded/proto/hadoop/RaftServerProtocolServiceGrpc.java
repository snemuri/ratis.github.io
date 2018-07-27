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
public final class RaftServerProtocolServiceGrpc {

  private RaftServerProtocolServiceGrpc() {}

  public static final String SERVICE_NAME = "ratis.hadoop.RaftServerProtocolService";

  // Static method descriptors that strictly reflect the proto.
  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRequestVoteMethod()} instead. 
  public static final org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RequestVoteRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RequestVoteReplyProto> METHOD_REQUEST_VOTE = getRequestVoteMethodHelper();

  private static volatile org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RequestVoteRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RequestVoteReplyProto> getRequestVoteMethod;

  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RequestVoteRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RequestVoteReplyProto> getRequestVoteMethod() {
    return getRequestVoteMethodHelper();
  }

  private static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RequestVoteRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.RequestVoteReplyProto> getRequestVoteMethodHelper() {
    org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.RequestVoteRequestProto, org.apache.ratis.shaded.proto.RaftProtos.RequestVoteReplyProto> getRequestVoteMethod;
    if ((getRequestVoteMethod = RaftServerProtocolServiceGrpc.getRequestVoteMethod) == null) {
      synchronized (RaftServerProtocolServiceGrpc.class) {
        if ((getRequestVoteMethod = RaftServerProtocolServiceGrpc.getRequestVoteMethod) == null) {
          RaftServerProtocolServiceGrpc.getRequestVoteMethod = getRequestVoteMethod = 
              org.apache.ratis.shaded.io.grpc.MethodDescriptor.<org.apache.ratis.shaded.proto.RaftProtos.RequestVoteRequestProto, org.apache.ratis.shaded.proto.RaftProtos.RequestVoteReplyProto>newBuilder()
              .setType(org.apache.ratis.shaded.io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ratis.hadoop.RaftServerProtocolService", "requestVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.RequestVoteRequestProto.getDefaultInstance()))
              .setResponseMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.RequestVoteReplyProto.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftServerProtocolServiceMethodDescriptorSupplier("requestVote"))
                  .build();
          }
        }
     }
     return getRequestVoteMethod;
  }
  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAppendEntriesMethod()} instead. 
  public static final org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesReplyProto> METHOD_APPEND_ENTRIES = getAppendEntriesMethodHelper();

  private static volatile org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesReplyProto> getAppendEntriesMethod;

  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesReplyProto> getAppendEntriesMethod() {
    return getAppendEntriesMethodHelper();
  }

  private static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesReplyProto> getAppendEntriesMethodHelper() {
    org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesRequestProto, org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesReplyProto> getAppendEntriesMethod;
    if ((getAppendEntriesMethod = RaftServerProtocolServiceGrpc.getAppendEntriesMethod) == null) {
      synchronized (RaftServerProtocolServiceGrpc.class) {
        if ((getAppendEntriesMethod = RaftServerProtocolServiceGrpc.getAppendEntriesMethod) == null) {
          RaftServerProtocolServiceGrpc.getAppendEntriesMethod = getAppendEntriesMethod = 
              org.apache.ratis.shaded.io.grpc.MethodDescriptor.<org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesRequestProto, org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesReplyProto>newBuilder()
              .setType(org.apache.ratis.shaded.io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ratis.hadoop.RaftServerProtocolService", "appendEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesRequestProto.getDefaultInstance()))
              .setResponseMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesReplyProto.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftServerProtocolServiceMethodDescriptorSupplier("appendEntries"))
                  .build();
          }
        }
     }
     return getAppendEntriesMethod;
  }
  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getInstallSnapshotMethod()} instead. 
  public static final org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotReplyProto> METHOD_INSTALL_SNAPSHOT = getInstallSnapshotMethodHelper();

  private static volatile org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotReplyProto> getInstallSnapshotMethod;

  @org.apache.ratis.shaded.io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotReplyProto> getInstallSnapshotMethod() {
    return getInstallSnapshotMethodHelper();
  }

  private static org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotRequestProto,
      org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotReplyProto> getInstallSnapshotMethodHelper() {
    org.apache.ratis.shaded.io.grpc.MethodDescriptor<org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotRequestProto, org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotReplyProto> getInstallSnapshotMethod;
    if ((getInstallSnapshotMethod = RaftServerProtocolServiceGrpc.getInstallSnapshotMethod) == null) {
      synchronized (RaftServerProtocolServiceGrpc.class) {
        if ((getInstallSnapshotMethod = RaftServerProtocolServiceGrpc.getInstallSnapshotMethod) == null) {
          RaftServerProtocolServiceGrpc.getInstallSnapshotMethod = getInstallSnapshotMethod = 
              org.apache.ratis.shaded.io.grpc.MethodDescriptor.<org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotRequestProto, org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotReplyProto>newBuilder()
              .setType(org.apache.ratis.shaded.io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ratis.hadoop.RaftServerProtocolService", "installSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotRequestProto.getDefaultInstance()))
              .setResponseMarshaller(org.apache.ratis.shaded.io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotReplyProto.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftServerProtocolServiceMethodDescriptorSupplier("installSnapshot"))
                  .build();
          }
        }
     }
     return getInstallSnapshotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RaftServerProtocolServiceStub newStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
    return new RaftServerProtocolServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RaftServerProtocolServiceBlockingStub newBlockingStub(
      org.apache.ratis.shaded.io.grpc.Channel channel) {
    return new RaftServerProtocolServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RaftServerProtocolServiceFutureStub newFutureStub(
      org.apache.ratis.shaded.io.grpc.Channel channel) {
    return new RaftServerProtocolServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RaftServerProtocolServiceImplBase implements org.apache.ratis.shaded.io.grpc.BindableService {

    /**
     */
    public void requestVote(org.apache.ratis.shaded.proto.RaftProtos.RequestVoteRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RequestVoteReplyProto> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestVoteMethodHelper(), responseObserver);
    }

    /**
     */
    public void appendEntries(org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesReplyProto> responseObserver) {
      asyncUnimplementedUnaryCall(getAppendEntriesMethodHelper(), responseObserver);
    }

    /**
     */
    public void installSnapshot(org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotReplyProto> responseObserver) {
      asyncUnimplementedUnaryCall(getInstallSnapshotMethodHelper(), responseObserver);
    }

    @java.lang.Override public final org.apache.ratis.shaded.io.grpc.ServerServiceDefinition bindService() {
      return org.apache.ratis.shaded.io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestVoteMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.ratis.shaded.proto.RaftProtos.RequestVoteRequestProto,
                org.apache.ratis.shaded.proto.RaftProtos.RequestVoteReplyProto>(
                  this, METHODID_REQUEST_VOTE)))
          .addMethod(
            getAppendEntriesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesRequestProto,
                org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesReplyProto>(
                  this, METHODID_APPEND_ENTRIES)))
          .addMethod(
            getInstallSnapshotMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotRequestProto,
                org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotReplyProto>(
                  this, METHODID_INSTALL_SNAPSHOT)))
          .build();
    }
  }

  /**
   */
  public static final class RaftServerProtocolServiceStub extends org.apache.ratis.shaded.io.grpc.stub.AbstractStub<RaftServerProtocolServiceStub> {
    private RaftServerProtocolServiceStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
      super(channel);
    }

    private RaftServerProtocolServiceStub(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftServerProtocolServiceStub build(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      return new RaftServerProtocolServiceStub(channel, callOptions);
    }

    /**
     */
    public void requestVote(org.apache.ratis.shaded.proto.RaftProtos.RequestVoteRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RequestVoteReplyProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestVoteMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void appendEntries(org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesReplyProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAppendEntriesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void installSnapshot(org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotRequestProto request,
        org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotReplyProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInstallSnapshotMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RaftServerProtocolServiceBlockingStub extends org.apache.ratis.shaded.io.grpc.stub.AbstractStub<RaftServerProtocolServiceBlockingStub> {
    private RaftServerProtocolServiceBlockingStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
      super(channel);
    }

    private RaftServerProtocolServiceBlockingStub(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftServerProtocolServiceBlockingStub build(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      return new RaftServerProtocolServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.ratis.shaded.proto.RaftProtos.RequestVoteReplyProto requestVote(org.apache.ratis.shaded.proto.RaftProtos.RequestVoteRequestProto request) {
      return blockingUnaryCall(
          getChannel(), getRequestVoteMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesReplyProto appendEntries(org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesRequestProto request) {
      return blockingUnaryCall(
          getChannel(), getAppendEntriesMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotReplyProto installSnapshot(org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotRequestProto request) {
      return blockingUnaryCall(
          getChannel(), getInstallSnapshotMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RaftServerProtocolServiceFutureStub extends org.apache.ratis.shaded.io.grpc.stub.AbstractStub<RaftServerProtocolServiceFutureStub> {
    private RaftServerProtocolServiceFutureStub(org.apache.ratis.shaded.io.grpc.Channel channel) {
      super(channel);
    }

    private RaftServerProtocolServiceFutureStub(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftServerProtocolServiceFutureStub build(org.apache.ratis.shaded.io.grpc.Channel channel,
        org.apache.ratis.shaded.io.grpc.CallOptions callOptions) {
      return new RaftServerProtocolServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public org.apache.ratis.shaded.com.google.common.util.concurrent.ListenableFuture<org.apache.ratis.shaded.proto.RaftProtos.RequestVoteReplyProto> requestVote(
        org.apache.ratis.shaded.proto.RaftProtos.RequestVoteRequestProto request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestVoteMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public org.apache.ratis.shaded.com.google.common.util.concurrent.ListenableFuture<org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesReplyProto> appendEntries(
        org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesRequestProto request) {
      return futureUnaryCall(
          getChannel().newCall(getAppendEntriesMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public org.apache.ratis.shaded.com.google.common.util.concurrent.ListenableFuture<org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotReplyProto> installSnapshot(
        org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotRequestProto request) {
      return futureUnaryCall(
          getChannel().newCall(getInstallSnapshotMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST_VOTE = 0;
  private static final int METHODID_APPEND_ENTRIES = 1;
  private static final int METHODID_INSTALL_SNAPSHOT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      org.apache.ratis.shaded.io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RaftServerProtocolServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RaftServerProtocolServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, org.apache.ratis.shaded.io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST_VOTE:
          serviceImpl.requestVote((org.apache.ratis.shaded.proto.RaftProtos.RequestVoteRequestProto) request,
              (org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.RequestVoteReplyProto>) responseObserver);
          break;
        case METHODID_APPEND_ENTRIES:
          serviceImpl.appendEntries((org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesRequestProto) request,
              (org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.AppendEntriesReplyProto>) responseObserver);
          break;
        case METHODID_INSTALL_SNAPSHOT:
          serviceImpl.installSnapshot((org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotRequestProto) request,
              (org.apache.ratis.shaded.io.grpc.stub.StreamObserver<org.apache.ratis.shaded.proto.RaftProtos.InstallSnapshotReplyProto>) responseObserver);
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

  private static abstract class RaftServerProtocolServiceBaseDescriptorSupplier
      implements org.apache.ratis.shaded.io.grpc.protobuf.ProtoFileDescriptorSupplier, org.apache.ratis.shaded.io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RaftServerProtocolServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.ratis.shaded.proto.hadoop.HadoopProtos.getDescriptor();
    }

    @java.lang.Override
    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RaftServerProtocolService");
    }
  }

  private static final class RaftServerProtocolServiceFileDescriptorSupplier
      extends RaftServerProtocolServiceBaseDescriptorSupplier {
    RaftServerProtocolServiceFileDescriptorSupplier() {}
  }

  private static final class RaftServerProtocolServiceMethodDescriptorSupplier
      extends RaftServerProtocolServiceBaseDescriptorSupplier
      implements org.apache.ratis.shaded.io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RaftServerProtocolServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RaftServerProtocolServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = org.apache.ratis.shaded.io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RaftServerProtocolServiceFileDescriptorSupplier())
              .addMethod(getRequestVoteMethodHelper())
              .addMethod(getAppendEntriesMethodHelper())
              .addMethod(getInstallSnapshotMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
