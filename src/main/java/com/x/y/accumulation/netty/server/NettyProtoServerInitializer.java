package com.x.y.accumulation.netty.server;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.x.y.accumulation.proto.pan.PanMessage;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.timeout.IdleStateHandler;

@Component
public class NettyProtoServerInitializer extends ChannelInitializer<SocketChannel> {


@Override
protected void initChannel(SocketChannel ch) throws Exception {
    ChannelPipeline ph = ch.pipeline();
 
    //入参说明: 读超时时间、写超时时间、所有类型的超时时间、时间格式
    //ph.addLast(new IdleStateHandler(180, 0, 0, TimeUnit.SECONDS));
    // 解码和编码，应和客户端一致
    //传输的协议 Protobuf
    ph.addLast(new ProtobufVarint32FrameDecoder());
    ph.addLast(new ProtobufDecoder(PanMessage.getDefaultInstance()));
    ph.addLast(new ProtobufVarint32LengthFieldPrepender());
    ph.addLast(new ProtobufEncoder());
    
    //业务逻辑实现类
    ph.addLast("nettyServerHandler", new NettyProtoServerHandler());
  }
}
