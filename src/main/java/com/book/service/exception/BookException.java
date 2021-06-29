package com.book.service.exception;

public class BookException extends Exception{
	
	public BookException(){
		super();
	}
	
	public BookException(String message){
		super(message);
	}
	
	public BookException(String message, Throwable cause){
		super(message, cause);
	}
	
	public BookException(Throwable cause){
		super(cause);
	}
	
	protected BookException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
