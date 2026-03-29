package com.kprit.tns.java.exceptionhandling;

public class UserExceptions {

	public static void main(String[] args) {
		
		System.out.println("This is User Defining Exception..");
		// User define Exception
		
		UserExceptions Obj = new UserExceptions();
		
		try {
		Obj.userException();
		}catch(Exception e) {
			System.err.println(e);
		}
		
		System.out.println("\n After ,This is User Defining Exception..");
		
		

	}
	
	//To use User Exception we have to create a class of that Exception we Create to be Exception
	//Method to Define the Exception
	void userException() throws MyException{
		
		
		
		
		//Throwing the Exception
		throw new MyException("This is User Defining Exception.. ");
		
		
	}

}
