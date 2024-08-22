package oops;

public class BookRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComputerProgramming = new Book(23);
		Book effectiveJava = new Book(22);
		Book cleanCode = new Book(21);
		
		artOfComputerProgramming.setNoOfCopies(10);;
		effectiveJava.setNoOfCopies(5);;
		cleanCode.setNoOfCopies(3);
		
		artOfComputerProgramming.disminuirLibros(3);
		effectiveJava.disminuirLibros(2);
		cleanCode.disminuirLibros(1);
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}

}

