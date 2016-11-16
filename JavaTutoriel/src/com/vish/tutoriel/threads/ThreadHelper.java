package com.vish.tutoriel.threads;

public class ThreadHelper {

	public void display(){
		try {
	         for(int i = 20; i > 0; i--) {
	            System.out.println("index: "  + i );
	            Thread.sleep(10);
	         }
	     } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	     }
	}
}
