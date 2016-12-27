package com.vish.tutoriel.inheritance;

public class SubChild extends ChildClass {

	void abc(){
		super.display();
	}
	
	public static void main(String[] args) {
		SubChild child = new SubChild();
		child.abc();
		BaseClass bc = new SubChild();
	}
}
