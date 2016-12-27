package com.vish.tutoriel.accessSpecifiers;

public class AccessSpecifiersMethods {

	public int a = 10;
	private int b = 10;
	protected int c = 10;
	int d = 10;
	
	public void publicMethod(){
		System.out.println("Hello world");
	}
	
	private void privateMethod(){
		
		System.out.println("Hello world");
	}
	
	protected void protectedMethod(){
		privateMethod();
		System.out.println("Hello world");
	}
	
	void defaultMethod(){
		System.out.println("Hello world");
	}
	
	
}
