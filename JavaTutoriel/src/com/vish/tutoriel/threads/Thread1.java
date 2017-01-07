package com.vish.tutoriel.threads;

public class Thread1 extends Thread {

	String s;
	
	Thread1(String s){
		this.s = s;
	}
	
	@Override
	public void run() {
		System.out.println(this.getName());
		System.out.println(s);
		super.run();
	}
	
	@Override
	public synchronized void start() {
		super.start();
	}
}
