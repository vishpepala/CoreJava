package com.vish.tutoriel.arrays;

import java.util.Date;

import com.vish.tutoriel.MyVariables;

/**
 * <access specifier> class <class name> 
 */

public class ArraysDemo {
	
	public static void main(String args[]){
		String s = "asdggaasd";
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
