package example2;

public class Test {
	
	public static void main(String[] args) {
		Address a=new Address("hyd", "balanagar");
		Student s=new Student(1,"admin",35000.00,a);
		System.out.println(a.hashCode());
		Address newadd = s.getAdd();
		newadd.setLocation("mncl");
		newadd.setStreet("ashok road");
		System.out.println(newadd.hashCode());
		
		System.out.println(s);
	}

}
