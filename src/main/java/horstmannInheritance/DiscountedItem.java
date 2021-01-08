package horstmannInheritance;

import java.util.Objects;

public class DiscountedItem extends Item {
	protected double discount;

	public DiscountedItem(String description, double price, double discount) {
		super(description, price);
		this.discount = discount;
	}

	public boolean equals(Object otherObject) {
		// A quick test to see if the objects are identical
		if (this == otherObject)
			return true;
		// Must return false if the parameter is null
		if (otherObject == null)
			return false;
		if (otherObject instanceof DiscountedItem) {
			if (!(discount == ((DiscountedItem) otherObject).discount)) {
				return false;
			}
		}
		return super.equals(otherObject);
	}

	public int hashCode() {
		return Objects.hash(description, price);
	}

	public static void main(String args[]) {
		DiscountedItem x = new DiscountedItem("A", 1, 1);
		Item y = new Item("A", 1);
		DiscountedItem z = new DiscountedItem("A", 1, 2);
		System.out.println(x.equals(y));
		System.out.println(y.equals(z));
		System.out.println(x.equals(z));
	}
}
