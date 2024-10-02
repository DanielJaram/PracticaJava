package oopslvl2;

public class Fan {
	
	//estate(estado y variables miembro)
	private String marca;
	private double radio;
	private String color;
	
	
	private boolean encendido;
	private byte velocidad; //1 a 5
	
	//creacion
	public Fan(String marca,double radio,String color) {
		this.marca = marca;
		this.radio = radio;
		this.color = color;
	}
	
	//isOn encendido
	public void encendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	public void switchEncendido() {
		this.encendido = true;
		setVelocidad((byte)5);
	}
	
	public void switchApagado() {
		this.encendido = false;
		setVelocidad((byte)0);
	}
	
	public void setVelocidad(byte velocidad) {
		this.velocidad = velocidad;
	}
	
	
	public String toString() {
		return String.format("marca - %s, radio - %f, color - %s, encendido - %b, velocidad - %d" ,
				 marca, radio, color, encendido, velocidad);
	}
}
