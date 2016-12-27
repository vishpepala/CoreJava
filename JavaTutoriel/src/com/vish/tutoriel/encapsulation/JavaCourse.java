package com.vish.tutoriel.encapsulation;

public class JavaCourse {

	private int duration;
	
	private int fee;
	
	private String instituteName = "Fita Academy";
	
	public JavaCourse(){
		System.out.println("Hello buddy");
	}
	
	public JavaCourse(Integer duration, int fee, String token){
		if(duration.TYPE == Integer.class){
		System.out.println("Success");
		}
	}

	public int getDuration() {
		return duration;
	}

	public int getFee() {
		return fee;
	}

	public String getInstituteName() {
		return instituteName;
	}

}
