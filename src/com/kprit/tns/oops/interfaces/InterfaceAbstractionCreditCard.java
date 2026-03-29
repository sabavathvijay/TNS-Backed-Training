package com.kprit.tns.oops.interfaces;

import java.util.Scanner;

//To implement the Credit card payment we need 
/*
 1. Card holder name 
 2. CCV number
 
 
 
 */
public class InterfaceAbstractionCreditCard implements  InterfaceAbstractionShopping{
//We have Saved Card holder Data to Verify
	
private String name;
private int savedCCV =2525;

	
	
	@Override
	public void payment() {
		// Implementing the method of Shopping Interface
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Card Holder Name : ");
	    name =sc.nextLine();
		System.out.println("Enter CCV Number : ");
		int CCV = sc.nextInt();
		
		//Logic to Make Payment
		
		if(savedCCV==CCV) {
			System.out.println(name+" Payment Done...!");
		}else {
			System.out.println("Payment Declined..!");
		}
		
		sc.close();
	}

}
