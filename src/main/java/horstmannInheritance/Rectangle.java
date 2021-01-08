package horstmannInheritance;

public class Rectangle extends Shape implements Cloneable {

	private double width;
	private double height;

	Rectangle(Point topLeft, double width, double height) {
		this.height = height;
		this.width = width;
		this.point = topLeft;
	}

	@Override
	public Point getCenter() {
		return new Point(point.x + width / 2, point.y - height / 2);
	}

	public Object clone() throws CloneNotSupportedException {
		return new Rectangle(new Point(point.x, point.y), width, height);
	}

	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(new Point(0, 0), 4, 2);
		System.out.print(rectangle.getCenter());
	}

}
