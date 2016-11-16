package com.vish.tutoriel.inheritance;

class Consumer{
	public static void main(String[] args) {
		//MyInterface tntx = new NationalTax();
		//tntx.displayMessage();
		
		AdvanceRobo aR = new AdvanceRobo();
		System.out.println(aR.name);
		aR.sayHello();
		aR.walk();
		aR.dance();
	}
}
