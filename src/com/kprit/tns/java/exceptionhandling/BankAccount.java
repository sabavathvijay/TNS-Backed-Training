package com.kprit.tns.java.exceptionhandling;

public class BankAccount {
	
	private double balance;
	
	//Constructor 
	public BankAccount(double initialBalance) {
		
		//Initializing account Balance 
		this.balance = initialBalance;
		
	}
	
	//Withdrawing the Amount
	
								// Defining the Exception
	void withDraw(double amount) throws OverLimitException {
		
		
		if(this.balance <amount) {
			//Throwing custom Exception 
			
			throw new OverLimitException("Insufficient Amount ");
		
		}
		
		this.balance -=amount;
		
		System.out.println("Withdrawal successful \n ");
		
		 
		
	}
	
	//Balance
	
	public double getBalance() {
		
		return balance;
		
	}
	
	
	

}
