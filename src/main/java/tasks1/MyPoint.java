package tasks1;

public class MyPoint {
	private double x = 0;
	private double y = 0;

	public MyPoint() {

	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
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
		MyPoint myPoint = (MyPoint) obj;
		if ((this.x == myPoint.getX()) && (this.y == myPoint.getY()))
			return true;
		else
			return false;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double[] getXY() {
		double[] xy = new double[2];
		xy[0] = x;
		xy[1] = y;
		return xy;
	}

	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public double distance(double x, double y) {
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
	}

	public double distance(MyPoint another) {
		return distance(another.getX(), another.getY());
	}

	public double distance() {
		return distance(0, 0);
	}

}
