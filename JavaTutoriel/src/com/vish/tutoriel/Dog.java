package com.vish.tutoriel;

import java.io.Serializable;

public class Dog implements Serializable{

	private static final long serialVersionUID = -5259785057300017247L;

	static {
		System.out.println("Static block");
	}
	
	private String name;
	
	public Dog(String name){
		System.out.println("Constructor");
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
