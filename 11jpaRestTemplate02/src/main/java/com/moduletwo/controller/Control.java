package com.moduletwo.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.moduletwo.entity.Person;

@RestController
public class Control {

	@Autowired
	private RestTemplate rt;

	@RequestMapping("/template/allinfo")
	public String getAllinfo() {
		HttpHeaders h = new HttpHeaders();
		h.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> s = new HttpEntity<>(h);
		return rt.exchange("http://localhost:7412/findall", HttpMethod.GET, s, String.class).getBody();

	}

	@PostMapping("/rest/save")
	public ResponseEntity<Person> save(@RequestBody Person e) {
		HttpHeaders h = new HttpHeaders();
		h.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> s = new HttpEntity<>(h);
		return rt.postForEntity("http://localhost:7412/save",e, Person.class);

	}
}
