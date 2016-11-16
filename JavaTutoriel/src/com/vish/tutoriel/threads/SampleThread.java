package com.vish.tutoriel.threads;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleThread {
	
	public static void main(String[] args) {
		List<String> strList  = new ArrayList<String>();
		strList.add("A");
		strList.add("B");
		strList.add("X");
		strList.add("D");
		System.out.println(strList.indexOf("X"));
		System.out.print(strList.indexOf("X"));
	}

}
