package com.kprit.tns.oops.polymorphism;

//Polymorphism  means Many forms
/*
 In Java we can achieve this polymorphism , and this is the fundamental concept in OOPs
 There are two types of polymorphisms
 1. Compile-Time polymorphism
  => Method Overloading : Same method name but with Different Parameters within the same class,
   It is depends on the return type of methods just cares parameters
  
 2. Run-Time polymorphism 
  => Method Overriding : Same method name but different Implementation logic , 
  and implemented with same method name but in different Class 
 
 */

public class PolymorphismDemo {
	
	
	
	public static void main(String args[]) {
	
// Object for MethodOverloadingMain  to call from here
	
		//for now not using Object
		
	    //    MethodOverloadingMain overloading = new MethodOverloadingMain();
	
	//Calling to the methodMain
	
		System.out.println("This is Overloading :");
		
	    //overloading.methodMain();
	
	
	//The methodMain is Static so , we calling it in static way Using class name Instead object 
	MethodOverloadingMain.methodMain();
	
	//Override Using Vehicle
	
	
	System.out.println("\nThis is Overriding :");
			//Reference for Vehicle Class
			Vehicle myVehicle;
			
			//Pointing to the Car Object
			myVehicle = new Car();
			
			myVehicle.run();
			
			
			//Pointing to the Bike Object
					myVehicle = new Bike();
					
					myVehicle.run();
			

	
	
	
	
	
	
	
	
	}
	
}
