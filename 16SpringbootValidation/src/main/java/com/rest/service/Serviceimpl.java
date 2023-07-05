package com.rest.service;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		System.out.println("before");
		Person person = pd.findById(i).get();
		System.out.println("after");
		return person;
	}
	public static void main(String[] args) {
		
		Map<String, String> m=new HashMap<>();
		m.put("sunday", "to");
		m.put("sunday", "to");
		m.put("sunday", "to");
		
		Map<String, String> m2=new HashMap<>();
		m2.put("sunday", "to");
		m2.put("sunday", "to");
		m2.put("sunday", "to");
		Map<String, String> m3=new HashMap<>();
		m3.put("sunday", "to");
		m3.put("sunday", "to");
		m3.put("sunday", "to");
		
		List<Map<String, String>> l=new ArrayList<>();
		l.add(m);
		l.add(m2);
		l.add(m3);
		
//		l.stream().flatMap(e->e.entrySet().forEach(Co))
		
	}

}
