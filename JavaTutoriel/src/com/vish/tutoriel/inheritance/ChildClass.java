package com.vish.tutoriel.inheritance;

public class ChildClass extends BaseClass {

	public ChildClass() {
		super(10);
	}
	
	@Override
	public void display() {
		System.out.println("Verified User");
		super.display();
	}
	
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.display();		
	}
}
