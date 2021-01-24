package com.pkr.java.multithreading.callable.impl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableImpl {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Callable<Integer> callable = () -> {
			return 5;
		};
		Future<Integer> future = executorService.submit(callable);
		executorService.shutdown();
		int a = future.get();
		System.out.println(a);
	}

}
