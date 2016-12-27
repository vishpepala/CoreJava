package com.vish.tutoriel.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) {
		Demo demo = new Demo();
		try {
			demo.readUserMessage();
			
		} catch (MyException e) {
			
			System.out.println(e.getMessage() + "  Code is: " + e.code);
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("IO Exception" + e.getMessage());
			
		} catch (Exception e){
			
			System.out.println("General Exception" + e.getMessage());
			e.printStackTrace();
		}
	}

	void readUserMessage() throws Exception {
		System.out.println("Hello. Please enter any number between 10 and 30.");
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			Integer str = Integer.valueOf(br.readLine());
			
			System.out.println("hello "+ str);
			
		} catch (Exception excep) {
			excep.printStackTrace();
			System.out.println("You seems to enter a wrong number.  Please try later.");
			throw new Exception();
		
		} finally {
			if(isr != null) {
				isr.close();
			}
		}
		
	}
}
