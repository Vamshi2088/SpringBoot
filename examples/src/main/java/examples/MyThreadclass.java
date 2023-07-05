package examples;

public class MyThreadclass {
	public static void main(String[] args) {
		Thread m=Thread.currentThread();
		System.out.println(m);
		Mythread my=new Mythread("first");
		Thread t=new Thread(my);
		t.start();
		t.setPriority(7);
		
		Mythread my1=new Mythread("second");
		Thread t1=new Thread(my1);
		t1.start();
	}

}
