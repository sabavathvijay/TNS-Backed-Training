package com.kprit.tns.oops.interfaces;
//Implementing  the Abstract methods of the Interface 
/*
 We can Implement the Abstract methods of the Interfaces According to our Logic 
 
 
 
 
 */

public class InterfaceAbstractionSavingAccount implements InterfaceAbstractionDemoBankAccount{

	
	//The Required data for Any bank Accounts and those are Private
	//Account holder name
	private String accountHolder;
	
	//Account Number
	private String accountNumber;
	
	//double Initial Deposit
	private double balance;
	
	
	//Constructor to Initialize the required Data
	public InterfaceAbstractionSavingAccount(String accountHolder,
											String accountNumber,
											double initialDeposit) {
		
		//Initializing the Data Variables
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=initialDeposit;
	}
	
	//Implementing the Abstract methods of the Interface InterfaceAbstractionDemoBankAccount
	
			//Overriding the UnImplemented Methods 
		
	
	
	@Override
	public void deposit(double amount) {
		//Implement the Logic for Deposit 
		
		if(amount>0) {
			balance +=amount;
		}else {
			System.out.println("Dear" +accountHolder+"Insufficiant balance to Deposit");
		}
		
		
		
	}

	@Override
	public void withdraw(double amount) {
		// Implement the Logic for Withdraw
		
		
		//We check the amount with balance amount and make sure the withdraw amount must be greater than Zero
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		}else {
			System.out.println("Dear" +accountHolder+"Insufficiant balance to Withdraw");
		}
		
	}

	@Override
	public double getBalance() {
		//Fetching the Balance 
		return this.balance;
	}

	@Override
	public String getAccountNumber() {
		// Fetching the Account Number 
		return accountNumber ;
	}

	
	
	 
	

}
