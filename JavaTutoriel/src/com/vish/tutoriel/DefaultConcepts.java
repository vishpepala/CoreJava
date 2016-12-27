package com.vish.tutoriel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class DefaultConcepts {


	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		//int a = sc.nextLine();
		System.out.println(sc.nextLine());
		
		InputStreamReader isr = new InputStreamReader(System.in);
		//isr.read();
		BufferedReader br = new BufferedReader(isr);
		String name = "";
		
		System.out.print("Name: ");
		name = br.readLine();
		System.out.println("Hello " + name);
		System.out.print("Enter your identification number: ");
		Integer idNumber = Integer.parseInt(br.readLine());
		if(idNumber == 123456){
			System.out.print("Success; You are Authorised");
		} else {
			System.out.println("You are not Authorised");
			System.out.print("Enter your identification number(2 nd attempt): ");
			idNumber = Integer.parseInt(br.readLine());
			if(idNumber == 123456){
				System.out.println("Success; You are Authorised");
			} else {
				System.out.println("You are not Authorised");
				System.out.print("Enter your identification number(3 nd attempt): ");
				idNumber = Integer.parseInt(br.readLine());
				if(idNumber == 123456){
					System.out.println("You are Authorised");
				} else {
					System.out.println("You are not Authorised; Your account has been locked");
				}
			}
		}
		
		
		
		Random r = new Random(8522);
	    System.out.println(10000 + r.nextInt(20000));
	}
	
/*	public static void main(String[] args) {
		String s = "Hai! Hello World, Very Good Morning";
		char[] ch = s.toCharArray();
		String str = "WVGHMH";
		for(Character c: ch){
			if(Character.isUpperCase(c)) {
				str.concat(c.toString());
			}
		}
		
		System.out.println(str.indexOf("H", 1));
	}*/

	public static void getId(BufferedReader br) throws IOException {
		Integer idNumber = Integer.parseInt(br.readLine());
		if(idNumber == 123456){
			System.out.print("You are Authorised");
		} else {
			System.out.print("You are not Authorised");
		}
	}
	
	/*public static void main( String[] args ){
	    Dog aDog = new Dog("Marcus");
	    myMethod(aDog);

	    aDog.getName().equals("Marcus"); // true

	    aDog = new Dog("Jimmy");
	    aDog.getName().equals("Jimmy"); // true
	    
	    System.out.println(aDog.hashCode());
	    System.out.println(aDog.hashCode());
	    if (aDog.getName().equals("Marcus")) { //true
	        System.out.println( "Java passes by value." );

	    } else if (aDog.getName().equals("Jimmy")) {
	        System.out.println( "Java passes by reference." );
	    }
	}

	public static String myMethod(Dog aDog) {
		aDog.getName().equals("Marcus"); // true

		aDog = new Dog("Jimmy");
		aDog.getName().equals("Jimmy"); // true
	    System.out.println(aDog.hashCode());
	    return null;
	}*/
	
}
