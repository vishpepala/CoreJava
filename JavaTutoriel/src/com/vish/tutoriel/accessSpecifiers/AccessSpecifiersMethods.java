package com.vish.tutoriel.accessSpecifiers;

public class AccessSpecifiersMethods {

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
