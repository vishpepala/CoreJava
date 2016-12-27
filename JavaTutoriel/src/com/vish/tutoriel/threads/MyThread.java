package com.vish.tutoriel.threads;

public class MyThread extends Thread {

	Thread t;
	String threadName;
	ThreadHelper th;
	
	MyThread(String threadName){
		this.threadName = threadName;
		this.th = new ThreadHelper();		
	}
	
	public MyThread() {
		
	}

	public void run(){
		synchronized (th) {
			th.display();	
		}
	     System.out.println("Thread  exiting.");
		//System.out.println(Thread.currentThread().getName());
	}
	
	public void start(){
		System.out.println("Starting " +  threadName );
		if(t == null){
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
