package oopslvl2;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan("Toshiba", 0.24232, "Amarillo");
		fan.switchEncendido();
		System.out.println(fan);
		fan.setVelocidad((byte)3);
		System.out.println(fan);
		fan.switchApagado();
		System.out.println(fan);
	}

}
