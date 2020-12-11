package com.pkr.java.mutlithreading.threads;

import com.pkr.java.mutlithreading.vo.ProductVO;

public class WorkerThread_1 implements Runnable {

	ProductVO productVO;
	
	public WorkerThread_1(ProductVO productVO) {
		super();
		this.productVO = productVO;
	}

	public void run() {
		if(productVO == null) {
			return;
		}
		if(productVO.getPricePerPiece() < 500) {
			System.out.println("Delivery fee applied on "+productVO.getName());
		} else {
			System.out.println("Delivery fee is zero on "+productVO.getName());
		}
		 try {  Thread.sleep(1000);  } catch (InterruptedException e) { e.printStackTrace(); }  
		 System.out.println("End");
	}
 
}
