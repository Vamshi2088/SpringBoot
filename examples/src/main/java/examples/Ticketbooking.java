package examples;

public class Ticketbooking {
	boolean booked=false;
	
	String name;

	public Ticketbooking(String name) {
		super();
		this.name = name;
	}
	public  synchronized void ticketbooking(String name) {
		if(booked==false) {
		System.out.println(name+"book the seat");
		System.out.println(name+"do the payment");
		System.out.println(name+"get the ticket");
		booked=true;
	}
		else {
			System.out.println("sorry the ticke already booked"+name);
		}
	}
}
