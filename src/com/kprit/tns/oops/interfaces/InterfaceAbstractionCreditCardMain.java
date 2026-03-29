package com.kprit.tns.oops.interfaces;

public class InterfaceAbstractionCreditCardMain {

	public static void main(String[] args) {
		
		
		
		System.out.println("\nThis is a Payment Done Using the Credit-Card \n");
		
		//Reference for InterfaceAbstractionShopping interface
		
		InterfaceAbstractionShopping shopping ;
		
		
		
		//Instance for the InterfaceAbstractionCreditCard class
		
		
		
		shopping = new   InterfaceAbstractionCreditCard();
		
		//Calling the Methods that Ovveridden and other
		
		//Overridden method 
		shopping.payment();
		//Interface's Default method should be called using object
		shopping.receipt();
		
		//The static method of Interface must call using Interface name
		
		InterfaceAbstractionShopping.greeting();
		
		

	}

}
