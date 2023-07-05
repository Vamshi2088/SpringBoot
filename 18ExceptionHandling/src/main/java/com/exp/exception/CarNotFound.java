package com.exp.exception;

import org.springframework.stereotype.Component;

@Component
public class CarNotFound extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public CarNotFound() {
	}



	public CarNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}



	public CarNotFound(String message, Throwable cause) {
		super(message, cause);
	}



	public CarNotFound(Throwable cause) {
		super(cause);
	}



	public CarNotFound (String msg){
		super(msg);
	}
	
}
