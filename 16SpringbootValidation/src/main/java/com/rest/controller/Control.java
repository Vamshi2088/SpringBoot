 package com.rest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.rest.pojo.Person;
import com.rest.service.Serviceimpl;

@RestController
public class Control {
	
	@Autowired
	private Serviceimpl s;
	
	
	@PostMapping("/save")
	public ResponseEntity<Person> save(@Valid @RequestBody Person p) {
		return new ResponseEntity<Person>(s.Ssave(p),HttpStatus.CREATED);
	
	}
	
	@GetMapping("/getbyid/{i}")
	public Person getbyid(@PathVariable int i) {
		Person person = s.Sgetbyid(i);
		System.out.println("controller");
		return person;
	}
	
	@PostMapping("/update")
	public Person update(@RequestBody Person p) {
		return s.Supdate(p);
	}
	@GetMapping("/delete")
	public void delete(@RequestParam int i) {
		s.Sdelete(i);
	}
	
	
	
	

}
