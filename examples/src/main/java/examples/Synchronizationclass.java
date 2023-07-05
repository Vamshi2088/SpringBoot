package examples;

public class Synchronizationclass {

	public static void main(String[] args) {
		Ticketbooking ticket=new Ticketbooking("seatno7");
Mythreads vamshi=new Mythreads(ticket, "vamshi");
Thread t=new Thread(vamshi);
t.start();
Mythreads laxman=new Mythreads(ticket, "laxman");
Thread t2=new Thread(laxman);
t2.start();

	}

}
