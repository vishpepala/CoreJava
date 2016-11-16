package com.vish.tutoriel;

public class MyVariables {
	//Instance variables
	public int age = 60;
	public String name = "Kabali";
	
	//Static variables
	public static String type = "DON";
	
	private String getNameandAge(){
		MyVariables myVariables = new MyVariables();
		myVariables.age = 70;
		MyVariables.type = "Rowdy Sheeter";
		
		String info = "His Name = " + myVariables.name + " his age = " +
						myVariables.age + " and he is a " + MyVariables.type;
		return info;
	}
	
	public static void main(String args[]){
		System.out.println(MyVariables.type);
		MyVariables myVariables1 = new MyVariables();
		myVariables1.age = 90;
		
		System.out.println(myVariables1.getNameandAge());
		
		/*System.out.println("His Name = " + myVariables1.name + " his age = " +
				myVariables1.age + " and he is a " + MyVariables.type);*/
		
	}
}
