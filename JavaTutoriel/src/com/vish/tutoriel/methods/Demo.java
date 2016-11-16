package com.vish.tutoriel.methods;

public class Demo {

	void display(){
		System.out.println("Hello.");
	}
	
	void display(String abc){
		System.out.println(abc);
	}
	
	void display(int abc){
		System.out.println("Integer Value" + abc);
	}
	
	static void add(int a, int b){
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
		d.display(0);
		Demo.add(9, 86);
	}
}
