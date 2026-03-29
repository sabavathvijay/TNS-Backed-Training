package com.kprit.tns.oops.interfaces;
//Interface is allowing to Implement the Concrete Methods 
/*
 We can create the Concrete method in the Interfaces after the Java 8 and Java 9
 Because after that the java Introduced Keywords to Create Concrete methods
 1. default 
 2. static 
 
=> The " default " methods are used ,when we have to call using Implemented class Object 
=> And the " Static " methods are called when we want to call using direct Interface name 

 => 
 
 
 */


public interface InterfaceAbstractionShopping {
	
	
	//For Shopping we make Payment 
	public void payment();
	
	//After Shopping we'll get Receipt By Default
	
	public default void receipt() {
		
		System.out.println("This is our Receipt...");
		
	}
	
	//Greeting to Customer After the Shopping Done.
	
	public static void greeting() {
		System.out.println("Thank You");
	}
	
	

}
