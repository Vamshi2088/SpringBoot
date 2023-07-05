package com.map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.map.daolayer.Dao;
import com.map.entity.Address;
import com.map.entity.Employe;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Dao bean = SpringApplication.run(Application.class, args).getBean(Dao.class);
	
	
		Address a=new Address(1,"mancherial");
	Employe e=new Employe(121, "vamshi", a);
	
	bean.save(e);
	
	}

}
