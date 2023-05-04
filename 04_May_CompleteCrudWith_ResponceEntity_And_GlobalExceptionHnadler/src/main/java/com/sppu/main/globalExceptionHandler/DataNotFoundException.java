package com.sppu.main.globalExceptionHandler;

public class DataNotFoundException extends RuntimeException{

	public DataNotFoundException(String msg) {
		super(msg);
	}
}
