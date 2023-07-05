package com.h.servicelayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h.daolayer.Dao;
import com.h.entity.Student;
@Service
public class ServiceImpl implements Servicee {

	@Autowired
	private Dao d;
	
	@Override
	public List<Student> getAll() {
	
		return d.findAll();
	}

	@Override
	public Student insert(Student s) {
		return d.save(s);
	}

	@Override
	public Student update(Student s) {
		return d.save(s);
	}

	@Override
	public Student findById1(Integer id) {

		return d.findById(id).get();
	}

	@Override
	public Optional<Student> findById2(Integer id) {
		return Optional.empty();
	}

	@Override
	public void deletebyid(Integer id) {
		
		d.deleteById(id);
	}
	

}
