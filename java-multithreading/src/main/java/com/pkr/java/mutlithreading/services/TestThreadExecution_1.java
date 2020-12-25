package com.pkr.java.mutlithreading.services;
public class TestThreadExecution_1 implements Runnable 
{ 
	//Here two threads are there one is main thread and other is Thread i.e. initialized
	//It depends upon JVM which thread it schedules first.
	//Geeks GFG Geeks for (my cases)
    //GFG Geeks Geeks for
	public void run() 
	{ 
		System.out.printf("GFG "); 
		System.out.printf("Geeks "); 
	} 
	public static void main(String[] args) throws InterruptedException 
	{ 
		TestThreadExecution_1 obj = new TestThreadExecution_1(); 
		Thread thread = new Thread(obj); 
		thread.start(); 
		System.out.printf("Geeks "); 
		try
		{ 
			thread.join();
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
		System.out.println("for "); 
	} 
} 
