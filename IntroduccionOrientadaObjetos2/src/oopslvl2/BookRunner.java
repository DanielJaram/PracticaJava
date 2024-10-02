package oopslvl2;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "Programacion orientada a objeto", "Ranga");
		book.addReview(new Review(10, "Buen libro", 5));
		book.addReview(new Review(101, "Asombroso", 5));
		
		System.out.println(book);
	}

}
