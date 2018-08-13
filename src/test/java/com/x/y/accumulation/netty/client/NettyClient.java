package com.x.y.accumulation.netty.client;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

public class NettyClient {  
	  
  
    private Bootstrap bootstrap;  
  
    private ChannelFuture future;  
  
    private boolean init = false;  
  
    private boolean isClosed = false;  
  
    public void start() {  
        if(init) {  
            throw new RuntimeException("client is already started");  
        }  
        //thread model: one worker thread pool,contains selector thread and workers‘.  
        EventLoopGroup workerGroup = new NioEventLoopGroup(2);//1 is OK  
        try {  
            bootstrap = new Bootstrap();  
            bootstrap.group(workerGroup)  
                    .channel(NioSocketChannel.class) //create SocketChannel transport  
                    .option(ChannelOption.CONNECT_TIMEOUT_MILLIS,10000)  
                    .handler(new ClientInitializer());  
            //keep the connection with server，and blocking until closed!   
            future = bootstrap.connect(new InetSocketAddress("30.25.106.18", 9876)); 
            future.sync();
            init = true;  
        } catch (Exception e) {  
        	e.printStackTrace();
            isClosed = true;  
        } finally {  
            if(isClosed) {  
                workerGroup.shutdownGracefully();  
            }  
        }  
    }  
  
    public void close() {  
        if(isClosed) {  
            return;  
        }  
        try {  
            future.channel().close();  
        } finally {  
            bootstrap.group().shutdownGracefully();  
        }  
        isClosed = true;  
    }  
  
   
    public static void main(String[]args){
    	NettyClient nettyClient = new NettyClient();  
        nettyClient.start();  
  
        
    }
      
}  