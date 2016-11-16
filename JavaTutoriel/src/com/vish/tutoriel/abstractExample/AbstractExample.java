package com.vish.tutoriel.abstractExample;

public class AbstractExample {

	public static void main(String args[]){
		Iphone obj = new Iphone();
		MotoG4 obj1 = new MotoG4();
		displayPhoneConfig(obj1);
		
		new AbstractExample.Builder().display();		
		
	}
	
	static void displayPhoneConfig(Iphone obj){
		obj.displayConfig();
	}
	
	static void displayPhoneConfig(MotoG4 obj){
		obj.displayConfig();
	}
	
	private static class Builder{
		public void display(){
			
		}
	}
}

class Iphone {
	void displayConfig(){
		System.out.println("2GB Ram, 5.5 inch display, 13MP camera, IOS");
	}
}

class MotoG4{
	void displayConfig(){
		System.out.println("2GB Ram, 5.5 inch display, 18mp camera, Marshmallow (Android 6)");
	}
}