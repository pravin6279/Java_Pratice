package com.ThrowExceptionHnadling;

public class YoungerException extends RuntimeException {
	
	YoungerException(String msg){
		//System.out.println("You are not eligible for vote");
		super(msg);
		
	}

}
