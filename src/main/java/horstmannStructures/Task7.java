package horstmannStructures;

import java.util.Scanner;

public class Task7 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int i = Integer.parseUnsignedInt(s);
		s = in.nextLine();
		int j = Integer.parseUnsignedInt(s);
		int sum = Math.abs(i) + Math.abs(j);
		int dif = Math.abs(i) - Math.abs(j);
		int pro = Math.abs(i) * Math.abs(j);
		int quo = Math.abs(i) / Math.abs(j);
		int rem = Math.abs(i) % Math.abs(j);
		System.out.println("Sum:" + sum);
		System.out.println("Difference:" + Integer.toHexString(dif));
		System.out.println("Product:" + Integer.toOctalString(pro));
		System.out.println("Quotient:" + Double.toHexString(quo));
		System.out.println("Remainder:" + Double.toHexString(rem));
	}
}
