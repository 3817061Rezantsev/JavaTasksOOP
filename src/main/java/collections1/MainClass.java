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
	private static void checkPerformance(String desc, Runnable f) {
		final int NUM_OF_ITERATIONS = 10000;
		long start = System.nanoTime();
		for (int i = 0; i < NUM_OF_ITERATIONS; i++) {
			f.run();
		}
		long elapsedTime = (System.nanoTime() - start) / NUM_OF_ITERATIONS;
		System.out.println(desc + elapsedTime + " ms");
	}

	public static void main(String args[]) {
		Node<Integer> node = new Node<>(2);
		// System.out.println(node);
		ILinkedList<Integer> list = new MyLinkedList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		for (Integer i : list) {
			//System.out.println(i);
		}
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
		checkPerformance("MyLinkedList::add end --> ", () -> {
			list.add(1);
		});
		checkPerformance("MyLinkedList::add mid --> ", () -> {
			list.add(5000, 1);
		});
		checkPerformance("ArrayList::add end --> ", () -> {
			alist.add(1);
		});
		checkPerformance("ArrayList::add mid --> ", () -> {
			alist.add(5000, 1);
		});
		checkPerformance("LinkedList::add end --> ", () -> {
			ilist.add(1);
		});
		checkPerformance("LinkedList::add mid --> ", () -> {
			ilist.add(5000, 1);
		});

		checkPerformance("MyLinkedList::remove end --> ", () -> {
			list.remove(10000);
		});
		checkPerformance("MyLinkedList::remove mid --> ", () -> {
			list.remove(5000);
		});
		checkPerformance("ArrayList::remove end --> ", () -> {
			alist.remove(10000);
		});
		checkPerformance("ArrayList::remove mid --> ", () -> {
			alist.remove(5000);
		});
		checkPerformance("LinkedList::remove end --> ", () -> {
			ilist.remove(1);
		});
		checkPerformance("LinkedList::remove mid --> ", () -> {
			ilist.remove(5000);
		});

		checkPerformance("MyLinkedList::get end --> ", () -> {
			 list.get(9999);
		});
		checkPerformance("MyLinkedList::get mid --> ", () -> {
			 list.get(5000);
		});
		checkPerformance("ArrayList::get end --> ", () -> {
			alist.get(9999);
		});
		checkPerformance("ArrayList::get mid --> ", () -> {
			alist.get(5000);
		});
		checkPerformance("LinkedList::get end --> ", () -> {
			ilist.get(9999);
		});
		checkPerformance("LinkedList::get mid --> ", () -> {
			ilist.get(5000);
		});

		checkPerformance("HashSet::add --> ", () -> {
			hset.add(5000);
		});
		checkPerformance("HashSet::remove --> ", () -> {
			hset.remove(5000);
		});
		checkPerformance("HashSet::contains --> ", () -> {
			hset.contains(5000);
		});

		checkPerformance("LinkedHashSet::add --> ", () -> {
			lhset.add(5000);
		});
		checkPerformance("LinkedHashSet::remove --> ", () -> {
			lhset.remove(5000);
		});
		checkPerformance("LinkedHashSet::contains --> ", () -> {
			lhset.contains(5000);
		});

		checkPerformance("TreeSet::add --> ", () -> {
			tset.add(5000);
		});
		checkPerformance("TreeSet::remove --> ", () -> {
			tset.remove(5000);
		});
		checkPerformance("TreeSet::contains --> ", () -> {
			tset.contains(5000);
		});

		checkPerformance("HashMap::put --> ", () -> {
			map.put(5000, 5000);
		});
		checkPerformance("HashMap::remove --> ", () -> {
			map.remove(10000);
		});
		checkPerformance("HashMap::get --> ", () -> {
			map.get(0);
		});

		checkPerformance("LinkedHashMap::put --> ", () -> {
			lmap.put(5000, 5000);
		});
		checkPerformance("LinkedHashMap::remove --> ", () -> {
			lmap.remove(10000);
		});
		checkPerformance("LinkedHashMap::get --> ", () -> {
			lmap.get(0);
		});

		checkPerformance("TreeMap::put --> ", () -> {
			tmap.put(5000, 5000);
		});
		checkPerformance("TreeMap::remove --> ", () -> {
			tmap.remove(10000);
		});
		checkPerformance("TreeMap::get --> ", () -> {
			tmap.get(0);
		});
	}
}
