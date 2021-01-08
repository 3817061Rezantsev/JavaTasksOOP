package hortsmannInterfaces;

public class Greeter implements Runnable {
	private int n;
	private String target;

	Greeter(int n, String target) {
		this.n = n;
		this.target = target;
	}

	public void run() {
		for (int i = 0; i < n; i++) {
			System.out.println("Hello, " + target);
		}
	}

	public static void main(String[] args) {
		Greeter rg1 = new Greeter(15, "Tom");
		Greeter rg2 = new Greeter(15, "Harry");
		Thread t1 = new Thread(rg1);
		Thread t2 = new Thread(rg2);
		t1.start();
		t2.start();
	}
}
