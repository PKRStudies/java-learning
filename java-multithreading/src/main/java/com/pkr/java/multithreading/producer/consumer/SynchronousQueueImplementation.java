package com.pkr.java.multithreading.producer.consumer;

public class SynchronousQueueImplementation {

	public static void main(String[] args) {
		producerConsumer();
	}

	public static void producerConsumer() {
		final Message msg = new Message(5);
		Runnable producer = () -> {
			String data;
			try {
				int i = 2;
				data = Integer.toString(i);
				System.out.println(Thread.currentThread().getName()+"::"+data);
				msg.putInQueue(data);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		};
		new Thread(producer, "producer").start();

		Runnable consumer = () -> {
			String data;
			try {
				data = msg.getFromQueue();
				System.out.println(Thread.currentThread().getName()+"::"+data);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		};
		new Thread(consumer, "consumer").start();
	}

}
