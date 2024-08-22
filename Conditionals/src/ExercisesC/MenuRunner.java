package ExercisesC;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int number1 = scanner.nextInt();
		System.out.println("The number your entered is - " + number1);
		System.out.print("Enter Number2: ");
		int number2 = scanner.nextInt();
		System.out.println("The number your entered is - " + number2);
		System.out.println(
				"Choose an Operation" + "\n 1 - Add" + "\n 2 - Substract" + "\n 3 - Divide" + "\n 4 - Multiply");
		int operation = scanner.nextInt();
		int result = 0;
		// result = performOperationUsingNestedIfElse(number1, number2, operation,
		// result);
		// System.out.println("El resultado es " + result);
		performOperationUsingNestedSwitch(number1, number2, operation);
	}

	private static int performOperationUsingNestedIfElse(int number1, int number2, int operation, int result) {
		if (operation == 1) {
			result = number1 + number2;
		} else if (operation == 2) {
			result = number1 - number2;
		} else if (operation == 3) {
			result = number1 / number2;
		} else if (operation == 4) {
			result = number1 * number2;
		} else {
			System.out.println("Invalid Operation");
		}
		return result;
	}

	private static void performOperationUsingNestedSwitch(int number1, int number2, int operation) {
		switch (operation) {
		case 1:
			System.out.println("Result " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result " + (number1 / number2));
			break;
		case 4:
			System.out.println("Result " + (number1 * number2));
			break;
		default:
			System.out.println("Invalid Operation");
			break;
		}

	}

}
