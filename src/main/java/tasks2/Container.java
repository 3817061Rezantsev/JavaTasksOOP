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

	public int getX() {
		return x1;
	}

	public int getY() {
		return y1;
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
