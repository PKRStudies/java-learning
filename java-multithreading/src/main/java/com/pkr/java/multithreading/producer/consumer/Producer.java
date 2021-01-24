package com.pkr.java.multithreading.producer.consumer;

public class Producer implements Runnable{

	private volatile Message msg;
	
	public Producer(Message msg) {
		super();
		this.msg = msg;
	}

	public Producer() {
	}


	public void run() {
		synchronized (msg) {
			System.out.println(Thread.currentThread().getName()+"::"+msg.getNumber());
			msg.notify();
		}
	}
}
