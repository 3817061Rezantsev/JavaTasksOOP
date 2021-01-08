package horstmannStructures;

import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int max1 = a;
		if (b > max1) {
			max1 = b;
		}
		if (c > max1) {
			max1 = c;
		}
		System.out.println(max1);
		int max2 = Math.max(a, b);
		max2 = Math.max(max2, c);
		System.out.println(max2);
	}
}
