package com.moduleone.service;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moduleone.daolayer.PersonDao;
import com.moduleone.entity.Emply;

@Service
public class Serviceimpl implements PersonService {

	@Autowired
	private PersonDao pd;

	@Override
	public Emply Esave(Emply e) {

		return pd.save(e);
	}

	@Override
	public Emply Eupdate(Emply e) {

		return pd.save(e);
	}

	@Override
	public void Edelete(Integer s) {

		Emply p = new Emply();
		p.setId(s);
		pd.delete(p);

	}

	@Override
	public List<Emply> EgetAll() {
		return pd.findAll();
	}

	@Override
	public Optional<Emply> Egetbyid(int i) {
		return pd.findById(i);
	}

	@Override
	public Emply getbyid2(int i) {
		return pd.getById(i);
	}

}
