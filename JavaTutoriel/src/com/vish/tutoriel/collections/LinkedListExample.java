package com.vish.tutoriel.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Map;

/**
 * add(), AddFirst(), addLast(), removeFirst(),removeLast(), 
 * clear()
 * getFirst(), getLast(), 
 * 
 *
 */

public class LinkedListExample {
	
	public static void main(String[] args) throws InterruptedException {
		HashMap<String, Long> contacts = new HashMap<>();
		contacts.put("Vish", 9080163676l);
		contacts.put("Vish1", 9080163674l);
		contacts.put("Vish2", 9080163677l);
		contacts.put("Vish3", 9080163678l);
		
		ArrayList<Long> mobileNumbers = new ArrayList<>();
		mobileNumbers.add(9080163676l);
		mobileNumbers.add(9080163674l);
		mobileNumbers.add(9080163675l);
		mobileNumbers.add(9080163677l);
		mobileNumbers.add(9080163670l);
		
		mobileNumbers.get(4);
		
 	}
	
	private static Set<Employee> getEmpList(){
		Employee employee  = new Employee(26, "Gopal","Dev");
		Employee employee1 = new Employee(26, "Sopal","Dev");
		Employee employee2 = new Employee(27, "Krish","Dev");
		Employee employee3 = new Employee(28, "Rajan","QA");
		
		Set<Employee> empList = new HashSet<>();
		empList.add(employee);
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		
		return empList;
	}

}
