package com.vish.tutoriel.exceptions;

public class MyException extends Exception {

	public Long code = new Long(500);
	
	public MyException(String message, Long code) {
		super(message);
		this.code = code;
	}
	
	public MyException(Throwable th, String message, Long code) {
		super(message, th);
		this.code = code;
	}
}
