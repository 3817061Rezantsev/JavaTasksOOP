package horstmannStructures;

import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int angle = in.nextInt();
		int i = angle;
		i = i % 360;
		if (i < 0) {
			i += 360;
		}
		System.out.println(i);
		int j = angle;
		j = Math.floorMod(j, 360);
		System.out.println(j);
	}
}
