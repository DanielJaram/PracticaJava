package oopslvl2Herencia;

public class StudentRunner {
	
	public static void main(String[] args) {
		/*
		Student student = new Student();
		student.setName("Ranga");
		student.setEmail("ranga@gmail.com");
		//IS A
		
		Person person = new Person();
		person.setName("Daniel");
		person.setEmail("djaramillo@gmail.com");
		person.setPhoneNumber("123-456-7890");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
		*/
		Employee employee = new Employee("Ranga", "Programmer analyst");
		//employee.setName("Daniel");
		employee.setEmail("djaramillo@gmail.com");
		employee.setPhoneNumber("123-456-7890");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programer analyst");
		
		System.out.print(employee);
	}
}
