
//This package name also an Identifier  
package com.kprit.tns.datatypes;

//Demo for Identifiers
/*
 The Identifiers are the Names in Java -> [Variables , Methods, Classes and Packages ]
 
 There are some rules to Create Identifiers in JAVA :
 
 1. Can include Letters(A-Z , a-z ) , Digits(0-9) ,charector( _ ) and ' $ ' .
 2. Must begin with Above , but cannot  with Digits. 
 3. They are Case-sensitive.
 4. Cannot be one of Java's Reserved Keywords .
 5. No Length Limit 
 ===== Naming Conventions ======
 As a Developer We follow Standard Naming Conventions, for developing programs to Improve code Readability
 
  1. Classes & Interfaces  => Start with Upper-case and use  camel-case
  2. Methods & Variables => Start with lower-case and use camel-case
  3. Packages  =>  Uses all lower-case letters
  4. Constant => Uses all Upper-case letters with underscores ( _ )
  
 
 */

//Class Name is an Identifier
public class Identifiers {  
	
	String name ="Vijay";  // name variable is an Identifier . 
	int studentId = 101;   
	char _char = 'A';
	
	double $money = 10000.00;
			
	void Method() {
	System.out.println("This Method name is an 'Identifier' ");
	
	}
	
	//Overriding to the toString Method of Object Class 
			@Override
			public String toString() {
				return " Identifiers{name='"+name+"',$money='"+$money+"' }";
				
			}
	
	
}
