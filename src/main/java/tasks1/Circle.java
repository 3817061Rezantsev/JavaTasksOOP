package tasks1;

public class Circle {
	private double radius = 1.0;
	private String color = "red";

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) radius + color.length();
		result = prime * result;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Circle circle = (Circle) obj;
		if ((this.color.equals(circle.getColor())) && (this.radius == circle.getRadius()))
			return true;
		else
			return false;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void getColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle[radius=" + radius + ",color=" + color + "]";
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
