package oopslvl2Interface;

public class Project {
	
	interface Test{
		void nothing();
		default void nothing1() {
		
		}
	}
	
	class Class1 implements Test{

		@Override
		public void nothing() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class Class2 implements Test{

		@Override
		public void nothing() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		ComplexAlgorithm algorithm = new RealAlgoritm();
		System.out.println(algorithm.complexAlgorithm(20, 10));
		
	}
}
