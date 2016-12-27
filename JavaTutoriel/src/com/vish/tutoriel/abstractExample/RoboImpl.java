package com.vish.tutoriel.abstractExample;

public class RoboImpl extends RoboPrototype {

	@Override
	public void walk() {
		System.out.println("Walking..");
		
	}

	@Override
	public void run() {
		System.out.println("Running..");
		
	}
	
	private void xyz(){
		
	}

	public void abc(){
		System.out.println("Hello world.");
	}
}
