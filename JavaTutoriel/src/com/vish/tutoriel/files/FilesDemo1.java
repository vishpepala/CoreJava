package com.vish.tutoriel.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public class FilesDemo1 {

	public static void main(String[] args) throws IOException {
		File file = new File("myText.txt");
		writeFile(file);
		readFile(file);
	}
	
	private static void writeFile(File file) throws IOException{
		FileWriter writer = new FileWriter(file, true);
		writer.write("Hello.  Welcome to Java @ Fita \n");
		writer.append(" sadsdv \n");
		writer.close();
	}
	
	private static void readFile(File file) throws IOException,FileNotFoundException{
		
		FileReader reader = new FileReader(file);
		
		char charArray[] = new char[1000];
		
		reader.read(charArray);
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		
		reader.close();
	}
}
