package com.exp.exceptionhandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.exp.exception.CarNotFound;

@RestControllerAdvice
public class Exeception_Handlinggg extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(CarNotFound.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public Map<String, String>  exceptionHandlerr(CarNotFound cnf){
		Map<String, String> errors=new HashMap<>();
		errors.put("car not found from the DataBase", cnf.getMessage());
		return errors;
	}
	
}
