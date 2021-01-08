package horstmannObject;

public class Car {
	private double distance;
	private double fuel;
	private double efficiency;

	public Car() {
		distance = 0;
		fuel = 50;
		efficiency = 3;
	}

	public void drive(double miles) {
		double temp = fuel - miles / efficiency;
		if (temp < 0) {
			System.out.print("Not enough fuel");
		} else {
			distance += miles;
			fuel = temp;
		}
	}

	public void addGallons(double gallons) {
		fuel += gallons;
	}

	public double getDistance() {
		return distance;
	}

	public double getFuelLevel() {
		return fuel;
	}
}

// Должен ли это быть неизменяемый класс? Нет, не должен.
// Почему или почему нет? Потому, что, по заданию, методы должны менять значения полей класса.