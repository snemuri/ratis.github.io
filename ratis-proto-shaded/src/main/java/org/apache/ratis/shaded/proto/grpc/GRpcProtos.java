// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GRpc.proto

package org.apache.ratis.shaded.proto.grpc;

public final class GRpcProtos {
  private GRpcProtos() {}
  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nGRpc.proto\022\nratis.grpc\032\nRaft.proto2\333\001\n" +
      "\031RaftClientProtocolService\022d\n\020setConfigu" +
      "ration\022*.ratis.common.SetConfigurationRe" +
      "questProto\032\".ratis.common.RaftClientRepl" +
      "yProto\"\000\022X\n\006append\022$.ratis.common.RaftCl" +
      "ientRequestProto\032\".ratis.common.RaftClie" +
      "ntReplyProto\"\000(\0010\0012\312\002\n\031RaftServerProtoco" +
      "lService\022[\n\013requestVote\022%.ratis.common.R" +
      "equestVoteRequestProto\032#.ratis.common.Re" +
      "questVoteReplyProto\"\000\022e\n\rappendEntries\022\'" +
      ".ratis.common.AppendEntriesRequestProto\032" +
      "%.ratis.common.AppendEntriesReplyProto\"\000" +
      "(\0010\001\022i\n\017installSnapshot\022).ratis.common.I" +
      "nstallSnapshotRequestProto\032\'.ratis.commo" +
      "n.InstallSnapshotReplyProto\"\000(\0012\343\001\n\024Admi" +
      "nProtocolService\022\\\n\014reinitialize\022&.ratis" +
      ".common.ReinitializeRequestProto\032\".ratis" +
      ".common.RaftClientReplyProto\"\000\022m\n\021server" +
      "Information\022+.ratis.common.ServerInforma" +
      "tionRequestProto\032).ratis.common.ServerIn" +
      "formationReplyProto\"\000B3\n\"org.apache.rati" +
      "s.shaded.proto.grpcB\nGRpcProtos\240\001\001b\006prot" +
      "o3"
    };
    org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistry assignDescriptors(
              org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.ratis.shaded.proto.RaftProtos.getDescriptor(),
        }, assigner);
    org.apache.ratis.shaded.proto.RaftProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
