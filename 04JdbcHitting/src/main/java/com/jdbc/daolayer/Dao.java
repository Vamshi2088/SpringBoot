package com.jdbc.daolayer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.jdbc.model.Employe;

public interface Dao {

	
	List<Employe> getAll();
	
	int save(Employe e);
	
	int delete(int id);
	
	List<Employe> getbyid();
	List<Employe> getbyid(int id);
	
	int updatebyid(Employe e);
}
