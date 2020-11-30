package com.pkr.java.learning.collections.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.pkr.java.learning.collections.vo.Product;

class ListTesting {
	private Product door = new Product("Door", 1200);
	private Product table = new Product("Table", 1000);
	private Product chair = new Product("Chair", 400);
	List<Product> productList = new ArrayList<>();
	
	@Test
	void testAdd() {
		productList.add(door);
		productList.add(table);
		assertThat(productList, contains(door, table));
	}
	
	/*
	 * @Test public void listShouldInitiallyBeEmpty() { List<Integer> list =
	 * Arrays.asList(5, 2, 4);
	 * 
	 * assertThat(list, hasSize(3));
	 * 
	 * // ensure the order is correct assertThat(list, contains(5, 2, 4));
	 * 
	 * assertThat(list, containsInAnyOrder(2, 4, 5));
	 * 
	 * assertThat(list, everyItem(greaterThan(1)));
	 * 
	 * }
	 */
}