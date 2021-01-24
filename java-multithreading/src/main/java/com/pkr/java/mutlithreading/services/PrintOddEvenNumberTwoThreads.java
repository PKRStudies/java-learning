package com.pkr.java.mutlithreading.services;

public class PrintOddEvenNumberTwoThreads {
	public static void main(String[] args) {
		int N = 20;

		Runnable oddThread = () -> {
			try {
				new PrintOddNumber(N).printOddNumber();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Runnable evenThread = () -> {
			try {
				new PrintEvenNumber(N).printEvenNumber();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		new Thread(oddThread).start();
		new Thread(evenThread).start();
	}
}

class PrintOddNumber {
	private int limit;
	private int num = 1;

	public PrintOddNumber(int limit) {
		this.limit = limit;
	}

	public synchronized void printOddNumber() throws InterruptedException {
		while(num < limit) {
			if(num % 2 == 1) {
				System.out.println(Thread.currentThread().getName()+" -> "+num);
			} else {
				wait();
			}
		}
		num++;
	}
}

class PrintEvenNumber {
	private int limit;
	private int num = 1;

	public PrintEvenNumber(int limit) {
		this.limit = limit;
	}

	public synchronized void printEvenNumber() throws InterruptedException {
		while(num < limit) {
			if(num % 2 == 0) {
				System.out.println(Thread.currentThread().getName()+" -> "+num);
				notify();
			} else {
				wait();
			}
			num++;
		}
	}
}