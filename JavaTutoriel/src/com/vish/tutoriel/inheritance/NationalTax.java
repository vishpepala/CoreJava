package com.vish.tutoriel.inheritance;

public class NationalTax extends MyClass {
	void display(){
		System.out.println("National");
	}

	@Override
	public void showPassword() {
		System.out.println(MY_PASSWORD);
	}
	
	public static void main(String[] args) {
		NationalTax obj = new NationalTax();
		obj.showPassword();
	}
	
	void validateUser(){
		
	}
}
