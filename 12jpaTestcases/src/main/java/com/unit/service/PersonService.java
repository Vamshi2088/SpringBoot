package com.unit.service;

import java.util.List;

import java.util.Optional;

import com.unit.entity.Emply;
public interface PersonService  {
	
	Emply Esave(Emply e);
	
	Emply Eupdate(Emply e);
	
	void Edelete(Integer s);
	 
	List<Emply> EgetAll();
	 
	Optional<Emply> Egetbyid(int i);
	
	Emply getbyid2(int i);

}
