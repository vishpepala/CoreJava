package com.vish.tutoriel.abstractExample;

public class Consumer {
	
	public static void main(String[] args) {
		final RoboPrototype r = new Robo();
		r.message();
		r.dance();
		r.run();
		System.out.println(r.name);
	}
}
