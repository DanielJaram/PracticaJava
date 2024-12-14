package oopslvl2Interface;

interface Flyable {
	void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("With wings");
	}

}

class AeroPlane implements Flyable {

	@Override
	public void fly() {
		System.out.println("With fuel");
	}

}

public class FyableRunner {
	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new AeroPlane() };
		for (Flyable object : flyingObjects) {
			object.fly();
		}
	}
}
