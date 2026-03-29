package com.kprit.tns.java.exceptionhandling;

//The Exception Handling
/*
 => The exception handling is a Mechanism for Managing "Runtime Errors" in a Controlled and Predictable way
    so, the " Normal Flow " of the Application can be " Maintained " .
    
 ===> An exception is an Unwanted or Unexpected Event Occurs during the Execution of a Program 
 ===> and if we Not Handled exception ,it can cause the program to terminate suddenly
 => To handle exception java provides blocks:
 1. try block ->(It contains code that might throw Exceptions)
 2. catch block ->(It is used to Handle the Exception)
 3. finally block =>(For compulsory Execution )
 
 There are two types of Exceptions
 1. Unchecked->Not Checked at Compile time
    => 1)RuntimeExcetion
    	=>ArithmeticException
    	=>NullPointerException
    	=>NumberFormatException
    	=>IndexOutOfBoundsException
    		=>ArrayIndexOutOfBoundsException
    		=>StringIndexOutOfBoundsException
    		
    		
 2  Checked->Compiler checks at compile time
 	=> 1) IOException
 		=>EoFException
 		=>FileNotFoundException
 		
 	=> 2) SQLException
 	=> 3) InterreptedException
 	=> 4) ClassNotFoundException
 	
 	
 	================================== Throws =====================
 	Without handling manually just throwing to its parent or Caller method to Handle its Exception
 	
 ==> throw and throws  Used to Handle the Checked Exception by the JVM  
 
 These throw and throws are mainly used for UserDefined Exceptions
 
 => throw -> This is used within the method to raise the Exception in the method 
 => throws -> This is used to Hand-Over (Report to JVM/Compiler) the exception to the Parent method that calls it and it is at the Level of Method Signature 
 
 
 
 
 */

//Inheriting the classes by the Multi-level Inheritance
public class ExceptionhandlingDemo extends UnCheckedRuntimeExceptionDemo{
	
	
	public static void main(String args[]) {
	
	//Object for this class 
	ExceptionhandlingDemo Obj = new ExceptionhandlingDemo();
	
	Obj.arithmetic();
	System.out.println();
	Obj.indexOutBounds();
	System.out.println();
	Obj.nullPointer();
	System.out.println();
	Obj.numberformat();
	System.out.println();
	Obj.interruption();
	}
	
	
	
	
 
	
	

}




