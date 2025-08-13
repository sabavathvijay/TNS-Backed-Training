package com.kprit.tns.variables;

//Create Different types Variables
/* 1. local
   2. instance 
   3. Static 
   
 */

public class VariableDemo{
	
	// Instance Variable : Inside class  outside method
	String name = "Vijay";
	
	//Static Variable : Inside class outside method Using 'Static' keyword
	static String college = "KPRIT";
	
	
	public void Students() {
		//Local Variable : Inside method , can be Accessed only within the  Method.
		String branch = "CSE";
		
		System.out.println(branch);
		
		
	}
	

}
