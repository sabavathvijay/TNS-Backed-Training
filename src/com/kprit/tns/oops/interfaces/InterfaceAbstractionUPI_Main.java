package com.kprit.tns.oops.interfaces;

public class InterfaceAbstractionUPI_Main {

	public static void main(String[] args) {
		// Creating reference for the Interface 
		
		InterfaceAbstractionShopping shopping ;
		//Creating Instance for UPI for Payment
		
		shopping = new InterfaceAbstractionUPI();
		
		
		shopping.payment();
		
		//we cannot call non static method directly by interface name, we can call only Static  methods using the Interface name 
		//InterfaceAbstractionShopping.receipt();
		shopping.receipt();
		
		//Calling this method using Interface itself because it is Static Method so, we can't call using Object Instead we class it by interface name 
		InterfaceAbstractionShopping.greeting();
	}

}
 