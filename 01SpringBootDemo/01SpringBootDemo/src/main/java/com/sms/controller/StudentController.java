package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.dao.Daolayerimpl;
import com.sms.model.Employe;

@RestController
public class StudentController {
	
	@Autowired
	private Daolayerimpl d;
	
	@GetMapping("/a")
	public String hello() {
		return "welcome to hello url";
		
	}
	
	@GetMapping("/get")
	public List<Employe> getall(){
		
		return d.getAll();
	}

}
