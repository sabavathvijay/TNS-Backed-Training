package com.kprit.tns.oops.interfaces;

public class InterfaceAbstractionBankMain {

	public static void main(String[] args) {
		//Reference for the class that Implemented the Interface
		
		
		InterfaceAbstractionDemoBankAccount savingAccount ;
		savingAccount = new InterfaceAbstractionSavingAccount("vijay","2839893887399",50000);
		
		double balance =savingAccount.getBalance();

		System.out.println("The Balance is = "+balance);
	}

}
