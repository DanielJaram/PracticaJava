package oops;

public class Book {
	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void incrementarLibros(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void disminuirLibros(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}

}
