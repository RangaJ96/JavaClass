package com.javaclass.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercise1 {

	public static void main(String [] args)throws Exception{
		
		BufferedReader file1=new BufferedReader(new FileReader("D:/Java class/FileIOExample/file1.txt"));
		BufferedReader file2=new BufferedReader(new FileReader("D:/Java class/FileIOExample/file2.txt"));
		BufferedWriter file3=new BufferedWriter(new FileWriter("D:/Java class/FileIOExample/file3.txt"));
		
		Exercise1 ex1=new Exercise1();
		ex1.mergeFiles(file3,file1);
		ex1.mergeFiles(file3,file2);
		file3.flush();
		file3.close();
	}
	
	private void mergeFiles(BufferedWriter writeFile ,BufferedReader readFile)throws Exception{
		String line=readFile.readLine();
		while(line != null){
			writeFile.write(line);
			writeFile.newLine();
			line=readFile.readLine();
		}
		readFile.close();
		System.out.println("File operation has been successfully completed");
	}
}
