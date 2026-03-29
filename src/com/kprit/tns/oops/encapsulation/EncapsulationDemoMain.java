package com.kprit.tns.oops.encapsulation;

import java.util.Scanner;

//Encapsulation is the one of main pillar from OOPs 
/*
 The encapsulation is Basically Hiding of Data 
 => Combining of Properties and Method in one unit called "Class" and it is called Encapsulation
 => It is implemented by  the help of Access modifier " Private " to Hide the Data
 To access those private data , we use  i)Setter and ii)Getters
 
  1. Setters => These are the Methods Used to Set the Value to the private Variable From other class indirectly using Argument in Setter method in other Class. 
  
  2. Getters => Similarly these are also methods but These Getter methods return the Values of the Variables    
 
 */


//
public class EncapsulationDemoMain {

	
	
	public static void main(String args[]) {
		
		//Creating the object for Encapsulation class StudentVoteApplication
		StudentVoteApplication student =new StudentVoteApplication();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("You are name?:");
		
		String name =sc.nextLine();
		
	  System.out.println("You are age?:");
		
		int age =sc.nextInt();
		
		
		//Setting the Name and Age 
		student.setName(name);
		student.setAge(age);
		//System.out.println("Age is 12 ");
		//student.setAge(12);
		
		//Getter to get name and age
		System.out.println("You are :"+student.getName());
		
		if(age>=18) {
			System.out.println("You Age is :"+student.getAge());
		}else {
			System.out.println("Not eligible for Age :"+age);
		}
		
		
		sc.close();
		
		
	}
	
	
	
}
