package com.kprit.tns.java.exceptionhandling;

public class Try_Catch {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		
		//We can use the multiple Try-Catch Blocks To handle the Exceptions
		
		try {
			System.out.println(10/0);
			
			System.out.println("This is First Try block");
			
		}catch(ArithmeticException a) {
			
			System.err.println("This is Arithmetic Exception..!");
			
		}
		try {
			String str= null;
			System.out.println("This is second Try block"+str.charAt(0));
			
		}catch(NullPointerException n) {
			System.err.println("This is Null pointer  Exception..!");
		}
		
		
		//One try Block and Multiple Catch blocks 
		System.out.println("\nOne try Block and Multiple Catch blocks ");
		try {
			System.out.println(10/0);
			
			System.out.println("This is First Try block");
			
		}
		catch(NullPointerException n) {
			System.err.println("This is Null pointer  Exception..!");
		}
		

		
		catch(ArithmeticException a) {
			
			System.err.println("This is Arithmetic Occured in Multiple Catch Block Exception..!");
			
		}
		
		System.out.println("Single try-Catch with multiple Exceptions using '||' ");
		
		try {
			System.out.println(20/2);
			System.out.println(arr[2]);
			System.out.println(arr[6]);

		}catch(ArithmeticException   | NullPointerException | IndexOutOfBoundsException e ) {
			
			System.err.println(e);
			
			
		}
		
		
		// Handling Exception directly with Parent Exception Handler " Exception " , No Individual Exceptions 
		
		System.out.println("\n Handling Exception directly with Parent Exception Handler \" Exception \" , No Individual Exceptions ");
		try {
			System.out.println(20/2);
			System.out.println(arr[2]);
			System.out.println(arr[6]);

		}catch(Exception  e ) {
			
			System.err.println(e);
			
			
		}
		

	}

}
