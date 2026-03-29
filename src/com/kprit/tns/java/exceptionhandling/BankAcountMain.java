package com.kprit.tns.java.exceptionhandling;



public class BankAcountMain {

	public static void main(String[] args) {
		//Object for BankAccount
		
		BankAccount Obj = new BankAccount(6000);
		
		//WithDraw method has an Exception
		
		try {
		
		
		Obj.withDraw(200);
		}catch(Exception e) {
			System.err.println(e);
		}
		
		finally {
		System.out.println(Obj.getBalance());
		
		}
	}
	
	

}
