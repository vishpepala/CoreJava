package com.vish.tutoriel.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Generics<T> {

	T obj;
	
	Generics(T obj){
		this.obj = obj;
	}
	
	T getObj(){
		return obj;
	}
	
	<T> void displayMessage(T t){
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.sort(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return 0;
			}});
	}
	
	
}
