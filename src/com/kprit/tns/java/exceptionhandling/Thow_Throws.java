package com.kprit.tns.java.exceptionhandling;

public class Thow_Throws {
	
	
	//Define the Exception at this Method Signature Level with same name that thrown / Created !
	void vote() throws ArithmeticException {
		
	int age= 0;
	
	if(age<=0) {
		
		//Throwing the Exception that we want to Throw
		throw new ArithmeticException("THis is My Exception");
	}
		
		
		
	}
	
	//Throwing the parent Exception
	
	void method2() throws Exception {
		
		int x=2;
		if(x%2==0) {
		//create Exception using " new "
		throw new Exception("This is  Exception from method2");
		}
		
	}
	
	
	
	//Main Method 
	
	//In main Method better to use Try-Catch for thrown exceptions  = bcz it can handle full 
	
	public static void main(String args[])  throws Exception{
		
		
		
		Thow_Throws Obj = new Thow_Throws();
		/*
		 If we don't use the Try-Catch at main the Exception cannot be handle 100%
		 ==> because after that exception handled by parent method it will not go forward execution 
		 ==> so, Better to use the Try catch at the main method to handle the exception 100% and maintain ythe flow of the Execution
		 
		 */
		 // Obj.method2();
		
		
		// MEthod2 using try-catch
		
				try {

					Obj.method2();	
				}
				catch(Exception e) {
					System.err.println(e);
				}
				
				System.out.println("\nThis Multiple exception handling\n" );
					
		
		try {
		Obj.vote();
		}catch(Exception e) {
			System.err.println(e);
		}
		
		
	
	}

}
