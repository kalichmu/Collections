package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Karishma Anand
 * 
 * This Java program generates 100 random numbers between 1-1000.
 * The numbers are put into a Map. Then moved into a Set.
 * Then moved into a List and then the numbers are sorted an printed on every row.
 */
public class Collections {

	public static void main(String[] args) {

		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		// Generate 100 random numbers between 1 to 1000
		// and put into a Map
		for (int i = 1; i <= 100; i++) {
			myMap.put(i, (int) ((Math.random() * 1000) + 1));
		}

		Set<Integer> mySet = new HashSet<Integer>();
		// The numbers are then put into a Set
		mySet.addAll(myMap.values());

		List<Integer> myList = new ArrayList<Integer>();
		// The numbers are then put into a List
		myList.addAll(mySet);
		// The numbers are sorted and printed
		java.util.Collections.sort(myList);
		System.out.println(myList);
	}
}