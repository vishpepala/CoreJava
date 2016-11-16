package com.vish.tutoriel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.vish.tutoriel.collections.Employee;

public class SerializableExample {

	public static void main(String[] args) {
		Employee empObj = new Employee(22, "Rama", "King");
		try {
			//writeObject(empObj);
			readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void writeObject(Employee emp) throws IOException{
		FileOutputStream fos = new FileOutputStream("Employee.txt");
		ObjectOutputStream ous = new ObjectOutputStream(fos);
		ous.writeObject(emp);
		ous.close();
	}
	
	static void readObject() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("Employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee empl = (Employee) ois.readObject();
		System.out.println("id: " + empl.getId() + " Name: " + empl.getName() /*+ " new value: " + empl.abc*/);
	}
}
