package com.examp;

public class Student {

	private final int id;
	private final String name;
	private final double fee;
	private final Address add;
	
	public Student(int id, String name, double fee, Address add) {
		this.id = id; 
		this.name = name;
		this.fee = fee;
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getFee() {
		return fee;
	}

	public Address getAdd() {
		return new Address(add);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", add=" + add + "]";
	}

}
