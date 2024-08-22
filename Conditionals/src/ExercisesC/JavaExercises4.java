package ExercisesC;

public class JavaExercises4 {

	public int calculateFactorial(int number) {
		// Write your code here
		if (number < 0) {
			return -1;
		}

		int factorial = 1;
		for (int i = 2; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public int getLastDigit(int number) {
		// Write your code here
		if (number == 0) {

		}
		if (number < 0) {
			return -1;
		}
		if (number > 0) {
			number = number % 10;
			return number;
		}
		return number;
	}

	public int getNumberOfDigits(int number) {
		// Write your code here
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 1;
		}
		int numberOfDigits = 1;
		while (number >= 10) {
			number /= 10; // remove the last digit from the number
			numberOfDigits++; // increment the count of digits
		}
		return numberOfDigits;
	}

	public int getSumOfDigits(int number) {
		// Edge case: when number is zero
		if (number == 0) {
			return 0; // sum of digits of 0 is 0
		}
		// Edge case: when number is negative
		if (number < 0) {
			return -1; // sum of digits of negative numbers is undefined
		}

		// Initialize the sum of digits to 0
		int sumOfDigits = 0;

		// Loop while the number is not zero
		while (number != 0) {
			// Get the last digit of the number
			int digit = number % 10;
			// Add the last digit to the sum
			sumOfDigits += digit;
			// Remove the last digit from the number
			number /= 10;
		}

		// Return the sum of digits
		return sumOfDigits;
	}

	public int reverseNumber(int number) {
		// Edge case: when number is zero
		if (number == 0) {
			return 0; // reverse of 0 is 0
		}
		// Edge case: when number is negative
		if (number < 0) {
			return -1; // reverse of negative numbers is undefined
		}

		// Initialize the reversed number to 0
		int reversedNumber = 0;

		// Loop while the number is not zero
		while (number != 0) {
			// Get the last digit of the number
			int digit = number % 10;

			// Multiply the reversed number by 10 and add the last digit
			reversedNumber = reversedNumber * 10 + digit;

			// Remove the last digit from the number
			number /= 10;
		}

		// Return the reversed number
		return reversedNumber;
	}

	public class BiNumber {
		private int number1;
		private int number2;

		public BiNumber(int number1, int number2) {
			this.number1 = number1;
			this.number2 = number2;
		}

		public int getNumber1() {
			return number1;
		}

		public int getNumber2() {
			return number2;
		}

		public int calculateLCM() {
			// Handle edge cases
			if (number1 == 0 || number2 == 0) {
				return 0; // LCM of 0 and any other number is 0
			}
			if (number1 < 0 || number2 < 0) {
				return -1; // LCM for negative numbers is undefined
			}

			// Find the maximum of the two numbers
			int max = Math.max(number1, number2);
			// Initialize lcm to the maximum number
			int lcm = max;

			// Loop until lcm is found
			while (true) {
				if (lcm % number1 == 0 && lcm % number2 == 0) {
					// lcm is found, break the loop
					break;
				}
				// Increment lcm by max
				lcm += max;
			}

			// Return the calculated lcm
			return lcm;
		}
	}

	public class BiNumber2 {
		private int number1;
		private int number2;

		/**
		 * Constructor that initializes the two numbers.
		 * 
		 * @param number1: The first number.
		 * @param number2: The second number.
		 */
		public BiNumber2(int number1, int number2) {
			this.number1 = number1;
			this.number2 = number2;
		}

		/**
		 * Getter for the first number.
		 * 
		 * @return the first number.
		 */
		public int getNumber1() {
			return number1;
		}

		/**
		 * Getter for the second number.
		 * 
		 * @return the second number.
		 */
		public int getNumber2() {
			return number2;
		}

		/**
		 * Calculates and returns the greatest common divisor (GCD) of the two numbers.
		 * Edge case: If either number is negative, returns 1 as the GCD for negative
		 * numbers is 1. Edge case: If either number is zero, returns 0 as the GCD of 0
		 * and any other number is 0. Edge case: If two numbers are equal, returns the
		 * number as the GCD of two equal numbers is the number itself.
		 * 
		 * @return GCD of the two numbers, or 1 if either number is negative, or 0 if
		 *         either number is zero.
		 */
		public int calculateGCD() {
			// Edge case: when either number is zero
			if (number1 == 0 || number2 == 0) {
				return 0; // GCD of 0 and any other number is 0
			}
			// Edge case: when either number is negative
			if (number1 < 0 || number2 < 0) {
				return 1; // GCD of negative numbers is 1
			}
			// Edge case: when both numbers are equal
			if (number1 == number2) {
				return number1; // GCD of two equal numbers is the number itself
			}

			int smallerNumber = Math.min(number1, number2); // The smaller of the two numbers

			// Loop from the smaller number down to 1
			for (int i = smallerNumber; i >= 1; i--) {
				// If i divides both numbers evenly, then it's the GCD
				if (number1 % i == 0 && number2 % i == 0) {
					return i;
				}
			}

			return 1; // If no other GCD has been found, it's 1
		}
	}

	public class StringMagic {

		/**
		 * This method counts the number of uppercase letters in a given string.
		 *
		 * @param str The string to count uppercase letters in.
		 * @return The number of uppercase letters in the string.
		 */
		public int countUppercaseLetters(String str) {
			if (str == null)
				return -1;
			// Inicializamos el contador
			int count = 0;

			// Recorremos la cadena, carácter por carácter
			for (int i = 0; i < str.length(); i++) {
				// Obtenemos el carácter en la posición i
				char ch = str.charAt(i);

				// Si el carácter es mayúscula, incrementamos el contador
				if (Character.isUpperCase(ch)) {
					count++;
				}
			}

			// Devolvemos el número de letras mayúsculas
			return count;
		}
	}

	public class StringMagic2 {

		/**
		 * This method checks if a given string has two consecutive identical
		 * characters.
		 *
		 * @param str The string to check for consecutive duplicates.
		 * @return true if the string has consecutive duplicates, false otherwise.
		 */
		public boolean hasConsecutiveDuplicates(String str) {
			// Recorremos la cadena desde el segundo carácter hasta el final
			for (int i = 1; i < str.length(); i++) {
				// Comparamos el carácter actual con el carácter anterior
				if (str.charAt(i) == str.charAt(i - 1)) {
					return true; // Si encontramos caracteres consecutivos idénticos, devolvemos true
				}
			}
			return false; // Si no encontramos caracteres consecutivos idénticos, devolvemos false
		}
	}

	public class StringMagic3 {

		/**
		 * This method finds the rightmost digit in a given string.
		 *
		 * @param str The string to find the rightmost digit in.
		 * @return The rightmost digit in the string. If no digit is found, return -1.
		 */
		public int getRightmostDigit(String str) {
			// Iteramos desde el último carácter hasta el primero
			for (int i = str.length() - 1; i >= 0; i--) {
				char ch = str.charAt(i);
				// Verificamos si el carácter es un dígito
				if (Character.isDigit(ch)) {
					return Character.getNumericValue(ch); // Devolvemos el valor numérico del dígito
				}
			}
			// Si no se encuentra ningún dígito, devolvemos -1
			return -1;

		}
	}

}
