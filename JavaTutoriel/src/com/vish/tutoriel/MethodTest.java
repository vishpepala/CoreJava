package com.vish.tutoriel;

public class MethodTest extends UseGlobal {
	private int attr ;
	private static String x = "abc";
	
	MethodTest(){
		this(123);
	}
	
	MethodTest(int attr){
		//this.setAttr(attr);
		setAttr("Vish");
	}

	public int getAttr() {
		return attr;
	}

	public void setAttr(int attr) {
		this.attr = attr;
		System.out.println(attr);
	}
	
	
	public static void main(String arg[]){
		try{
			int i = 10/0;
			System.out.println(i);
		} catch (ArithmeticException e){
			System.out.println("There is a error in the logic. "
					+ "Check again.  Here is the reason: " + e.getMessage());
			
		}
		System.out.println("End of program");
	}
	
}
