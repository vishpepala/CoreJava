package com.vish.tutoriel.generics;

public class Box<T,X> {

	T obj;
	X obj1;
	
	Box(T t, X x){
		this.obj = t;
		this.obj1 = x;
	}
	
	T getObj(){
		return obj;
	}
	
	X getObj1(){
		return obj1;
	}
	
	void display(){
		System.out.println(obj);
		System.out.println(obj1);
	}
}