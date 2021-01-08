package horstmannInheritance;

public abstract class Shape {
	protected Point point;

	public Shape() {
	}

	public void moveBy(double dx, double dy) {
		point.x += dx;
		point.y += dy;
	}

	public abstract Point getCenter();

}
