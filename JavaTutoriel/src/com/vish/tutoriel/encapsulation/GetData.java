package com.vish.tutoriel.encapsulation;

public class GetData {
	public static void main(String[] args) {
		CourseBean course = new CourseBean();
		course.setCourseName("Java");
		course.setDuration("30");
		course.setFee("10000");
		
		System.out.println("Done..");
		abc(course);
	}
	
	static void abc(CourseBean course){
		System.out.println("Sending email for the couse of " + course.getCourseName());
	}
}
