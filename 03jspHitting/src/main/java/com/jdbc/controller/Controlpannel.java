package com.jdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlpannel {
	
	
	@GetMapping("/get")
	public String get() {
		return "getall";
		
	}

	@ResponseBody
	@GetMapping("/a/{name}")
	public String check(@PathVariable String name) {
		
		return "where are you from (path-variable) "+name;
	}
	
	@ResponseBody
	@GetMapping("/b")
	public String check2(@RequestParam String name) {
		
		return "where are you from (request-param)"+name;
	}
}
