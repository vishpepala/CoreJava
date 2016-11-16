package com.vish.tutoriel.arrays;

import com.vish.tutoriel.Dog;
import com.vish.tutoriel.MyVariables;

/**
 * <access specifier> class <class name> 
 */

public class ArraysDemo {
	
	public static void main(String args[]){
		
		/*
		 *  <datatype> arrayVariable[] = new <datatype>[<length>];
		 */
		int myIntArr[] = new int[10];
		
		myIntArr[0] = 10;
		myIntArr[1] = 20;
		
		
		String strArr[] = new String[10];
		
		
		for(int i = 0; i < myIntArr.length ; i++) {
			//System.out.println(myIntArr[i]);
			System.out.println(strArr[i]);
		}
		
		// Reference datatype array example
		String s = new String();
		
		int i = 10;
		
		
		/**
		 *  <Object type> <object name> = new <Constructor>
		 *  
		 *  Ex: Integer myIntObj = new Integer();
		 */
		MyVariables m1 = new MyVariables();
		MyVariables m2 = new MyVariables();
		MyVariables m3 = new MyVariables();
		MyVariables m4 = new MyVariables();
		//Dog d = new Dog("Jimmy");
		
		MyVariables myVarsArray[] = new MyVariables[5];
		
		myVarsArray[0] = m1;
		myVarsArray[1] = m2;
		myVarsArray[2] = m3;
		myVarsArray[3] = m4;
		//myVarsArray[4] = d;
		
		System.out.println(myVarsArray[0].name);
		
		ArraysDemo arraysDemo = new ArraysDemo();
		
		arraysDemo.twoDimentionalArrayExample();
		
	}
	
	/**
	 * <access specifier> <return type> methodName(<arguments>){
	 * 
	 * 	<Statements>
	 * 
	 * }
	 */
	public void twoDimentionalArrayExample(){
		int myTwoDimArray[][] = new int[3][2];
		
		for(int row = 0; row < 5; row++){
			for(int column = 0; column < row; column++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
