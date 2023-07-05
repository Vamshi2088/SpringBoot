package com.unit.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unit.entity.Emply;
import com.unit.service.Serviceimpl;

@RestController
public class Control {

	@Autowired
	private Serviceimpl s;

	@GetMapping("/findall")
	public ResponseEntity<?> getAll() {

		return new ResponseEntity<>(s.EgetAll(), HttpStatus.OK);
	}

	@PostMapping("/save")
	public Emply save(@RequestHeader(value = "application/xml") @RequestBody Emply e) {
		System.out.println(e);
		return s.Esave(e);

	}

	@GetMapping("/getbyid/{i}")
	public ResponseEntity<?> getbyid(@PathVariable int i) {
		Optional<Emply> e = s.Egetbyid(i);
		if (e.isPresent()) {
			return new ResponseEntity<>(e, HttpStatus.OK);
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("sdfghjk");
		}
	}

//	 concurrent hash-map 
	@GetMapping("/getbyid2/{i}")
	public ResponseEntity<?> getbyid2(@PathVariable int i) {
		Emply emply = s.getbyid2(i);
		if (emply != null) {
			return new ResponseEntity<>(emply, HttpStatus.OK);
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("object not found");
		}
	}

	@PostMapping("/update")
	public ResponseEntity<Emply> update(@RequestBody Emply e) {
		return new ResponseEntity<>(s.Eupdate(e), HttpStatus.OK);
	} 

	@GetMapping("/delete")
	public void delete(@RequestParam int i) {
		s.Edelete(i);
	}

}
