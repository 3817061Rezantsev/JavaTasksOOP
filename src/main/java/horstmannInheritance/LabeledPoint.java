package horstmannInheritance;

public class LabeledPoint extends Point {
	private String label;

	public LabeledPoint(String label, double x, double y) {
		super(x, y);
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) x + label.length();
		result = prime * result + (int) y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		LabeledPoint point = (LabeledPoint) obj;
		if ((this.x == point.getX()) && (this.y == point.getY()) && this.label.equals(point.getLabel()))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Label:" + label + ",(" + x + "," + y + ")";
	}

	public void showAcsess(Point p) {
		System.out.print(p.x + p.y);
		// Классы из других пакетов не смогут получить доступ к полям напрямую.
	}

}
