package hortsmannInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task8 {
	private final static int LAST_TRY = 1000;

	public static boolean ordered(ArrayList<String> list, Comparator<String> comp) {
		String o1, o2;
		for (int i = 0; i < list.size() - 1; i++) {
			o1 = list.get(i);
			o2 = list.get(i + 1);
			if (comp.compare(o1, o2) > 0)
				return false;
		}
		return true;
	}

	public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
		int tryCount = 0;
		while (ordered(strings, comp) == false && (tryCount++ < LAST_TRY)) {
			Collections.shuffle(strings);
		}

		if (tryCount > LAST_TRY)
			System.out.println("I give up");
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("abc");
		luckySort(list, String.CASE_INSENSITIVE_ORDER);
		for (String s : list)
			System.out.println(s);
	}
}
