package com.x.y.accumulation.netty.client;

import java.util.Arrays;

import com.x.y.accumulation.proto.pan.PanMessage;

public class TestProtoPandora {
	public static void main(String[] args){
		PanMessage msg=PanMessage.newBuilder().setMethod("AsrRequest").build();
		System.out.println(Arrays.toString(msg.toByteArray()));
	}

}
