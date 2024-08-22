package oops;

import java.math.BigDecimal;

public class SimpleInteresCalculator {
	BigDecimal principal;

	BigDecimal interest;

	public SimpleInteresCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
		// TODO Auto-generated constructor stub
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		// Total value = principal + principal * interest * noOfYears

		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		// BigDecimal totalValue =
		// principal.add(principal.multiply(interest).multiply(new
		// BigDecimal(noOfYears)));
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal));
		return totalValue;
	}

}
