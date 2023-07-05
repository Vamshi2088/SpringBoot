package com.unit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unit.pojo.Person;
import com.unit.service.Serviceimpl;

@RestController
public class Control {
	
	@Autowired
	private Serviceimpl s;
	
	@GetMapping("/findall")
	public List<Person> getAll() {
		
		return s.SgetAll();
	}
	
	@PostMapping("/save")
	public Person save(@RequestBody Person p) {
		return 	s.Ssave(p);
		
	}
	
	@GetMapping("/getbyid/{i}")
	public Person getbyid(@PathVariable int i) {
		return s.Sgetbyid(i);
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
