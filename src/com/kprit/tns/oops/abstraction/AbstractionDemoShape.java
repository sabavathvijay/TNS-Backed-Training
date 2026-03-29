package com.kprit.tns.oops.abstraction;

//The Abstarction is One of Main concept in OPPs

/*
 
 
 The Abstraction is Nothing but Hiding the complex Implementation Details and  Showing only the Essential Features of Object
 so, it focuses on the what the Object does rather than how it does(Functionality)
 
 => To achieve Abstraction in java we have 2 ways  
 1. Abstract classes
 2. Interfaces
 
 
 To Implement Abstraction using Classes we use " abstract " keyword for that class
 
 =>And the Abstract class is not fully abstracted it's just having Partially Abstracted because,
 => The Implementation of Abstract classes  can allows two types of methods in it 
 1. Abstract method  -> Empty method ,Doesn't have body for the methods  uses "abstract"
 2. Concrete method -> Having Body for Methods ("abstract" No need )
 
 ==> And the Methods of " Abstract  " classes must be declare with the " abstract " keyword
 ==> Where as for Interfaces it's Not Required..!
 =====> We cannot create Object for Interface
 => The Abstract Classes are Restricted to Create Objects 
 ==> And to Use the Abstract Class we must Inherit the class ->(and, We Know that we use Inheritance to @Override the Methods )
 => The Abstract method can Have ->( Constructor , Static methods and Final methods also Instance Variable but non final)
 ===>And, A Class can only extend one Abstract Class.
 
 
 
 
 
 */

//Abstract Class
public abstract class AbstractionDemoShape {
	
	
	//We must use the "abstract" keyword for abstract method in abstract class
	
	public String place =" Museume" ;
	
	//Abstract method - without body
	public abstract void draw();
	
	//Concrete Method  - Normal method with body 
	
	public void display() {
		
		System.out.println("This is a Shape..!");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
