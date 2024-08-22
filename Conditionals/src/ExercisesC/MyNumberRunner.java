package ExercisesC;

public class MyNumberRunner {
	public static void main(String[] args) {

		Mynumber number = new Mynumber(6);
		boolean isPrime = number.isPrime();
		System.out.println("Is prime " + isPrime);

		int sum = number.sumUptoN();
		System.out.println("sumUptoN " + sum);

		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("sumOfDivisors " + sumOfDivisors);

		number.printNumberTriagle();

	}

}
