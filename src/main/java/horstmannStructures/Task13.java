package horstmannStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13 {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 49;) {
			list.add(i++);
		}
		int[] array = new int[6];
		for (int i = 0; i < 6; i++) {
			int index = (int) (Math.random() * (48 - i));
			array[i] = list.get(index);
			list.remove(index);
		}
		Arrays.sort(array);
		for (int i = 0; i < 6; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
