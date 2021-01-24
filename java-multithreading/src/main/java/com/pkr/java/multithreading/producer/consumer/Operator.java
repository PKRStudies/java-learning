package com.pkr.java.multithreading.producer.consumer;

public class Operator {

	public static void main(String[] args) throws InterruptedException {
		printSyncronizinglyNormalWay();
	}

	private static void printSyncronizinglyNormalWay() throws InterruptedException {
		int i = 1;
		while(i < 10) {
			Message msg =new Message(i);
			Thread tc = new Thread(new Consumer(msg), "Consumer");
			Thread tp = new Thread(new Producer(msg), "Producer");

			tc.start();
			tp.start();
			i++;
		}
	}
}