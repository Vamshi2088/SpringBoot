package com.moduletwo.service;

import java.util.List;

import com.moduletwo.entity.Person;

public interface PersonService {
	
	Person Ssave(Person s);
	
	Person Supdate(Person s);
	
	void Sdelete(Integer s);
	 
	List<Person> SgetAll();
	 
	Person Sgetbyid(int i);
	
	

}
