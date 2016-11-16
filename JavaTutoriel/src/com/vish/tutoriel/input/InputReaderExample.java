package com.vish.tutoriel.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReaderExample {
	public static void main(String args[]) throws IOException{
		System.out.println("Hello, Please enter no: ");
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		String s = br.readLine();
		Long a = (long) Integer.parseInt(s);
		System.out.println("Square value of " + a + " is: " + a*a);
	}
}
