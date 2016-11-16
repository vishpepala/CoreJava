package com.vish.tutoriel.typecasting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Test{
	public static void main(String[] args) {
		Collection<String> names = new ArrayList<String>();
		List<String> l = (List)names;
		l.get(0);

		One one = new Two();
		one .display();
		System.out.println();
	}
}