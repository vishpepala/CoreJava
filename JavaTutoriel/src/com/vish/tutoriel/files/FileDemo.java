package com.vish.tutoriel.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	static File file = new File("fitaMessage.txt");
	
	public static void main(String[] args) throws Exception {
		writefile();
		readFile();
	}
		
	static void writefile() throws IOException{
		String myText = "Hello World! Good morning!  Fita Computers.dvfssdgs sd";
		
		FileWriter fwriter = new FileWriter(file);
		
		fwriter.write(myText);
		fwriter.close();
	}
	
	static void readFile() throws IOException {
		char ch;
		
		FileReader fr = new FileReader(file);
		
		while((ch=(char)fr.read()) != -1){
			System.out.print(ch);
		}
		
		fr.close();
	}
}
