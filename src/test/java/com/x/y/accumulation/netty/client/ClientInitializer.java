package com.x.y.accumulation.netty.client;


import com.x.y.accumulation.proto.pan.PanMessage;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

public class ClientInitializer extends ChannelInitializer<SocketChannel> {

    protected void initChannel(SocketChannel ch) throws Exception {
        // decoded
        ch.pipeline().addLast(new ProtobufVarint32FrameDecoder());
        // 添加ProtobufDecoder解码器，它的参数是com.google.protobuf.MessageLite
        // 实际上就是要告诉ProtobufDecoder需要解码的目标类是什么，否则仅仅从字节数组中是
        // 无法判断出要解码的目标类型信息的（客户端需要解析的是服务端请求，所以是Resp）
        ch.pipeline().addLast(new ProtobufDecoder(PanMessage.getDefaultInstance()));
        /**
         * 来自源码的代码注释，用于Protobuf的半包处理
         * * An encoder that prepends the the Google Protocol Buffers
         * <a href="https://developers.google.com/protocol-buffers/docs/encoding?csw=1#varints">Base
         * 128 Varints</a> integer length field. For example:
         * <pre>
         * BEFORE ENCODE (300 bytes)       AFTER ENCODE (302 bytes)
         * +---------------+               +--------+---------------+
         * | Protobuf Data |-------------->| Length | Protobuf Data |
         * |  (300 bytes)  |               | 0xAC02 |  (300 bytes)  |
         * +---------------+               +--------+---------------+
         * </pre> *
         */
        ch.pipeline().addLast(new ProtobufVarint32LengthFieldPrepender());
        // 添加ProtobufEncoder编码器，这样就不需要对SubscribeResp进行手工编码
        ch.pipeline().addLast(new ProtobufEncoder());
        // 添加业务处理handler
        ch.pipeline().addLast(new ClientHandler());
    }

}