package Array;

import java.math.BigDecimal;

public class StudenRunner {

	public static void main(String[] args) {
		Student student = new Student("Ranga", 99, 98, 100 );
		
		Student student1 = new Student("Adam",  99, 98, 100 );
		
		Student student2 = new Student("Eve",  99, 98, 100 );
		
		int number = student.getNumberofMarks();
		System.out.println("Numero de notas: " + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("La suma de las notas: " + sum);
		
		int maximumMark= student.getMaximumOfMarks();
		System.out.println("La nota maxima: " + maximumMark);
		
		int minimumMark= student.getMinimumOfMarks();
		System.out.println("La nota minima: " + minimumMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("La nota promediada es: " + average);
		
		System.out.println(student);
		
		student.addNeWMark(35);
		
		System.out.println(student);
		
		student.removeMarkAtIndex(1);
		
		System.out.println(student);
	}
}
