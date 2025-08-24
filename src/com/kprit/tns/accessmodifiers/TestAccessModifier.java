package com.kprit.tns.accessmodifiers;


/*
 Here we test the 
 Access modifiers 
  1) Default 
  2) Protected
  3) Public
 
 */
public class TestAccessModifier {

	public static void main(String[] args) {
		//Accessing the Default class in other class but same Package
		
	//Creating the Object for the Default Class 
		AccessModifiersDemo def = new AccessModifiersDemo();
		
		def.printDefault();

		
		//Creating the Object to Access the  Protected method from Default/Public  Class 
		
		AccessModifierProtected prot = new AccessModifierProtected();
		//Note: Check if the Scanner class Object is Closed or Not
		//If we want Take input again in the next method from other class will Not ask/Read the Input 
		//if we Closed the Scanner Object before the Taking Input It will be not ask/ read Input
		// because the Scanner Resource is No More , that is Closed, so Make sure that Not to close the Scanner Object .  
		prot.printProtected();
		
		//Creating the Object for the public Class 
		
		// Here we Closed the Object of Scanner 
		//So, here we cannot take/give input
		//You can Check the " printProtected() " method in  AccessModifierProtected() Class to Verify
		AccessModifierPublic pub = new AccessModifierPublic();
		pub.printPublic();
		
	}

}
