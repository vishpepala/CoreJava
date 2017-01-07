package com.vish.tutoriel.threads;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleThread {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread("1");
		MyThread t2 = new MyThread("2");
		MyThread t3 = new MyThread("3");
		
		ExecutorService service = Executors.newFixedThreadPool(1);
		service.submit(t1);
		service.submit(t2);
		service.submit(t3);
		
	}

}
