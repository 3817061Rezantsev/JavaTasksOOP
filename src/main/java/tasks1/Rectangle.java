package tasks1;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;

	public Rectangle() {

	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) length;
		result = prime * result + (int) width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Rectangle rect = (Rectangle) obj;
		if ((this.length == rect.getLength()) && (this.width == rect.getWidth()))
			return true;
		else
			return false;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {
		return width * 2 + 2 * length;
	}

	@Override
	public String toString() {
		return "Rectangle[length=" + length + ",width=" + width + "]";
	}
}
