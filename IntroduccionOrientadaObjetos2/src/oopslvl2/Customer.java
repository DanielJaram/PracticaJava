package oopslvl2;

public class Customer {
	//state
	private String name;
	private Address homeAddres;
	private Address workAddres;
	
	//creating
	public Customer(String name,  Address homeAddres) {
		this.name = name;
		this.homeAddres = homeAddres;
	}
	
		
	//operations
	public Address getHomeAddres() {
		return homeAddres;
	}

	public void setHomeAddres(Address homeAddres) {
		this.homeAddres = homeAddres;
	}

	public Address getWorkAddres() {
		return workAddres;
	}

	public void setWorkAddres(Address workAddres) {
		this.workAddres = workAddres;
	}
	
	public String toString() {
		return String.format("name - [%s] home address - [%s] work address - [%s]", name, homeAddres, workAddres);
	}
	
	
	
}
