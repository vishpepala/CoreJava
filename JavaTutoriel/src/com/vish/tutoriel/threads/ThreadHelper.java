package com.vish.tutoriel.threads;

public class ThreadHelper {

	public void display(){
		try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("index: "  + i );
	            Thread.sleep(500);
	         }
	     } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	     }
	}
}
