package com.exp.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.daolayer.CarDao;
import com.exp.entity.Car;
import com.exp.exception.CarNotFound;

import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class CarService {

	@Autowired
	private CarDao d;

	
	public Car findCar(Long l) {
		return d.findById(l).get();
	}
	
	public Car newCar(Car c) {
		return d.save(c);
	}
	

}
