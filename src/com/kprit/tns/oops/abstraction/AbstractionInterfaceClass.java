package com.kprit.tns.oops.abstraction;

//The Abstraction Using Interface
//And we cannot create Object for Abstract classes and Interfaces directly

//We Implement the Unimplemented Methods of Interface

public class AbstractionInterfaceClass implements AbstractionInterfaceDemo {

	@Override
	public void cook() {
		System.out.println("I'm Cooking Biriyani");
		
	}

	@Override
	public void test() {
		System.out.println("Biriyani test is Delicious");
		
	}
	
	//to use the Non-Overrid method we have to creat Object for this class first and then make Call
public void print() {
	System.out.println("\nI'm method from this class and \nHere ,Interface is Implemented");
}
}
