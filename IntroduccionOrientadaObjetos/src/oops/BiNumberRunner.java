package oops;

public class BiNumberRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiNumbers numbers = new BiNumbers(2 , 3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.doubleValue();
		System.out.println(numbers.getX());
		System.out.println(numbers.getY());
	}

}
