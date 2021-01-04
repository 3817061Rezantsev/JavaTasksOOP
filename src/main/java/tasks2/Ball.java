package tasks2;

import tasks1.MyPoint;

public class Ball {
	private float x;
	private float y;
	private int radius;
	private float xDelta;
	private float yDelta;

	public Ball(float x, float y, int radius, int speed, int direction) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		xDelta = (float) (speed * Math.cos(direction * Math.PI / 180));
		yDelta = (float) (-speed * Math.sin(direction * Math.PI / 180));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) x + radius;
		result = prime * result + (int) y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Ball ball = (Ball) obj;
		if ((this.x == ball.getX()) && (this.y == ball.getY()) && (this.radius == ball.getRadius())
				&& (this.xDelta == ball.getXDelta()) && (this.yDelta == ball.getYDelta()))
			return true;
		else
			return false;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public float getXDelta() {
		return xDelta;
	}

	public void setXDelta(float xDelta) {
		this.xDelta = xDelta;
	}

	public float getYDelta() {
		return yDelta;
	}

	public void setYDelta(float yDelta) {
		this.yDelta = yDelta;
	}

	public void move() {
		x += xDelta;
		y += yDelta;
	}

	public void reflectHorizontal() {
		xDelta = -xDelta;
	}

	public void reflectVertical() {
		yDelta = -yDelta;
	}

	@Override
	public String toString() {
		return "Ball[(" + x + "," + y + "),speed(" + xDelta + "," + yDelta + ")]";
	}
}
