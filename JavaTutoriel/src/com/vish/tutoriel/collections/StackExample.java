package com.vish.tutoriel.collections;

import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 * search(Obj)
 * empty()
 * push(obj)
 * pop(), peek()
 */
public class StackExample {

	public static void main(String[] args) {
		Employee employee = new Employee(26, "Gopal","Dev");
		Employee employee1 = new Employee(27, "Ravi","Dev");
		Employee employee3 = new Employee(28, "Raju","QA");
		
		Vector<Employee> aStack = new Vector<Employee>();
		aStack.add(employee);
		
		aStack.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getId() < o2.getId()){
					return 0;
				} else if (o1.getId() > o2.getId()) {
					return 1;
				}
				return -1;
			}
		});
	}

}
