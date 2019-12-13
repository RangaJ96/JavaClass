package com.javaclass.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercise2 {
	
public static void main(String [] args)throws Exception{
		
		BufferedReader file1=new BufferedReader(new FileReader("D:/Java class/FileIOExample/file1.txt"));
		BufferedReader file2=new BufferedReader(new FileReader("D:/Java class/FileIOExample/file2.txt"));
		BufferedWriter file4=new BufferedWriter(new FileWriter("D:/Java class/FileIOExample/file4.txt"));
		
		Exercise2 ex1=new Exercise2();
		ex1.mergeFiles(file4,file1,file2);
		file4.close();
	}
	
	private void mergeFiles(BufferedWriter writeFile ,BufferedReader readChar, BufferedReader readNums)throws Exception{
		String chars=readChar.readLine();
		String numbs=readNums.readLine();
		while(chars != null && numbs != null){
			writeFile.write(chars);
			writeFile.newLine();
			writeFile.write(numbs);
			writeFile.newLine();
			chars=readChar.readLine();
			numbs=readNums.readLine();
		}
		readChar.close();
		readNums.close();
		System.out.println("File operation has been successfully completed");
	}

}
