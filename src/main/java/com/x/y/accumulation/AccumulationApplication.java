package com.x.y.accumulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.x.y.accumulation.netty.server.NettyServer;

@SpringBootApplication
public class AccumulationApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(AccumulationApplication.class, args);
		NettyServer nettyServer = context.getBean(NettyServer.class);
        nettyServer.run();
	}
}
