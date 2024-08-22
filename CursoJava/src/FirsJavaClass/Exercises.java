package FirsJavaClass;

public class Exercises {
	
	
	public int hello() {
		// TODO: Make this return 1
		return 1;
	}

	/*
	 * In Java, you have been given a partially implemented TimeConverter class that
	 * aims to convert time from hours or days to minutes. The TimeConverter class
	 * has two static methods that need to be completed: convertHoursToMinutes(int
	 * hours): This method should take an integer value representing hours and
	 * return the equivalent value in minutes. convertDaysToMinutes(int days): This
	 * method should take an integer value representing days and return the
	 * equivalent value in minutes.
	 * 
	 */
	public static int convertHoursToMinutes(int hours) {
		// Your task: complete this method
		if (hours >= 0) {
			int convert = hours * 60;
			return convert;
		}
		return -1;
	}

	public static int convertDaysToMinutes(int days) {
		// Your task: complete this method
		if (days >= 0) {
			int convert = days * (24 * 60);
			return convert;
		}
		return -1;
	}

	/*
	 * Coding Exercise: Exam Result Checker You have been provided with an
	 * incomplete Java class named ExamResult. This class has a method isPass(int
	 * marks) which needs to be completed.
	 * 
	 * The isPass(int marks) method should take an integer value representing the
	 * marks obtained by a student in an exam and determine whether the student has
	 * passed or failed the exam.
	 * 
	 * In this case, a student is considered to have passed the exam if they have
	 * scored more than 50 marks. If the student's marks are 50 or less, they are
	 * considered to have failed.
	 */

	public boolean isPass(int marks) {
		// Update Code : If the student's marks are greater than 50, they have passed
		// the exam.
		if (marks > 50) {
			return true;
		}
		return false;
	}

	/*
	 * Coding Exercise: Is Valid Triangle You are given three integer inputs that
	 * represent the angles of a triangle. You need to complete a method named
	 * isValidTriangle(int angle1, int angle2, int angle3), inside a class named
	 * TriangleValidator. This method should return a boolean value – true if the
	 * given angles form a valid triangle, and false if they do not.
	 * 
	 * The conditions for a valid triangle are:
	 * 
	 * Each of the angles must be a positive integer.
	 * 
	 * The sum of all the three angles must be exactly 180.
	 */

	public class TriangleValidator {
		public boolean isValidTriangle(int angle1, int angle2, int angle3) {
			// write your code here
			int sum = angle1 + angle2 + angle3;
			if (angle1 > 0 && angle2 > 0 && angle3 > 0 && sum == 180) {
				return true;
			}
			return false;
		}
	}

	/*
	 * Coding Exercise: Is Right Angled Triangle You have been given a class
	 * TriangleValidator with an incomplete method isRightAngled(int side1, int
	 * side2, int side3). This method should take three integer values that
	 * represent the lengths of the sides of a triangle. Your task is to complete
	 * the method so it can accurately determine if the triangle with the given
	 * sides is a right-angled triangle. The method should return true if the
	 * triangle is right-angled and false otherwise.
	 * 
	 * In a right-angled triangle, the square of the length of the hypotenuse (the
	 * side opposite the right angle) is equal to the sum of the squares of the
	 * lengths of the other two sides. This is known as the Pythagorean theorem.
	 * 
	 * If any side has a non-positive length, it's not considered a valid triangle.
	 */

	public boolean isRightAngled(int side1, int side2, int side3) {
		// write your code
		if (side1 > 0 && side2 > 0 && side3 > 0) {
			if (side1 * side1 == side3 * side3 + side2 * side2) {
				return true;
			}
			if (side2 * side2 == side1 * side1 + side3 * side3) {
				return true;
			}
			if (side3 * side3 == side2 * side2 + side1 * side1) {
				return true;
			}

		}
		return false;
	}

	/*
	 * Coding Exercise: Sum of Squares of First N Numbers You are given an integer
	 * n. Your task is to implement a method calculateSumOfSquares in the class
	 * SumOfSquares that calculates and returns the sum of squares of all positive
	 * integers up to n (inclusive).
	 * 
	 * For example, if n = 3, the method should return the sum 1^2 + 2^2 + 3^2 = 14.
	 * 
	 * If n is less than 0, the method should return -1.
	 */
	public long calculateSumOfSquares2(int n) {
		// write your code here
		// si n es menor que 0 devuelve -1 para indicar una entrada no valida
		if (n < 0) {
			return -1;
		}
		// inicializa la suma a 0 para que la variable acumule
		long mul = 0;
		// iterar sobre todos los numeros del 1 al n
		for (int i = 1; i <= n; i++) {
			mul += i * i;
		}
		// devuelve la suma de cuadrado calculada
		return mul;
	}

	/*
	 * Coding Exercise: Is Leap Year You are given a class LeapYearChecker with a
	 * method isLeapYear(int year). Your task is to complete the implementation of
	 * the method to determine if a given year is a leap year.
	 * 
	 * The rules are a little tricky. Read them carefully.
	 * 
	 * A year is a leap year in the Gregorian calendar if:
	 * 
	 * It is divisible by 4 (AND)
	 * 
	 * It is NOT divisible by 100 (except when it is divisible by 400)
	 * 
	 * Not Divisible by 4 - NOT Leap Year (2041)
	 * 
	 * Divisible by 4 and NOT divisible by 100 - Leap Year (2048)
	 * 
	 * Divisible by 4 and divisible by 100 - Additional check needed
	 * 
	 * Divisible by 4, divisible by 100, divisible by 400 - Leap Year (2000, 2400)
	 * 
	 * Divisible by 4, divisible by 100, NOT divisible by 400 - NOT Leap Year (2100,
	 * 2200, 2300)
	 */
	public boolean isLeapYear(int year) {
		if (year >= 1) {
			if (year % 4 != 0) {
				return false;
			}

			if (year % 100 != 0) {
				return true;
			}
			if (year % 400 != 0) {
				return false;
			}
			return true;
		}
		return false;
	}
	/*
	 * Coding Exercise: Is Perfect Number In this exercise, your task is to
	 * implement a method in the PerfectNumberChecker class that checks whether a
	 * number is a "perfect number".
	 * 
	 * A Perfect Number is a positive integer that is equal to the sum of all of its
	 * positive divisors, excluding itself.
	 * 
	 * For example, the number 6 is a perfect number because its divisors are 1, 2,
	 * and 3. The sum of these divisors is equal to 6, so 6 is a perfect number.
	 * Similarly, 28 is also a perfect number because its divisors (1, 2, 4, 7, 14)
	 * sum up to 28.
	 */
	
	public class PerfectNumberChecker {
	    public boolean isPerfectNumber(int number) {
	        if(number<=0){
	        return false;
	    }
	    int divisorSum = 0;
	    for(int i = 1; i < number; i++){
	        if(number % i == 0){
	        divisorSum += i;
	            }
	    }
	    return divisorSum == number;
	    }
	    
	}

}
