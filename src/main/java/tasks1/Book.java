package tasks1;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;

	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		String s = authors[0].toString();
		for (int i = 1; i < authors.length; i++) {
			s += "," + authors[i].toString();
		}
		String res = "Book[name=" + name + ",authors={" + s + "},price=" + price + ",qty=" + qty + "]";
		return res;
	}

	public String getAuthorNames() {
		String s = authors[0].getName();
		for (int i = 1; i < authors.length; i++) {
			s += "," + authors[i].getName();
		}
		return s;
	}
}
