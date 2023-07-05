package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.daolayer.Daoimpl;
import com.rest.pojo.Employe;

@RestController
public class Restcontrol {

	@Autowired
	private Daoimpl d;
	
	
	@GetMapping("/getall")
	public List<Employe> getall() {
		List<Employe> all = d.getAll();
		return all;
	}
	
	@PostMapping("/add")
	public String save(@RequestBody Employe e) {
		d.add(e);
		return "inserted successfully";
	}
	
	@GetMapping("/getbyid")
	public Employe findbyid(@RequestParam("id") Integer id) {
		
		return d.findbyid(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer i) {
		d.delete(i);
		return "deleted sucessfully";
	}
	
	
}
