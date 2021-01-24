package com.pkr.java.multithreading.producer.consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class Message {
  
	private String message;
	
	private int number;
	
	final SynchronousQueue<String> queue = new SynchronousQueue<String>();

	public Message() {
		super();
	}

	public String getMessage() {
		return message;
	}
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Message(String message) {
		super();
		this.message = message;
	}
	
	public Message(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + ", number=" + number + "]";
	}
	
	public void putInQueue(String msg) throws InterruptedException {
		queue.put(msg);
	}
	
	public String getFromQueue() throws InterruptedException  {
		return queue.take();
	}
	
	public ArrayBlockingQueue<Integer> queueArray = new ArrayBlockingQueue<Integer>(100);
    public Boolean continueProducing = Boolean.TRUE;
 
    public void put(Integer data) throws InterruptedException
    {
        this.queueArray.put(data);
    }
 
    public Integer get() throws InterruptedException
    {
        return this.queueArray.poll(1, TimeUnit.SECONDS);
    }
}
