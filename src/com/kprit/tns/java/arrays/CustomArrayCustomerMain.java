package com.kprit.tns.java.arrays;

public class CustomArrayCustomerMain {

	public static void main(String[] args) {
		// Creating CustomArrayStudent as Array 

		//Declaring as Array
		CustomArrayCustomer[] Students = new CustomArrayCustomer[3];
		
		//Initializing Array -( we Create Individual object for each index) using " new " 
		
		Students[0] = new CustomArrayCustomer("Vijay" , "vijay@gmail.com");
		Students[1] = new CustomArrayCustomer("Shiva" , "shiva@gmail.com");
		Students[2] = new CustomArrayCustomer("Vishnu" , "vishnu@gmail.com");
		
		
		//Printing all Customers
		//To use Enhanced for loop we declare type as Customed array name  and call from array reference.
		
		for(CustomArrayCustomer student:Students) {
			System.out.println(student +"\n");
		}
		
		// Custom Array Fruit
		//Declaring as Array
		Fruit[] fruit = new Fruit[4];
		
		//Inserting elements
		fruit[0] =new  Fruit("A");
		fruit[1] =new  Fruit("iu");
		fruit[2] =new  Fruit("y");
		fruit[3] =new  Fruit("t");
		
		
		for(Fruit f:fruit) {
		System.out.println(f.name);
		
		}
		
		
		
		//
		
		
	}

}
