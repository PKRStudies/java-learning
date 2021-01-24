package com.pkr.java.multithreading.producer.consumer;

import java.util.concurrent.SynchronousQueue;

public class ConsumerQueue implements Runnable {

	private Message msg;
	
	final SynchronousQueue<String> queue = new SynchronousQueue<String>();
	public ConsumerQueue(Message msg) {
		this.msg = msg;
	}

	public ConsumerQueue() {
		super();
	}

	public void run(){
		String data;
		try {
			data = msg.getFromQueue();
			while(data != null) {
				System.out.println(Thread.currentThread().getName()+"::"+data);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
