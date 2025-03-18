package functional;

import java.util.List;
import java.util.function.Predicate;

public class LambdaRunner {

	public static void main(String[] args) {
		
		
		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		Predicate<? super Integer> oddPredicate = n -> n%2==1;

		
		List.of(23,43,35,45,36,48).stream()
				.filter(evenPredicate)
				.forEach(e -> System.out.println(e));

	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return n -> n%2==0;
	}

}
