package com.kprit.tns.oops.abstraction;

//Calling the Methods of Interface
public class AbstractionInterfaceClassMain {

	
	//Main method , the Parent Thread called by the JVM
	public static void main(String[] args) {
		//we cannot create Object Directly for the Interface and also for Abstract class
		
		//So, First create "Reference" for Interface or for Abstract class 
		AbstractionInterfaceDemo rInterface;
		System.out.println("This is Abstraction Using Interface\n");
		rInterface = new AbstractionInterfaceClass();
		rInterface.cook();
		rInterface.test();
		
		//Create Object for Class to call Non @Override Methods 
		AbstractionInterfaceClass Obj =new AbstractionInterfaceClass();
		Obj.print();

	}

}
