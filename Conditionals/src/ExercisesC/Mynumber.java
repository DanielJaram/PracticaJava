package ExercisesC;

public class Mynumber {
	private int number;

	public Mynumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		if(number <=2) {
			return false;
		}
		
		for (int i = 2; i <= number - 1; i++) {
			if (i % 2 == 0) {
				return false;
			}
		}
		return false;
	}

	public int sumUptoN() {
		int sum = 0;
		for(int i = 0; i <= number; i++) {
		//sum = sum + i;
		sum += i;	
		}
		return sum;
	}

	public int sumOfDivisors() {
		// TODO Auto-generated method stub
		int sumOfD = 0;
		for(int i = 2; i <=number - 1; i++) {
			
			if(number % i ==0) {
				sumOfD += i;
			}
		}
		return sumOfD;
	}

	public void printNumberTriagle() {
		for(int i = 1; i <= number; i++) {
			for(int j = 1; j <= i; j++) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}

