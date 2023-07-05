package com.rest.daolayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Repository;

import com.rest.pojo.Employe;

@Repository
public class Daoimpl implements Dao{

	
	private static List<Employe> l=new ArrayList<>();
	
	static {
	l.add(new Employe(1, "ram", 35000.00));	
	l.add(new Employe(2, "laxman", 55000.00));
	l.add(new Employe(3, "seeta", 65000.00));
	l.add(new Employe(4, "hanuma", 75000.00));
	}
	
	@Override
	public List<Employe> getAll() {

		return l;
	}

	@Override
	public Employe add(Employe e) {

		l.add(e);
		
		return e;
	}

	@Override
	public Employe findbyid(Integer id) {

		return l.stream().filter(emp -> emp.getId().equals(id)).findFirst().get();
	}

	@Override
	public void delete(Integer i) {
//		Employe e = findbyid(i);
//		l.remove(e);
		
//		concurrent modification exception
//		fail fast
//		for (Employe employe : l) {
//			if(employe.getId().equals(i)) {
//				l.remove(employe);
//			}
//		}
	
//		failsafe
//		Employe e=null;
//		for (Employe employe : l) {
//			if(employe.getId().equals(i)) {
//				e=employe;
//				break;
//			}
//		}
//		l.remove(e);
		
//		CopyOnWriteArrayList<Employe> c=new CopyOnWriteArrayList<>(l);
//		for (Employe employe : c) {
//			if(employe.getId().equals(i)) {
//				l.remove(employe);
//			}
//		}
//		l=new ArrayList<>(c);
		
//		iterator
		Iterator<Employe> it=l.iterator();
		while(it.hasNext()) {
			if(it.next().getId().equals(i)) {
				it.remove();
				break;
			}
		}
		System.out.println("removed successfully");
		
	}

}
