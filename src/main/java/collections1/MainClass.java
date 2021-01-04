package collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainClass {
	public static void main(String args[]) {
		Node<Integer> node = new Node<>(2);
		// System.out.println(node);
		ILinkedList<Integer> list = new MyLinkedList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		// System.out.println(list);
		list.clear();
		List<Integer> ilist = new LinkedList<>();
		List<Integer> alist = new ArrayList<>();
		Set<Integer> hset = new HashSet<>();
		Set<Integer> lhset = new LinkedHashSet<>();
		Set<Integer> tset = new TreeSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> lmap = new LinkedHashMap<>();
		Map<Integer, Integer> tmap = new TreeMap<>();
		for (int i = 0; i < 10000; i++) {
			list.add(i);
			ilist.add(i);
			alist.add(i);
			hset.add(i);
			lhset.add(i);
			tset.add(i);
			map.put(i, i);
			lmap.put(i, i);
			tmap.put(i, i);
		}
		long start, end, elapsedTime;
		System.out.println("MyLinkedList and LinkedList");
		System.out.print("MyList - ");
		System.out.print("Add end: ");
		start = System.nanoTime();
		list.add(1);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Add mid: ");
		start = System.nanoTime();
		list.add(5000, 1);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Add begin: ");
		start = System.nanoTime();
		list.add(0, 1);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print("\nList - ");
		System.out.print("Add end: ");
		start = System.nanoTime();
		ilist.add(1);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Add mid: ");
		start = System.nanoTime();
		ilist.add(5000, 1);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Add begin: ");
		start = System.nanoTime();
		ilist.add(0, 1);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print("\nMyList - ");
		System.out.print("Remove end: ");
		start = System.nanoTime();
		list.remove(10000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Remove mid :");
		start = System.nanoTime();
		list.remove(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Remove begin: ");
		start = System.nanoTime();
		list.remove(0);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print("\nList - ");
		System.out.print("Remove end :");
		start = System.nanoTime();
		ilist.remove(10000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Remove mid :");
		start = System.nanoTime();
		ilist.remove(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Remove begin: ");
		start = System.nanoTime();
		ilist.remove(0);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print("\nMyList - ");
		System.out.print("Get end: ");
		start = System.nanoTime();
		list.get(10000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Get mid: ");
		start = System.nanoTime();
		list.get(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Get begin: ");
		start = System.nanoTime();
		list.get(0);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print("\nList - ");
		System.out.print("Get end: ");
		start = System.nanoTime();
		ilist.get(9999);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Get mid: ");
		start = System.nanoTime();
		ilist.get(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Get begin: ");
		start = System.nanoTime();
		ilist.get(0);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.println("\nArrayList:");
		System.out.print("Add end: ");
		start = System.nanoTime();
		alist.add(1);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Add mid: ");
		start = System.nanoTime();
		alist.add(5000, 1);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Add begin: ");
		start = System.nanoTime();
		alist.add(0, 1);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print("\nRemove end: ");
		start = System.nanoTime();
		alist.remove(10000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Remove mid :");
		start = System.nanoTime();
		alist.remove(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Remove begin: ");
		start = System.nanoTime();
		alist.remove(0);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print("\nGet end: ");
		start = System.nanoTime();
		alist.get(9999);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Get mid: ");
		start = System.nanoTime();
		alist.get(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Get begin: ");
		start = System.nanoTime();
		alist.get(0);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print("\nHashSet - ");
		System.out.print("Add: ");
		start = System.nanoTime();
		hset.add(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Remove: ");
		start = System.nanoTime();
		hset.remove(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Contains ");
		start = System.nanoTime();
		hset.contains(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print("\nLinkedHashSet - ");
		System.out.print("Add: ");
		start = System.nanoTime();
		lhset.add(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Remove: ");
		start = System.nanoTime();
		lhset.remove(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Contains ");
		start = System.nanoTime();
		lhset.contains(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print("\nTreeSet - ");
		System.out.print("Add: ");
		start = System.nanoTime();
		tset.add(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Remove: ");
		start = System.nanoTime();
		tset.remove(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Contains ");
		start = System.nanoTime();
		tset.contains(5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print("\nHashMap - ");
		System.out.print("Add: ");
		start = System.nanoTime();
		map.put(5000, 5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Remove: ");
		start = System.nanoTime();
		map.remove(10000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Get: ");
		start = System.nanoTime();
		map.get(0);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print("\nLinkedHashMap - ");
		System.out.print("Add: ");
		start = System.nanoTime();
		lmap.put(5000, 5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Remove: ");
		start = System.nanoTime();
		lmap.remove(10000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Get: ");
		start = System.nanoTime();
		lmap.get(0);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print("\nTreeMap - ");
		System.out.print("Add: ");
		start = System.nanoTime();
		tmap.put(5000, 5000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Remove: ");
		start = System.nanoTime();
		tmap.remove(10000);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);
		System.out.print(" Get: ");
		start = System.nanoTime();
		tmap.get(0);
		end = System.nanoTime();
		elapsedTime = end - start;
		System.out.print(elapsedTime);

	}
}