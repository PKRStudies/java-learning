package com.pkr.java.learning.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetImpl {
	public static void main(String[] args) {
		Integer[] ints = {3,2,5,1,6,1,3,4};
		Set<Integer> set = new HashSet<>();
		List<Integer> list = Arrays.asList(ints);
		System.out.println(list);
		set.addAll(list);
		System.out.println(set);
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//Set setSort = new TreeSet<Integer>(set);
		//System.out.println(setSort);
	}
}
