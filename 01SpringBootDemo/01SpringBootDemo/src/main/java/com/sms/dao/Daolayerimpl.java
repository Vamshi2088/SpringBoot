package com.sms.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.stereotype.Component;

import com.sms.model.Employe;

@Component
public class Daolayerimpl {
	
	public List<Employe> getAll(){
		
		List<Employe> list=Arrays.asList(new Employe[] {
				
				new Employe(1, "vamshi", 25000.00),
				new Employe(2, "cnu", 35000.00),
				new Employe(3, "umesh", 65000.00)
				
		});
		
		return list;
	}

	public static void main(String[] args) {
		
//		ArrayList l=new ArrayList<>();
//		
//		int a=10;
//		char c='A';
//		double d=2500.00;
//	
//		l.add(a);
//		l.add(c);
//		l.add(d);
//		System.out.println(l);
//		HashSet<Employe> e=new HashSet<>();
		TreeSet<Employe> e=new TreeSet<>();
		e.add(new Employe(2, "vamshi", 25000.00));
		e.add(new Employe(3, "vamshi", 25000.00));
		e.add(new Employe(1, "vamshi", 25000.00));
		
		System.out.println(e);
	}
}
