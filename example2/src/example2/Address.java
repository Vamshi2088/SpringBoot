package example2;

public class Address {

	private  String location;
	 
	private  String street;

	public Address(String location, String street) {
		this.location = location;
		this.street = street;
	}
	public Address(Address a) {
		this(a.getLocation(),a.getStreet());
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [location=" + location + ", street=" + street + "]";
	}
	
	
	
	
	
}
