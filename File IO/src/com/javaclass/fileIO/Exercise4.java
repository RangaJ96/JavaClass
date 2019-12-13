package com.javaclass.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Exercise4 {
	
	public static void main(String[] args) throws Exception  
    { 
        
        PrintWriter pw = new PrintWriter("D:/Java class/FileIOExample/ex4Output.txt"); 
        BufferedReader br1 = new BufferedReader(new FileReader("D:/Java class/FileIOExample/ex4Input.txt"));
        String line1 = br1.readLine(); 
          
        while(line1 != null) 
        { 
            boolean flag = false; 
            BufferedReader br2 = new BufferedReader(new FileReader("D:/Java class/FileIOExample/delete.txt"));  
            String line2 = br2.readLine();
           
            while(line2 != null) 
            {  
                if(line1.equals(line2)) 
                { 
                    flag = true; 
                    break; 
                }  
                line2 = br2.readLine(); 
            } 
            if(!flag){ 
                pw.println(line1); 
                pw.flush(); 
            }   
            line1 = br1.readLine();       
        } 
        
        br1.close(); 
        pw.close(); 
          
        System.out.println("File operation performed successfully");
    }
}
