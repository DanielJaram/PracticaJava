package oops;

import java.math.BigDecimal;

public class SimpleInteresCalculatorRunner {
public static void main(String[] args) {
		
		SimpleInteresCalculator calculator = new SimpleInteresCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);// 5 years
		System.out.println(totalValue);
	}
	

}