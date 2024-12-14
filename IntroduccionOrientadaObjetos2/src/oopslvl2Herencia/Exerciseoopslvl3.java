package oopslvl2Herencia;

public class Exerciseoopslvl3 {
	// Abstract class Shape as we do not want any instances of Shape itself, but only of its subclasses
	abstract class Shape {
	    protected String name;// Name of the shape
	    // Constructor to initialize name of the shape
	    public Shape(String name) {
	        this.name = name;
	    }
	    // Abstract method to calculate area of the shape
	    // To be implemented by subclasses
	    public abstract double calculateArea();
	    // Method to display information about the shape
	    public void displayInfo() {
	        System.out.println("Shape: " + name);
	        System.out.println("Area: " + calculateArea());
	    }
	}
	// Circle class extends Shape
	class Circle extends Shape{
		// Radius of the circle
		private double radius;
		// Constructor to initialize name and radius of the circle
		public Circle(String name, double radius) {
			super(name);// Call parent class constructor to set name
			this.radius = radius;
			// TODO Auto-generated constructor stub
		}
		// Implementation of the abstract method to calculate area
		@Override
		public double calculateArea() {
			// TODO Auto-generated method stub
			// Formula to calculate area of the circle
			return Math.PI * (radius * radius);
		}
		
	}
	// Rectangle class extends Shape
	class Rectangle extends Shape{
		
		private double length;// Length of the rectangle
		private double width; // Width of the rectangle
		
		// Constructor to initialize name, length, and width of the rectangle
		public Rectangle(String name, double length, double width) {
			super(name);// Call parent class constructor to set name
			this.length = length;
			this.width = width;
			// TODO Auto-generated constructor stub
		}
		// Implementation of the abstract method to calculate area
		@Override
		public double calculateArea() {
			// TODO Auto-generated method stub
			return length * width;
			// Formula to calculate area of the rectangle
		}
		
	}
}
