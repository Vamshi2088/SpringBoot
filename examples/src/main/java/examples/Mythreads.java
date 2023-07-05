package examples;

public class Mythreads  extends Thread{
	Ticketbooking tkt;
	String name;
	
	public Mythreads(Ticketbooking tkt, String name) {
		super();
		this.tkt = tkt;
		this.name = name;
	}

	public void run() {
		tkt.ticketbooking(name);
	}

}
