package com.kprit.tns.controlflowstatements;

//Decision Making Statements  ( Conditional Statements  )
/*
 There are mainly two types of Conditional Statements :
 1. if - else  => Based on condition Executes only one Statement block , either True Statement block  or False Statement block.
 	i) if 
   ii) if - else if 
  iii) if - else ( Nested )
 
 2. switch => Having multiple Cases and Matches the  Expression  that Satisfies the Case Value and executes that Statement block. -(Use default case and break keyword for  cases  )
 
 */

import java.util.Scanner;
public class ConditionalStatementsDemo {
	
	// If Condition statement
	
	void if_() {
		int a = 78;
		System.out.println("The if_ Method ");
		
		if (a>65) {
			System.out.println("This is the ' if ' Statement Block ");
			
		}
		
	}
	
	
	// If-else  Condition statement
	void if_else() {
		
		System.out.println("The if_else Method ");
		
		int a = 78;
		
		if (a>99) {
			System.out.println("This is the ' if ' Statement Block ");
			
		}
		else {
			System.out.println("This is the ' else' Statement Block ");
			
		}
		
	}
	
	

// else-If Condition statement
void else_if() {
	
	System.out.println("This is the else_if  Method ");
	
	int age = 12;
	
	if (age >= 13) {
		
		System.out.println(" You are Teenager ..! age > 12 ");
	}
	
	else if(age >= 18){
		
		System.out.println(" You are Adult ..! age  > 18 ");
	}
	
	else {
		System.out.println("You are a Child age < 12 ");
		
	}
	
}

// If-else Nested Condition statement
void if_else_Nested() {
	
	System.out.println("This is the if_else Method ");
	
	int age = 22;
	
	if (age >= 13) {
		
		if(age >= 18){
			System.out.println(" You are Adult ..! age  > 18 ");
		}
		else {
			System.out.println(" You are Teenager ..! age > 12 ");
		}
		
		
	}
	else {
		System.out.println("You are Child age < 12 ");
		
	}
	
}


//Switch Conditional Statement Method


void swith() {
	
	Scanner sc = new Scanner(System.in);
	
	
System.out.println("This is the Switch Method Block...!");

System.out.println("Enter What do you want to Enter(name ,age ,email) ..!");
String input =sc.nextLine();

switch (input) {

case "name":
	
	System.out.println("Enter your Name = ");
	String name =sc.nextLine(); 
	System.out.println("Your name is "+ name);
	break;

case "age":
	
	System.out.println("Enter your Name = ");
	String age =sc.nextLine(); 
	System.out.println("Your Age is "+ age);
	break;

case "email":
	
	System.out.println("Enter your Email = ");
	String email =sc.nextLine(); 
	System.out.println("Your email is "+ email);
	break;
	
default:
	
	System.out.println("Sorry, Invalid Choice");
	

}

	
	sc.close();
	
}


	
	
	
	

}
