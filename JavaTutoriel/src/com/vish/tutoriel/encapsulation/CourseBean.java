package com.vish.tutoriel.encapsulation;

public class CourseBean{
	private String courseName ;
	private String fee;
	private String duration;

	public void setCourseName(String xyz){
		this.courseName = xyz;
	}
	
	public String getCourseName(){
		return this.courseName;
	}
	public void setFee(String fee){
		this.fee = fee;
	}
	
	public void setDuration(String duration){
		this.duration = duration;
	}
}