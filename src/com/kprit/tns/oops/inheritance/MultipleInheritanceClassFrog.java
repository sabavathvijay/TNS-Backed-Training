package com.kprit.tns.oops.inheritance;

//Achieving Multiple Inheritance using Interfaces using  " implements  "  rather than Class extending 

public class MultipleInheritanceClassFrog implements MultipleInheritanceInterfaceSwimmer , MultipleInheritanceInterfaceWalker{

	
	
	@Override
	public void walk() {
		// This method is Overriding from Walker Interface
		System.out.println("I can Walk");
		
	}

	@Override
	public void swim() {
		// This method is Overriding from Walker Interface
		
		System.out.println("I can Swim");
		
	}
	
	

}
