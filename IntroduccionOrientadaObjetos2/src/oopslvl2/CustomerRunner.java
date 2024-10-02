package oopslvl2;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line 1", "Hyderabad", "500035");
		Customer customer = new Customer("Ranga", homeAddress);
		System.out.println(customer);
		
		Address workAddress = new Address("line 1 for work", "Hyderabad", "500078");
		customer.setWorkAddres(workAddress);
		
		System.out.println(customer);
	}

}
