package com.pkr.java.learning.collections;

import java.util.Arrays;

import com.pkr.java.learning.collections.vo.Product;

public class BeforeCollections {
	public static void main(String[] args) {
		Product door = new Product("Door", 1200);
		Product table = new Product("Table", 1000);
		Product chair = new Product("Chair", 400);
		
		Product[] products = {door, table};
		System.out.println(products + "--> Not human readable");
		System.out.println(Arrays.toString(products));
		
		//Throw exception //ArrayIndexOutOfBoundsException
		//As the size of an array is static
		//products[2] = chair;
		
		//To fix that you need to create a new array 
		//by following way to add the elements
		Product[] prods = Arrays.copyOf(products, products.length + 1);
		prods[2] = chair;
		Product[] prodList = Arrays.copyOf(prods, prods.length+1);
		prodList[3]= new Product("Bedsheet",300);
		System.out.println(Arrays.toString(prodList));
	}
}