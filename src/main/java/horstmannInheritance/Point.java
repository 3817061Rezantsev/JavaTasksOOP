package horstmannInheritance;

public class Point {
	protected double x;
	protected double y;

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) x;
		result = prime * result + (int) y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Point point = (Point) obj;
		if ((this.x == point.getX()) && (this.y == point.getY()))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

}
