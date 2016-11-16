package com.vish.tutoriel.constructors;

public class Demo {

	int id;
	String name;
	String dept;
	
	public Demo(){

	}
	
	public Demo(int id, String name, String dept){
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public static void main(String[] args) {
		Demo d = new Demo(54, "Raju", "Prod");
		
		System.out.println("id = " + d.id + " Name = " + d.name + 
				" Dept = " + d.dept);
	}
}
