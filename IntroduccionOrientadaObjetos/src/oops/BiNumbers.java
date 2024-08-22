package oops;

public class BiNumbers {
	private int x;
	private int y;

	public BiNumbers(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public BiNumbers() {
		super();
	}

	public int add() {
		return x + y;
	}

	public int multiply() {
		return x * y;
	}

	public void doubleValue() {
		this.x *= 2;
		this.y *= 2;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
