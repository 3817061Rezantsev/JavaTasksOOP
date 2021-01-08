package horstmannInheritance;

public class Line extends Shape implements Cloneable {

	private Point from;
	private Point to;

	public Line(Point from, Point to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public Point getCenter() {
		return new Point(from.x + ((to.x - from.x) / 2), (from.y + (to.y - from.y) / 2));
	}

	public Object clone() throws CloneNotSupportedException {
		return new Line(new Point(from.x, from.y), new Point(to.x, to.y));
	}

	public static void main(String args[]) {
		Line line = new Line(new Point(0, 0), new Point(1, 1));
		System.out.print(line.getCenter());
		line = new Line(new Point(0, 0), new Point(-1, -1));
		System.out.print(line.getCenter());
		line = new Line(new Point(0, 0), new Point(1, -1));
		System.out.print(line.getCenter());
		line = new Line(new Point(0, 0), new Point(-1, 1));
		System.out.print(line.getCenter());
		line = new Line(new Point(3, 3), new Point(1, 1));
		System.out.print(line.getCenter());
		line = new Line(new Point(3, 3), new Point(5, 5));
		System.out.print(line.getCenter());
	}
}
