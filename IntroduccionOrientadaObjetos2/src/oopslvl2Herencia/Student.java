package oopslvl2Herencia;

public class Student extends Person {
	private String collegeName;
	private int year;
	//IS A
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	
}
