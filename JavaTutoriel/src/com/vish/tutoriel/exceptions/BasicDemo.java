package com.vish.tutoriel.exceptions;

public class BasicDemo {

	public static void main(String[] args) {
		System.out.println("Start...\n");
		BasicDemo basicDemo = new BasicDemo();
		try {
			basicDemo.abc();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (MyException e) {
			e.printStackTrace();
		}
		System.out.println("Ended...");
	}
	
	void abc() throws MyException {
		try{
			int a = 10;
			int b = 0;
			int c = a/b;
		} catch(Exception eE){
			 
			throw new MyException(eE, "Check your logic again. Some aithmatic exception", 254l);
		}
	}
}
