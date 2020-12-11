package com.pkr.java.learning.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.pkr.java.learning.collections.vo.Product;

public class MapImplementor {
	public static void main(String[] args) {
		Product door = new Product("Door", 1200);
		Product table = new Product("Table", 1000);
		Product chair = new Product("Chair", 400);
		Map<Integer,Product> map = new HashMap<>();
		map.put(1, door);
		map.put(2, table);
		map.put(3, chair);
		System.out.println(map.get(4)); //null willbe printed
		Set<Map.Entry<Integer, Product>> keySet = map.entrySet();
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		for(Entry<Integer, Product> e : keySet) {
			System.out.println(e.getValue());
		}
		differenceBetweenGetAndGetOrDefault();
	}
	
	private static void differenceBetweenGetAndGetOrDefault() {
		Map<String, Integer> map = new HashMap<>();
		map.put("abc", 1);
		map.put("bcd", 2);
		map.put("cde", 3);
		System.out.println(map.get("cde")+" vs "+map.getOrDefault("cde", 12));
		map.replace("acd", 5);
		System.out.println(map);
		
	}
}