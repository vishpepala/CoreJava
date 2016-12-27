package com.vish.tutoriel;

public class HelloWorld {
	
	String abc;
	String xyz;
	
	Dog d = new Dog("asdf");
	
	
	public HelloWorld(String abc, String xyz) throws Exception{
		if(!abc.equals("Vish") || !xyz.equals("Pepala") ){
			throw new Exception("You are not authorised");
		} else {
			this.abc = abc;
			this.xyz = xyz;
			System.out.println("Object has been created");
		}
	}
	
	public static void main(String args[]) throws Exception{
		HelloWorld helloWorld = new HelloWorld("Vish", "Pepala");
		
		System.out.println(helloWorld.abc);
	}
}
