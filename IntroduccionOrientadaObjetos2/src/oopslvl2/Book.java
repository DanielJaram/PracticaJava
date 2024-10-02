package oopslvl2;

import java.util.ArrayList;

public class Book {
	
	private int id;
	private String nombre;
	private String autor;
	private ArrayList<Review> reviews = new ArrayList<>();
	
	public Book(int id, String nombre, String autor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
	}
	
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public String toString() {
		return String.format("id =%d name = %s author = %s Reviews = [%s]", id, nombre, autor, reviews);
	}
	
	
}
