package com.vish.tutoriel.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
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

	public static void main(String[] args) {
		Employee employee  = new Employee(26, "Gopal","Dev");
		Employee employee1 = new Employee(26, "gopal","Dev");
		Employee employee2 = new Employee(27, "Krish","Dev");
		Employee employee3 = new Employee(28, "Rajan","QA");
		
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(employee);
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee2);

		Employee emp = empList.get(1);
		System.out.println(emp.getName());
		System.out.println(empList.size());
		
		empList.add(1,employee3);
		
		Employee e = empList.get(1);
		System.out.println(e.getName());
		System.out.println(empList.size());
		
		/*Map<Integer, Employee> map = new TreeMap<Integer, Employee>();
		
		map.put(14, employee);
		map.put(154, employee1);
		map.put(5, employee3);
		map.put(130, employee3);
		map.put(140, employee3);
		
		map.get(154);*/
		
		
		/*Map<String, Employee> map = new HashMap<String, Employee>();
		
		map.put("Gopal", employee);
		map.put("gopal", employee1);
		map.put("Krish", employee2);
		map.put("Rajan", employee3);

		
		System.out.println(map.get("Rajan").getDept());*/
		
		/*HashSet<Employee> set = new HashSet<Employee>();
		set.add(employee);
		set.add(employee1);
		set.add(employee2);
		set.add(employee3);
		for(Employee emp : set){
			System.out.println(emp.getId() + " --- " + emp.getName());
		}*/
		
 	}

}
