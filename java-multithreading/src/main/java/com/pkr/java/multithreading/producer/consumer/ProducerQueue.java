package com.pkr.java.multithreading.producer.consumer;

public class ProducerQueue implements Runnable{

	private Message msg;

	public ProducerQueue(Message msg) {
		super();
		this.msg = msg;
	}

	public ProducerQueue() {
	}


	public void run() {
		String data;
		try {
			int i = 1;
			while(i < msg.getNumber()) {
				data = Integer.toString(i);
				System.out.println(Thread.currentThread().getName()+"::"+data);
				i++;
				msg.putInQueue(data);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
