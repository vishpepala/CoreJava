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

	void readUserMessage() throws MyException, IOException {
		System.out.println("Hello. Please Enter your name");
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();
			System.out.println("hello "+ str);
			int i = 10/0;
		} catch (IOException excep) {
				
			throw new MyException("My own Exception", (long) 14526);
		
		} catch (NullPointerException e){
			throw new MyException("My own null Exception", (long) 10000);
		} catch (Exception e){
			throw e;
			//throw new MyException("My own null Exception", (long) 10000);
		} finally {
			if(isr != null) {
				isr.close();
			}
		}
		
	}
}
