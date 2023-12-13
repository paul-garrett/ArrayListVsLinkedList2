/*
	An ArrayList is faster than a LinkedList for every operation except for inserting or removing from either end of the list.

	In this example the program retrieves an item from a random index in the list.

	NOTE: The program takes several seconds to execute, so you will have to wait for the results.
*/

import java.util.*;

class Main {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();

		test(list1, "Time for ArrayList is ");
		test(list2, "Time for LinkedList is ");
	}

	public static void test(List<Integer> list, String title) {
		// add 1 million integers to the list
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
		
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			// remove a random item
			list.get((int)(Math.random() * 100000));
		}

		long time = System.currentTimeMillis() - startTime;
		System.out.println(title + time + " milliseconds");
	}
}
