package horstmannStructures;

import java.util.Scanner;

public class Task8 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] words = s.split("\\s");
		for (String str : words) {
			String word = str.trim();
			if (word.isEmpty()) {
				continue;
			}
			System.out.println(word);
		}
	}
}
