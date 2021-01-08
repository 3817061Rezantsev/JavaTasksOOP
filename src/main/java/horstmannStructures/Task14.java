package horstmannStructures;

import java.util.Scanner;

public class Task14 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] words = str.split("\\s");
		int sum = 0;
		boolean flag = true;
		int[][] matrix = new int[words.length][words.length];
		for (int i = 0; i < words.length; i++) {
			matrix[0][i] = Integer.parseInt(words[i]);
			sum += matrix[0][i];
		}
		for (int i = 1; i < words.length; i++) {
			str = in.nextLine();
			words = str.split("\\s");
			int s = 0;
			for (int j = 0; j < words.length; j++) {
				matrix[i][j] = Integer.parseInt(words[j]);
				s += matrix[i][j];
			}
			if (s != sum) {
				flag = false;
			}
		}
		for (int i = 0; i < words.length; i++) {
			int s = 0;
			for (int j = 0; j < words.length; j++) {
				s += matrix[j][i];
			}
			if (s != sum) {
				flag = false;
			}
		}
		int s = 0;
		for (int j = 0; j < words.length; j++) {
			s += matrix[j][j];
		}
		if (s != sum) {
			flag = false;
		}
		s = 0;
		for (int j = 0; j < words.length; j++) {
			s += matrix[j][words.length - j - 1];
		}
		if (s != sum) {
			flag = false;
		}

		System.out.println(flag);
	}
}
