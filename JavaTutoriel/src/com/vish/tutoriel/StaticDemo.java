package com.vish.tutoriel;

public class StaticDemo {
	public static String department = "Manufacturing";
	
	public Integer salary = 100;
	
	void print(){
		System.out.println(salary);
	}
	
	public static String getNameandAge(){
		
		String info = "Name = Vish and I am S/W Employee";
		return info;
	}
}
