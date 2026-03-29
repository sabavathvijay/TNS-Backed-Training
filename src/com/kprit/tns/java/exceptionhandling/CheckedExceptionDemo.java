package com.kprit.tns.java.exceptionhandling;

import java.io.*;

/*
 
 Checked->Compiler checks at compile time
	=> 1) IOException
		=>EoFException
		=>FileNotFoundException
		=======These are Related to 
	=> 2) SQLException
	
	//Tread related  especially for the  " Interruptible blocking state (like : Thread.sleep(), Object.wait() , or Thread.joid()) "
	=> 3) InterreptedException
	
	=> 4) ClassNotFoundException
	
*/


public class CheckedExceptionDemo {

	
	
	// ====== Main Method ==================
	public static void main(String[] args) {

//Object 
		CheckedExceptionDemo obj = new CheckedExceptionDemo();
		
		
		obj.IOException();
		System.out.println("\nMain Block ..");
		System.out.println("\n");
		
		obj.interruption();

	}
	
	//========= IOException ======
	/*
	 It's a checked exception so, It checks at compile time before executing the program 
	 => and if there is any exception it throws that exception so, for in this  case it allows 
	 	and recommend us to Handle the Exception 

	 
	 
	 */
	
	//IOException Method
	void IOException() {
	
	// File not found exception
	
	FileReader reader= null;
	
	//Handling the exception
	
	try {
		
		reader = new FileReader("file.txt");
		
		System.out.println("File Opened Successfully..!");
		
	}catch(FileNotFoundException e) {
		System.err.println("this is exception : ");
	}
	
	
	}
	
	void interruption() {
		
		
		System.out.println("This is the Exception related to Thread Interruption  Blocking States...!");
		
		
		
	}

}
