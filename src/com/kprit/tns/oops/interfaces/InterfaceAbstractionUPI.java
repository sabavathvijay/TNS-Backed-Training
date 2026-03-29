package com.kprit.tns.oops.interfaces;

import java.util.Scanner;

public class InterfaceAbstractionUPI implements InterfaceAbstractionShopping {

	//Required Data for UPI Payment
	
	private String phNo = "9876543210";
	private int pinNo =1234;
	
	
	
	@Override
	public void payment() {
		//Variables for User data
		String userPhNo ;
		int userPIN;
		
		// Implementing to UnImplemented Method in the Interface
		//Logic to Make Payment
	
		
		System.out.println("Enter the Mobile No = ");
		
		//Taking the Mobile to Verify
		Scanner sc = new Scanner(System.in);
		userPhNo = sc.nextLine();
		
		
		System.out.println("Enter Your PIN = ");
		
		//Taking the Mobile to Verify
		
		userPIN = sc.nextInt();
		
		//Logic to Validate for Payment
		
		//Checking for the Mobile Number to Verify
		if(phNo.equals(userPhNo)) {
			//After Verifying the Mobile number check for PIN
			if(pinNo==userPIN) {
				
				System.out.println("Payment is Done..!");
			}else {
				System.out.println("Payment Declined..!");
			}
			
		
		}else {
			System.out.println("Invalid Mobile Number..!");
		}
		
		
		
		
	}

}
