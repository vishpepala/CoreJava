package com.vish.tutoriel.generics;

import com.vish.tutoriel.collections.Employee;

public class Generics<E> {

	E obj ;
	
	String a;
	
	void displayMessage(E xyz){
		
		System.out.println(xyz);
	}
	
	public static void main(String[] args) {
		Generics<int[]> genericStrings = new Generics();
		int a[] = new int[10];
		genericStrings.obj = a;
		
		Generics<Employee> genericEmp = new Generics();
		genericEmp.obj = new Employee();
		
	}
	
	
}
