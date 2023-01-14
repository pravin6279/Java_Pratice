package com.collectionDemo.linearSearch;

public class NoElementFoundException  extends Exception{

	private String message;
	public NoElementFoundException(String message) {
		this.message=message;
	}
}
