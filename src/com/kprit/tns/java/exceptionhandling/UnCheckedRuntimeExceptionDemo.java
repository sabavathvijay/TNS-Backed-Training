package com.kprit.tns.java.exceptionhandling;

import java.util.Scanner;

public class UnCheckedRuntimeExceptionDemo extends CheckedExceptionDemo{

	
	//======Main method ==============
	
	public static void main(String args[]) {
	
		// Object 
		UnCheckedRuntimeExceptionDemo obj = new UnCheckedRuntimeExceptionDemo();
		
		 System.out.println();
		obj.arithmetic();
		 System.out.println();
		obj.nullPointer();
		 System.out.println();
		obj.numberformat();
		 System.out.println();
		 obj.indexOutBounds();
		

// This can be run only if we handle the Exception

		System.out.println("this is the Main method Statement");

	}
	
	
	//========== Arithmetic Exception using Try - catch =========

	
	void arithmetic() {
		
		// Trying to Divide by Zero

		int x = 10;

		// Handle the Exception
		try {
			// ArithmeticException
			int d = x / 0;
			System.out.println(d);
		} catch (ArithmeticException a) {

			
			
			// Customized exception statement
			System.err.println("Number cannot be Divide by 'Zero'...");

			// Direct exception Variable
	//		  System.err.println(e);

		}
		
		
		
		
	}
	
	//============ NullPointer exception ===============
	
	
	
	void nullPointer() {
		
	//Declaring String as Null
		
		String str =null;
		
		// If we try to implement method like UpperCase or other the , gets exception
		try {
			System.out.println(str.toUpperCase());
		}catch(NullPointerException n) {
			
			System.err.println("Null cannot Modify.. ");
		}
		
		
		
	}
	
	//========== NumberFormatException ===================
	
	void numberformat() {
		
		//Trying to convert the String into Number using  " Integer.parseInt() " method
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value  =");
		
		String val = sc.nextLine();
		
				try {
					int _val =Integer.parseInt(val);
					// We can only convert number string to number... 
					System.out.println(_val);
					
				}catch(NumberFormatException nf) {
					
					System.err.println("The String Cannot be Converted into Number..");
				}
		
		
		
		
		
		
		
		
		
	}
	
	//====================== IndexOutOfBoundsExceptions ===================
	
	void indexOutBounds() {
		
		int[] arr = {1,2,3,4,5};
		String name= "vijay";
		
		
		//ArrayOutOfBounds
		try {
			
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException aib) {
			
			System.err.println("The Array Index is Out of Bound");
			
		}
		
		
		//=== StringOutOfBounds====
		
		
		try {
			System.out.println(name.charAt(6));
		}catch(StringIndexOutOfBoundsException sib) {
			
			System.err.println("The String Index is Out of Bound");
		}
		
		
		
		
	}
	
	

	

}
