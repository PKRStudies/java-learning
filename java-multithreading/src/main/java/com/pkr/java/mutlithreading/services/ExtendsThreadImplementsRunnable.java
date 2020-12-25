package com.pkr.java.mutlithreading.services;
public class ExtendsThreadImplementsRunnable extends Thread implements Runnable 
{ 
    public void run() 
    { 
        System.out.printf("GFG "); 
    } 
    public static void main(String[] args) throws InterruptedException 
    { 
    	ExtendsThreadImplementsRunnable obj = new ExtendsThreadImplementsRunnable(); 
        obj.run(); 
        obj.start(); 
    } 
}