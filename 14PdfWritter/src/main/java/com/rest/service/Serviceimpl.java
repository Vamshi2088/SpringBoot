package com.rest.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.daolayer.PersonDao;
import com.rest.pojo.Person;
@Service
public class Serviceimpl implements PersonService {

	@Autowired
	private PersonDao pd;
	
	@Override
	public Person Ssave(Person s) {

		return pd.save(s);
	}

	@Override
	public Person Supdate(Person s) {

		return pd.save(s);
	}

	@Override
	public void Sdelete(Integer s) {

		Person p=new Person();
		p.setId(s);
		pd.delete(p);
		
	}

	@Override
	public List<Person> SgetAll() {
	
		
		return pd.findAll();
	}

	@Override
	public Person Sgetbyid(int i) {
		return pd.findById(i).get();
	}

}
