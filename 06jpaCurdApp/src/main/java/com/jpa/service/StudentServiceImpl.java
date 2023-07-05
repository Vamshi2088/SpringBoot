package com.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.daolayer.StudentDao;
import com.jpa.entity.Person;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao d;
	
	@Override
	public Person Ssave(Person s) {
		return d.save(s);
	}

	@Override
	public Person Supdate(Person s) {
		return d.save(s);
	}

	@Override
	public void Sdelete(Integer id) {

		Person s=new Person();
		s.setId(id);
		
		d.delete(s);
		
	}

	@Override
	public List<Person> SgetAll() {

		List<Person> list = d.findAll();
		
		return list;
	}

	@Override
	public Person Sgetbyid(int i) {
		 Person s = d.findById(i).get();
		return s;
	}

	@Override
	public Person Sgetbyname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person SgetbynameAndsalary(String name, double salary) {
		
		return d.SgetbynameAndsalary(name, salary);
	}

}
