package com.kprit.tns.oops.interfaces;


//The Abstraction can achieved in two ways 
/*
 1. Interfaces
 2. Abstract Classes
 
 ===>  Interfaces -> (Act as contract for any Class and defines a set of methods and  those MUST be implemented by Class that Implements to Interface < Especially Abstract methods > )
 
 => The Abstraction is Nothing but Hiding Implementation detail of Object and Showing essential features that Object  
 => To implement Abstractions using Interface we use "interface " keyword instead class 
 => And the Interface is Fully Abstract before Java-8 
    so, it uses only Abstract methods but No Need for to use " abstract " keyword for method.
    
    ====> We can create abstract  methods in both way using befor Java-8
    1. abstract keyword and method
    2. just method -> The abstract is Implicitly Added
    		-> these are used when that method have to  
    
 => But after the java-8 and Java-9
 ===> The Interface can be Partially Abstract 
 =>Because After Java version 8 & 9  , it Introduced 
 
 1. Default methods  -> ( Uses "default"  keyword )
 2. Static methods  -> ( Uses "static"  keyword )
===> and ,These are Concrete methods

==> And Interfaces cannot allow Constructors , -> where as the Abstract Class Allows
==> Can use Variables : " public , static final and default " , -> where as the Abstract class allow Instance variables of Non-final  
==> Methods are Implicitly "public" and "abstract"


 */

//Interface for Bank 
public interface InterfaceAbstractionDemoBankAccount {
	
	//Methods that are involved in Bank Related Actions features 
	
	//Deposit
	public void deposit(double amount);
	
	//Withdraw
	public void withdraw(double amout);
	
	//GetBalance => Method must return the balance so, Return type is "Double"
	public double getBalance();
	
	
	//GetAccountNumber =>Method must return the Account Number so, Return type is "Double"
	public String  getAccountNumber();

	
	
	
	
	
	
	
	
	

}
