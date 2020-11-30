package com.pkr.java.learning.collections;

import java.util.ArrayList;
import java.util.List;

import com.pkr.java.learning.collections.vo.Product;

public class ListImplementor {

	
	private static Product door = new Product("Door", 1200);
	private static Product table = new Product("Table", 1000);
	private static Product chair = new Product("Chair", 1400);
	private static Product wardrobe = new Product("Wardrobe", 3400);
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(door);
		productList.add(table);
		productList.add(chair);
		System.out.println(productList);
		productList.sort(Product.BY_PRICE);
		System.out.println(productList);
		productList.set(productList.indexOf(table), wardrobe);
		productList.sort(Product.BY_PRICE);
		System.out.println(productList);
	}
	
}