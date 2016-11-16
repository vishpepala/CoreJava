package com.vish.tutoriel;

public class Sample {
	
	int a;
	String s;
	float f;
	
	public Sample() {
		System.out.println("Hi.  Constructing the class");
	}
	
	public Sample(int a, String s, float f) {
		this.a = a;
		this.s =s;
		this.f= f;
	}
	
	public Sample(int a, String s) {
		System.out.println("Hi.  Constructing the class");
	}
	
	public void displayMessage(int a, int b){
		System.out.println("Hi. ");
		int c = a+ b;
		System.out.println(c);
	}
	
	public void displayMessage(int a, int b, String abc){
		System.out.println("Hi.  Good morning");
		int c = a+ b;
		System.out.println(c);
	}
	
	public void displayMessage(){
		System.out.println("Hi.  Good morning");
		String c = a+s;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Sample simple = new Sample(10, "xyz", 10.23f);
		simple.displayMessage();
		
	}
}
