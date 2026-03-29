package com.kprit.tns.oops.inheritance;

//The single Inheritance 
/*
 There will be only to class for this inheritance 
 1. Parent class
 2. Child class 
 
 The child class Acquires the (members /fields and methods ) properties and Behaviors/Methods of it's Parent class
 
 
 And the Child class can Override method of the Parent class .......!
 */


public class SingleInheritanceParent {
	
	String house = "2BHK";
	
	String land = "5 acres";
	
	
	void perperites() {
		
		System.out.println("I have House and Land \n"+ house + "\n"+land);
		
	}
	
	public void iAm() {
		System.out.println("I'm Parent");
	}
	
	
	

}
