package com.kprit.tns.oops.polymorphism;

public class MethodOverridingMain {

	public static void main(String[] args) {

//Reference for MethodOverridingParent
		MethodOverridingParent business;
		
	// Simple Override
		//MethodOverridingChild Reference is now Pointing to the MethodOverridingChild Object.
		business = new MethodOverridingChild();
		
		MethodOverridingParent  parent= new MethodOverridingParent();
		System.out.println("When  Parent :");
		parent.marketValue();
		
		System.out.println("\nWhen  Child :");
		business.marketValue();
	
		
		//Override Using Vehicle
		
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
