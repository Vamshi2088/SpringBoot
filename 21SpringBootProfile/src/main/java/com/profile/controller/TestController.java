package com.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
	
	@Value("${spring.profilename}")
	private String envName;
	
	
	@GetMapping
	private String envName() {
		return envName;
	}
 
}
