package com.vish.tutoriel.generics;

class GenericExample {
	public static void main(String[] args) {
		Box<Integer,Long> bInt = new Box<Integer,Long>(20, (long) 245669);
		bInt.display();
	}
}