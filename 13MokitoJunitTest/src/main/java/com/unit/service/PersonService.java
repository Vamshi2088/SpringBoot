package com.unit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unit.pojo.Person;


public interface PersonService {
	
	Person Ssave(Person s);
	
	Person Supdate(Person s);
	
	void Sdelete(Integer s);
	 
	List<Person> SgetAll();
	 
	Person Sgetbyid(int i);
	
	

}
