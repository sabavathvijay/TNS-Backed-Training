package com.kprit.tns.java.exceptionhandling;


// Exception Propagation
/*
 The exception Propagation is nothing but checking the Parent method to Handle the Exception
 
 
 */

public class ExceptionPropagation {

	public static void main(String[] args) {
		
		//Caller method
		
		//calling method 1
		//This is Handle by try catch in its caller method 
		m1();
		
		//Here the Caller method Handovered to this main method , so in main we Prefer to Handle using try catch for Normal Execution 
		try {
		m2();
		}
		catch(Exception ee) {
			System.err.println(ee+" Handled at Main Method ");
		}

	}
	
	public static void m1() {
		
		//Caller method
		//calling method 3
		
		// We can Handle using Try-Catch blocks
		try {
		m3();
		}
		catch(Exception e) {
			System.err.println(e+" Handled at Caller Method ");
		}
	}
	
	public static void m2() throws Exception {
		
		//Caller method
		//calling method 3
		
		//We can Handle using throws by Handover to Caller method to handle Exception
		m3();
		
	}

	public static void m3() {
	
		System.out.println(20/0);
	}

}
