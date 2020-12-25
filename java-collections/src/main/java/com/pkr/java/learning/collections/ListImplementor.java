package com.pkr.java.learning.collections;

import java.util.ArrayList;
import java.util.List;

import com.pkr.java.learning.collections.vo.Product;

public class ListImplementor {

	
	private static final int MIN_AMOUNT_HALL = 6000;
	private static Product _sofa = new Product("sofa", 10000);
	private static Product table = new Product("Table", 1000);
	private static Product chair = new Product("Chair", 1400);
	private static Product wardrobe = new Product("Wardrobe", 4400);
	private static Product _tv = new Product("TV", 7000);
	
	private static List<Product> productsForHall = new ArrayList<>();
	private static List<Product> productsForBedroom = new ArrayList<>();
	private static List<Product> productList = new ArrayList<>();
	public static void main(String[] args) {
		productList.add(_sofa);
		productList.add(table);
		productList.add(chair);
		System.out.println(productList);
		productList.sort(Product.BY_PRICE);
		System.out.println(productList);
		productList.set(productList.indexOf(table), wardrobe);
		productList.add(table);
		productList.add(_tv);
		productList.sort(Product.BY_PRICE);
		System.out.println(productList);
		prepare();
		System.out.println(productsForBedroom+"\n"+productsForHall);
		UsingForEach();
	}

	private static void prepare() {
		int splitPoint = findSplitPoint();
		productsForBedroom = productList.subList(0, splitPoint);
		productsForHall = productList.subList(splitPoint, productList.size());
	}

	private static int findSplitPoint() {
		int splitPoint = 0;
		for(Product product : productList) {
			if(product.getPrice() < MIN_AMOUNT_HALL) {
				splitPoint = productList.indexOf(product)+1;
			} else {
				break;
			}
		}
		return splitPoint;
	}
	
	private static void UsingForEach() {
		List<String> listOfString = new ArrayList<>();
		listOfString.add("Pradeep");
		listOfString.add("Sunita");
		listOfString.forEach(x -> System.out.println(x.substring(1,4)));
	}
	
}