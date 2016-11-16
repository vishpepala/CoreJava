package com.vish.batch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic {
  public static void main(String arg[]) throws IOException{
	  InputStreamReader isr = new InputStreamReader(System.in);
	  BufferedReader br = new BufferedReader(isr);
	  System.out.println("Hello.  Please Enter your Name:");
	  
	  System.out.println("Hello " + br.readLine());
	  
	  System.out.println("Enter your age:");
	  
	  int age = Integer.valueOf(br.readLine());
	  
	  if(age < 18){
		  System.out.println("You are minor");
	  } else {
		  System.out.println("You are Major");
	  }
  }
} 
