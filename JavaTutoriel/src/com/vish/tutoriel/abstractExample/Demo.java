package com.vish.tutoriel.abstractExample;

public class Demo {

	public static void main(String[] args) {
		BaseRobo br = new RoboImpl();
		br.sayHello();
		br.walk();
		br.run();
	}
}
