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
		MethodTest myObj = new MethodTest(123);
		System.out.println(myObj.attr);
		System.out.println(x);
		myObj.setAttr(233);
	}
	
}
