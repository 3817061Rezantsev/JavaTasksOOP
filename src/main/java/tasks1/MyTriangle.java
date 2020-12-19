package tasks1;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;

	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		v1.setXY(x1, y1);
		v2.setXY(x2, y2);
		v3.setXY(x3, y3);
	}

	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	@Override
	public String toString() {
		return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
	}

	public double getPerimeter() {
		return v1.distance(v2) + v2.distance(v3) + v1.distance(v3);

	}

	public String getType() {
		String res = "Scalene";
		if (Math.abs(v1.distance(v2) - v2.distance(v3)) < 1E-5) {
			res = "Isosceles";
		}
		if (Math.abs(v1.distance(v2) - v1.distance(v3)) < 1E-5) {
			res = "Isosceles";
		}
		if (Math.abs(v2.distance(v3) - v1.distance(v3)) < 1E-5) {
			res = "Isosceles";
		}
		if ((Math.abs(v1.distance(v2) - v1.distance(v3)) < 1E-5)
				&& (Math.abs(v2.distance(v3) - v1.distance(v3)) < 1E-5)) {
			res = "Equilateral";
		}
		return res;
	}
}
