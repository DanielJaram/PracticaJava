package functional;

import java.util.List;

public class MethodReferencesRunner {
	
	public static void print(Integer number) {
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		List.of("Ant","Bat","Cat","Dog","Elephant").stream()
			   .map(s -> s.length())
			   .forEach(s -> MethodReferencesRunner.print(s));
		
		/*
		List.of("Ant","Bat","Cat","Dog","Elephant").stream()
		   .map(String::length)
		   .forEach(MethodReferencesRunner::print);
		*/
		
		Integer max = List.of(23, 45, 67, 34).stream()
					  .filter(MethodReferencesRunner::isEven)
					  .max(Integer::compare)
					  .orElse(0);
		
	}
	
	
	
	public static boolean isEven(Integer number) {
		return number%2==0;
	}
}
