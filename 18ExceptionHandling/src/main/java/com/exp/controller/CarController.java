package com.exp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.NoSuchElementException;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exp.entity.Car;
import com.exp.exception.CarNotFound;
import com.exp.service.CarService;

@RestController
public class CarController {
 
	
	@Autowired
	private CarService cs;
	
	@GetMapping("/findacar/{l}")
	public ResponseEntity<?> FindAcar(@PathVariable("l") Long l)  {
		try {
			return  new ResponseEntity(cs.findCar(l),HttpStatus.OK);
		}
		catch (NoSuchElementException e) {
		return new ResponseEntity("no cars are present ",HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getacar/{l}")
	public ResponseEntity<?> getAcar(@PathVariable("l") Long l) throws CarNotFound{
		try {
			return new ResponseEntity(cs.findCar(l),HttpStatus.OK);
		}catch(NoSuchElementException e) {
			throw new CarNotFound("car not found at given details");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
