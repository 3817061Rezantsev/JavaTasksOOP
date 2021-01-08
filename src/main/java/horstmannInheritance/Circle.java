package horstmannInheritance;

public class Circle extends Shape implements Cloneable {

	private double radius;

	public Circle(Point point, double radius) {
		this.point = point;
		this.radius = radius;
	}

	@Override
	public Point getCenter() {
		return point;
	}

	public Object clone() throws CloneNotSupportedException {
		return new Circle(new Point(point.x, point.y), radius);
	}

}
