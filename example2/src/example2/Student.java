package example2;

final public class Student {

	final private int id;

	final private String name;

	final private double fee;
	
	final private Address add;

	public Student(int id, String name, double fee, Address add) {
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.add = add;
	}

	public Address getAdd() {
		return new Address(add);
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", add=" + add + "]";
	}

	

}
