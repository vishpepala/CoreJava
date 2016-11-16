package com.vish.batch2.exceptions;

public class Demo {
	
	public static void main(String[] args) {
		try {
			System.out.println(abc());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Last");
	}
	
	static String abc() throws Exception{
		try{
			int c = 10/0;
			System.out.println(c);
			
		} catch (Exception excep){
			excep.printStackTrace();
			throw excep;
		} finally {
			System.out.println("Finally");
		}
		return "Hai";
	}
}
