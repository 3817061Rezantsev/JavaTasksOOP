package tasks2;

public class Container {
	private int x1 = 0;
	private int y1 = 0;
	private int x2 = 0;
	private int y2 = 0;

	public Container(int x, int y, int width, int height) {
		this.x1 = x;
		this.y1 = y;
		x2 = x1 + width;
		y2 = y1 + height;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x1 + y1;
		result = prime * result + y2 + x2;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Container ball = (Container) obj;
		if ((this.x1 == ball.getX()) && (this.y1 == ball.getY()) && (this.x2 == ball.getX2())
				&& (this.y2 == ball.getY2()))
			return true;
		else
			return false;
	}

	public int getX() {
		return x1;
	}

	public int getY() {
		return y1;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	public int getWidth() {
		return x2 - x1;
	}

	public int getHeight() {
		return y2 - y1;
	}

	public boolean collides(Ball ball) {
		float right = ball.getX() + ball.getRadius();
		float left = ball.getX() - ball.getRadius();
		float up = ball.getY() + ball.getRadius();
		float down = ball.getY() - ball.getRadius();
		if ((left > x1) && (right < this.getWidth())) {
			if ((up > y1) && (down < this.getHeight())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
	}
}
