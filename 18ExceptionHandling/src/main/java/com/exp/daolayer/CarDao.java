package com.exp.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exp.entity.Car;

public interface CarDao extends JpaRepository<Car, Long> {
	
	

}
