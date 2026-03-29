package com.kprit.tns.oops.abstraction;

//Inheriting the Abstract Class 
/*
 => We @Override The Abstract Class Methods 
 => We can't Create Object for Abstract class
 ==> We Implement the UnImplemented methods here ,nothing but abstract methods
 ===> we could be @Override to Concrete method it's by our Choice 
 
 */

public class AbstractionCircle extends AbstractionDemoShape{

	//Instance Variable of Abstract class
	public String draw ="Circle";
	
	@Override
	public void draw() {
		// UnImplemented method in Abstract Class
		
		//Accessing the Variable of Abstract class "place" which is already Initialized...!
		System.out.println("I'm selling my Drawing ' "+ draw + "' to "+ place);
		
	}
	
	
	
	

}
