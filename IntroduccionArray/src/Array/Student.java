package Array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	//private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		// TODO Auto-generated constructor stub
		this.name = name;

		// Esto nos ayudara a agregar las notas en el arrayList
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberofMarks() {
		// return marks.length;
		// Para array list ya no necesitamos de lenght,ahora usamos size()
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumOfMarks() {

		/*
		 * El siguiente metodo es para cuando trabajamos con arrays 
		 * // int max = 0; 
		 * int max = Integer.MIN_VALUE;
		 * // 95, 90, 100 
		 * // recorre toda la matriz 
		 * for (int  mark : marks) { 
		 * if (mark > max) { 
		 * max = mark;// se asigna una nota mayor cuando recorre toda la matriz 
		 * } 
		 * }
		 * 
		 */
		return Collections.max(marks);
	}

	public int getMinimumOfMarks() {
		/*
		 * El siguiente metodo es para cuando trabajamos con arrays 
		int min = Integer.MAX_VALUE;// 95, 90, 100
		// recorre toda la matriz
		for (int mark : marks) {
			if (mark < min) {
				min = mark;// se asigna una nota menor cuando recorre toda la matriz
			}

		}
		*/
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberofMarks();
		// Para que aparezca los decimales en nuestro resultado
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	//Metodo para obetener el nombre de un estudiante con arrayList
	public String toString() {
		return name + marks;
	}

	public void addNeWMark(int mark) {
		marks.add(mark)	;	
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
}
