package com.kprit.tns.oops.inheritance;

public class SingleInheritanceMain {

	public static void main(String[] args) {
		
		
		// Creating an Object for child class
		
		// Instance of Child class
		SingleInheritanceChild child = new SingleInheritanceChild();
		//Calling the myProperties() of child class that access Parent propertity -variable " land "
		child.myProperties();
		  System.out.println("\nThis is from Parent class parent properties :");
		child.perperites();
		
	child.iAm();

	}

}
