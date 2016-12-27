package com.vish.tutoriel.threads;

public class CustomThread extends Thread {

	public void run(){
		for(int i = 0; i < 5 ; i++){
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void display() {
		for(int i = 0; i < 20 ; i++){
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
