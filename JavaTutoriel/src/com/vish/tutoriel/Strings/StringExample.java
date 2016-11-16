package com.vish.tutoriel.Strings;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "abc" ;
		String s2 = new String("abc");
		String s3 = new String("Hello World. I am Vish. ");
		char[] helloArray = new char[10];
/*		String s4 = new String(helloArray);*/

		
		s3.getChars(1, 5, helloArray, 3);
		
		String[] strArray = s3.split(" ");
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
		/*if(s3.equals(s2)){
			System.out.println("True");
		} else {
			System.out.println("false");
		}*/
	}
}
