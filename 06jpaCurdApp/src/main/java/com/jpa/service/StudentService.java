package com.jpa.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.jpa.entity.Person;

public interface StudentService {


	
	Person Ssave(Person s);
	
	Person Supdate(Person s);
	
	void Sdelete(Integer s);
	
	List<Person> SgetAll();
	 
	Person Sgetbyid(int i);
	
	Person Sgetbyname(String name);
	
	Person SgetbynameAndsalary(String name,double salary);
	
	
	
}
