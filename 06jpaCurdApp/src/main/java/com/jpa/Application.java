package com.jpa;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.entity.Person;
import com.jpa.service.StudentServiceImpl;


@SpringBootApplication
public class Application  {

	public static void main(String[] args) {
	SpringApplication.run(Application.class, args);

	
	}

}
