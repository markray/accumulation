package com.x.y.accumulation.netty.client;



import java.io.InputStream;

import com.google.protobuf.ByteString;
import com.google.protobuf.Message;
import com.x.y.accumulation.proto.pan.PanMessage;
import com.x.y.accumulation.proto.pan.Person;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ClientHandler extends SimpleChannelInboundHandler<Message> {

    /**
     * 
     */
    protected void channelRead0(ChannelHandlerContext ctx, Message msg) throws Exception {
        
        System.out.println("Server say : " + msg.toString());
    }

    /**
     * 
     */
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("Client active ");
        InputStream ins=ClientHandler.class.getResourceAsStream("/sample.pcm");
       
       
        byte[] bytes=new byte[8000];
        int len=0;
        while((len=ins.read(bytes))>0){
        	Person p=Person.newBuilder().setId("001").setAudio(ByteString.copyFrom(bytes,0,len)).build();
            PanMessage msg=PanMessage.newBuilder().setMethod("AsrRequest").addPersons(p).build();
            ctx.writeAndFlush(msg);
            
        }
        
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("Client close ");
        super.channelInactive(ctx);
    }

}
