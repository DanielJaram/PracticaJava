package functional;

import java.util.List;
import java.util.stream.Collectors;

public class FPNumberRunner {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(4,6,8,13,3,15);
		numbers.stream()
			   .forEach(element -> System.out.println(element));
		
		
		int sum = numbers.stream()
						 .reduce(0, (number1, number2) -> number1 + number2);
		
		int sumImp = fpSum(numbers);
		
		System.out.println(sumImp);
		
	}
	
	
	/*
	private static int fpSumImp(List<Integer> numbers) {
		int sumImp = numbers.stream()
							.filter(number -> number%2 == 1)
							.reduce(0, (number1, number2) -> number1 + number2);
		return sumImp;
	}
	*/
	/*
	 * Aqui se uso las llaves para realizar varias lineas en el body 
	private static int fpSum(List<Integer> numbers) {
		return numbers.stream()
							.reduce(0, (number1, number2) -> {
							System.out.println(number1 + " " + number2);
								return number1 + number2;
										});
	}
	*/
	//Decir que
	private static int fpSum(List<Integer> numbers) {
		return numbers.stream()
							.reduce(0, (number1, number2) ->  number1 + number2);
	}
	//Como hacerlo
	private static void nomalSum(List<Integer> numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum += number;//mutations
		}
	}
		
}
