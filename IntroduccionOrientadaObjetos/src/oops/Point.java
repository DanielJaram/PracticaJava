package oops;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public double distanceTo(Point other) {
		
		int dx = this.x - other.x;
		int dy = this.y - other.y;
		
		return Math.sqrt(dx * dx + dy * dy);
	}
}
