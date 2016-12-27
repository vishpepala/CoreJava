package com.vish.tutoriel.threads;

public class SampleThread {
	
	public static void main(String[] args) throws InterruptedException {
		CustomThread ct = new CustomThread();
		CustomThread ct1 = new CustomThread();
		MyThread t = new MyThread("asdfg");
		
		ct.start();
		ct1.start();
		t.start();
		
		/*ct.display();
		ct1.display();*/
		
		System.out.println("I am not waiting for the threds to die...");
		
		System.out.println(ct.getName());
		System.out.println(ct1.getName());
		
	}

}
