package examples;

public class Mythread extends Thread {
	String name;
	
	public Mythread(String name) {
		super();
		this.name = name;
	}


	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println(name+i);
			
		}
	}

}
