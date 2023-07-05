package com.h.servicelayer;

import java.util.List;

import java.util.Optional;

import com.h.entity.Student;

public interface Servicee {

	List<Student> getAll();
	
	Student insert(Student s);
	
	Student update(Student s);
	
	Student findById1(Integer i);
	
	Optional<Student> findById2(Integer id);
	
	void deletebyid(Integer id);
	
	
	
}
