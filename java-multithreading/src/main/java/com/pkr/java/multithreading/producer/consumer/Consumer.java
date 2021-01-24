package com.pkr.java.multithreading.producer.consumer;

public class Consumer implements Runnable {

	private volatile Message msg;
	
	public Consumer(Message msg) {
		super();
		this.msg = msg;
	}

	public Consumer() {
		super();
	}

	public void run(){
		synchronized (msg) {
			try {
				msg.wait();
				System.out.println(Thread.currentThread().getName()+"::"+msg.getNumber());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
