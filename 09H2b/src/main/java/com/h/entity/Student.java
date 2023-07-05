package com.h.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_h2")
public class Student{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer i;
	
	private String name;
	
	private double salary;

	public Student() {
	}

	public Student(Integer i, String name, double salary) {
		super();
		this.i = i;
		this.name = name;
		this.salary = salary;
	}

	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [i=" + i + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
