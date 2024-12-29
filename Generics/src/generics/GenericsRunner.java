package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class GenericsRunner {
	
	static <X> X dobleValue(X value) {
		return value;
	}
	
	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}
	
	static double sumOfNumberList(List<? extends Number>numbers) {
		double sum = 0.0;
		for(Number number:numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}
	
	static void addCopleOfValue(List<? super Number>numbers) {
		numbers.add(1);
		numbers.add(1,0);
		numbers.add(1.0F);
		numbers.add(1l);
	}
	
	public static void main(String[] args) {
		List emptyList = new ArrayList<Number>();
		addCopleOfValue(emptyList);
		System.out.println(emptyList);
		
		System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
		System.out.println(sumOfNumberList(List.of(1.1,2.1,3.1,4.1,5.1)));
		System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l)));
		
		String value1 = dobleValue(new String());
		Integer number1 = dobleValue(Integer.valueOf(5));
		ArrayList list1 = dobleValue(new ArrayList());
		
		LinkedList<Integer> numberss = new LinkedList<>(List.of(1,2,3));
		duplicate(numberss);
		System.out.println(numberss);
		
		MyCustomList<Long> list = new MyCustomList<>();
		list.addElement(5L);
		list.addElement(7L);
		Long value = list.get(0);
		
		System.out.println(list);
		System.out.println(value);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		Integer number = list2.get(0);
		
		System.out.println(list2);
		System.out.println(number);
	}

}
