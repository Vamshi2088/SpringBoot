package com.rest.daolayer;

import java.util.List;

import com.rest.pojo.Employe;

public interface Dao {
	
	List<Employe> getAll();
	
	 Employe add(Employe e) ;
	 
	 Employe findbyid(Integer id);
	 
	 void delete(Integer i);
	 
	 

	 
	 
}
