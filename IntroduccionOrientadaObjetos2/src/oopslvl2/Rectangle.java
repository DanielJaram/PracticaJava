package oopslvl2;

public class Rectangle {

	// state
	private int largo;
	private int ancho;

	public Rectangle(int largo, int ancho) {
		this.largo = largo;
		this.ancho = ancho;
	}
	
	//operations
	
	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	public int area() {
		return largo * ancho;
	}
	
	public int perimetro() {
		return 2 * (largo + ancho);
	}
	
	public String toString() {
		return String.format("largo - %d ancho - %d area - %d perimetro - %d ", largo, ancho, area(), perimetro());
	}
}
