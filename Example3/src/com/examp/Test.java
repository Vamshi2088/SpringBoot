package com.examp;

public class Test {
	public static void main(String[] args) {
		Address ramAdd=new Address("hyd", "velgan rao nagar","504208");
		Student s=new Student(2,"ram",2500.00,ramAdd);
		
		Address newAdd = s.getAdd();
		newAdd.setLocation("kmnr");
		newAdd.setStreet("bustand-area");
		System.out.println(s);
	}
}
