package com.kprit.tns.java.arrays;

public class CustomArrayCustomer {
	
	//Customer Name
	String name;
	
	//Customer Email
	String email;
	
	
	
	//Constructor to Initialize
	
	public CustomArrayCustomer(String name,String email){
		
		this.name =name;
		this.email =email;
		
	}
	
	//Overriding the toString() method 
	
	@Override
	public String toString() {
		return "CustomArrayCustomer[ name="+ name +",  email= "+ email +" ]";
	}
	
	
	
	

}
