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

/**
 * add(), AddFirst(), addLast(), removeFirst(),removeLast(), 
 * clear()
 * getFirst(), getLast(), 
 * 
 *
 */



public class LinkedListExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		Employee employee  = new Employee(26, "Gopal","Dev");
		Employee employee1 = new Employee(26, "gopal","Dev");
		Employee employee2 = new Employee(27, "Krish","Dev");
		Employee employee3 = new Employee(28, "Rajan","QA");
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();
		
		HashSet<Employee> stringSet = new HashSet<>();
		
		stringSet.add(employee);
		stringSet.add(employee1);
		stringSet.add(employee2);
		stringSet.add(employee3);
		stringSet.add(employee4);
		stringSet.add(employee5);
		
		
		
		for (Employee string : stringSet) {
			System.out.println(string);
		}
		
		
		
 	}
	
	private static List<Employee> getEmpList(){
		Employee employee  = new Employee(26, "Gopal","Dev");
		Employee employee1 = new Employee(26, "Sopal","Dev");
		Employee employee2 = new Employee(27, "Krish","Dev");
		Employee employee3 = new Employee(28, "Rajan","QA");
		
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(employee);
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee2);
		
		return empList;
	}

}
