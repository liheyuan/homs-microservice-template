package com.coder4.homs.template;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: HomsTemplate.proto")
public final class HomsTemplateGrpc {

  private HomsTemplateGrpc() {}

  public static final String SERVICE_NAME = "HomsTemplate";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.coder4.homs.template.HomsTemplateProto.AddRequest,
      com.coder4.homs.template.HomsTemplateProto.AddResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = com.coder4.homs.template.HomsTemplateProto.AddRequest.class,
      responseType = com.coder4.homs.template.HomsTemplateProto.AddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coder4.homs.template.HomsTemplateProto.AddRequest,
      com.coder4.homs.template.HomsTemplateProto.AddResponse> getAddMethod() {
    io.grpc.MethodDescriptor<com.coder4.homs.template.HomsTemplateProto.AddRequest, com.coder4.homs.template.HomsTemplateProto.AddResponse> getAddMethod;
    if ((getAddMethod = HomsTemplateGrpc.getAddMethod) == null) {
      synchronized (HomsTemplateGrpc.class) {
        if ((getAddMethod = HomsTemplateGrpc.getAddMethod) == null) {
          HomsTemplateGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<com.coder4.homs.template.HomsTemplateProto.AddRequest, com.coder4.homs.template.HomsTemplateProto.AddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coder4.homs.template.HomsTemplateProto.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coder4.homs.template.HomsTemplateProto.AddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HomsTemplateMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coder4.homs.template.HomsTemplateProto.AddSingleRequest,
      com.coder4.homs.template.HomsTemplateProto.AddResponse> getAdd2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add2",
      requestType = com.coder4.homs.template.HomsTemplateProto.AddSingleRequest.class,
      responseType = com.coder4.homs.template.HomsTemplateProto.AddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.coder4.homs.template.HomsTemplateProto.AddSingleRequest,
      com.coder4.homs.template.HomsTemplateProto.AddResponse> getAdd2Method() {
    io.grpc.MethodDescriptor<com.coder4.homs.template.HomsTemplateProto.AddSingleRequest, com.coder4.homs.template.HomsTemplateProto.AddResponse> getAdd2Method;
    if ((getAdd2Method = HomsTemplateGrpc.getAdd2Method) == null) {
      synchronized (HomsTemplateGrpc.class) {
        if ((getAdd2Method = HomsTemplateGrpc.getAdd2Method) == null) {
          HomsTemplateGrpc.getAdd2Method = getAdd2Method =
              io.grpc.MethodDescriptor.<com.coder4.homs.template.HomsTemplateProto.AddSingleRequest, com.coder4.homs.template.HomsTemplateProto.AddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coder4.homs.template.HomsTemplateProto.AddSingleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coder4.homs.template.HomsTemplateProto.AddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HomsTemplateMethodDescriptorSupplier("Add2"))
              .build();
        }
      }
    }
    return getAdd2Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HomsTemplateStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomsTemplateStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomsTemplateStub>() {
        @java.lang.Override
        public HomsTemplateStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomsTemplateStub(channel, callOptions);
        }
      };
    return HomsTemplateStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HomsTemplateBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomsTemplateBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomsTemplateBlockingStub>() {
        @java.lang.Override
        public HomsTemplateBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomsTemplateBlockingStub(channel, callOptions);
        }
      };
    return HomsTemplateBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HomsTemplateFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomsTemplateFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomsTemplateFutureStub>() {
        @java.lang.Override
        public HomsTemplateFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomsTemplateFutureStub(channel, callOptions);
        }
      };
    return HomsTemplateFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HomsTemplateImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(com.coder4.homs.template.HomsTemplateProto.AddRequest request,
        io.grpc.stub.StreamObserver<com.coder4.homs.template.HomsTemplateProto.AddResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.coder4.homs.template.HomsTemplateProto.AddSingleRequest> add2(
        io.grpc.stub.StreamObserver<com.coder4.homs.template.HomsTemplateProto.AddResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAdd2Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.coder4.homs.template.HomsTemplateProto.AddRequest,
                com.coder4.homs.template.HomsTemplateProto.AddResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getAdd2Method(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.coder4.homs.template.HomsTemplateProto.AddSingleRequest,
                com.coder4.homs.template.HomsTemplateProto.AddResponse>(
                  this, METHODID_ADD2)))
          .build();
    }
  }

  /**
   */
  public static final class HomsTemplateStub extends io.grpc.stub.AbstractAsyncStub<HomsTemplateStub> {
    private HomsTemplateStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomsTemplateStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomsTemplateStub(channel, callOptions);
    }

    /**
     */
    public void add(com.coder4.homs.template.HomsTemplateProto.AddRequest request,
        io.grpc.stub.StreamObserver<com.coder4.homs.template.HomsTemplateProto.AddResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.coder4.homs.template.HomsTemplateProto.AddSingleRequest> add2(
        io.grpc.stub.StreamObserver<com.coder4.homs.template.HomsTemplateProto.AddResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAdd2Method(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class HomsTemplateBlockingStub extends io.grpc.stub.AbstractBlockingStub<HomsTemplateBlockingStub> {
    private HomsTemplateBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomsTemplateBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomsTemplateBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.coder4.homs.template.HomsTemplateProto.AddResponse add(com.coder4.homs.template.HomsTemplateProto.AddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HomsTemplateFutureStub extends io.grpc.stub.AbstractFutureStub<HomsTemplateFutureStub> {
    private HomsTemplateFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomsTemplateFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomsTemplateFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coder4.homs.template.HomsTemplateProto.AddResponse> add(
        com.coder4.homs.template.HomsTemplateProto.AddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_ADD2 = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HomsTemplateImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HomsTemplateImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((com.coder4.homs.template.HomsTemplateProto.AddRequest) request,
              (io.grpc.stub.StreamObserver<com.coder4.homs.template.HomsTemplateProto.AddResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD2:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.add2(
              (io.grpc.stub.StreamObserver<com.coder4.homs.template.HomsTemplateProto.AddResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HomsTemplateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HomsTemplateBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.coder4.homs.template.HomsTemplateProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HomsTemplate");
    }
  }

  private static final class HomsTemplateFileDescriptorSupplier
      extends HomsTemplateBaseDescriptorSupplier {
    HomsTemplateFileDescriptorSupplier() {}
  }

  private static final class HomsTemplateMethodDescriptorSupplier
      extends HomsTemplateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HomsTemplateMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HomsTemplateGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HomsTemplateFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getAdd2Method())
              .build();
        }
      }
    }
    return result;
  }
}
