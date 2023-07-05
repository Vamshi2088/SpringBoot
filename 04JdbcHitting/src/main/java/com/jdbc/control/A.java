package com.jdbc.control;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.jdbc.model.Employe;

public class A {
	
public static void main(String[] args) {
	
	
	
	
	
	HashSet<Integer> h=new HashSet<>();
	h.add(new Employe(1,"ram",25000.00).getId());
	h.add(new Employe(1,"seeta",25000.00).getId());
	h.add(new Employe(2,"seeta",5000.00).getId());
	System.out.println(h);
	
	
//	List<Employe> l=new ArrayList<>();
//	l.addAll(h);
//	
//	System.out.println(l);
	
	
	
}	

}
