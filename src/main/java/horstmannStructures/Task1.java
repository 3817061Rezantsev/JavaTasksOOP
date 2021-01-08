package horstmannStructures;

import java.util.Scanner;

public class Task1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		System.out.println("Binary:" + Integer.toBinaryString(i));
		System.out.println("Hex:" + Integer.toHexString(i));
		System.out.println("Octal:" + Integer.toOctalString(i));
		double d = 1.0 / i;
		System.out.println("Reciprocal:" + Double.toHexString(d));
	}
}
