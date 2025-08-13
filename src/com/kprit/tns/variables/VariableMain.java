package com.kprit.tns.variables;


//Main Method Class to Create and call the VariableDemo class Object and Methods

public class VariableMain {

	public static void main(String args[]) {
		//Create Object for VariableDemo class
		
		VariableDemo Obj = new VariableDemo();
		Obj.Students();
		
		//Accessing Instance and Static Variables  Using Object( Class - Instance/reference )
		
		System.out.println(Obj.name);
		System.out.println(Obj.college);
		
		//Accessing the Static Variable in static method using Class-name
		
		System.out.println(VariableDemo.college);
		
		//System.out.println(VariableDemo.name);
		//We cannot Access Non-static Variables in Static Method using Class-nmae ( 'name' is Instance - Variable )
		
		// System.out.println(Obj.branch); 
		//cannot Access the Local Variable OutSide the Methods, only Within Method ( bcz, It'll Distroyed after used within method )
		
		
		
	}
	
}
