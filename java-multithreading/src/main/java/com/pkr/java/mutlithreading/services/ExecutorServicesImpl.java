package com.pkr.java.mutlithreading.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.pkr.java.mutlithreading.threads.WorkerThread_1;
import com.pkr.java.mutlithreading.vo.ProductVO;

public class ExecutorServicesImpl {

	private static List<ProductVO> listOfProducts = new ArrayList<>();
	
	public static void main(String[] args) {
		listOfProducts.add(new ProductVO("bedsheet", 30, "India", 250));
		listOfProducts.add(new ProductVO("Nokia 9", 150, "Finland", 15000));
		listOfProducts.add(new ProductVO("almirah", 30000, "India", 3500));
		listOfProducts.add(new ProductVO("air cooler", 10000, "India", 5000));
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(ProductVO productVO : listOfProducts) {
			Runnable worker = new WorkerThread_1(productVO);  
			executor.execute(worker);
		}
		executor.shutdown();  
        while (!executor.isTerminated()) {   }  
        System.out.println("Finished all threads");  
	}
}
