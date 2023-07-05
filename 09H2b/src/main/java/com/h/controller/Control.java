package com.h.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.h.entity.Student;
import com.h.servicelayer.ServiceImpl;

@RestController
public class Control{

	@Autowired
	private ServiceImpl sr;
	
	@GetMapping("/getall")
	public List<Student> getAll(){
		return sr.getAll();
	}
	
	@PostMapping("/insert")
	public Student insert(@RequestBody Student s) {
		return sr.insert(s);
	}
	
	@PostMapping("/update")
	public Student update(@RequestBody Student s) {
		return sr.update(s);
	}
	
	@GetMapping("/findbyid1/{i}")
	public Student getbyid(@PathVariable Integer i) {
	
	return sr.findById1(i);
	}
	
	@DeleteMapping("/delete/{i}")
	public String deletebyid(@PathVariable Integer i) {
		
		sr.deletebyid(i);
		
		return "sucessfully deleted";
	}
	
}