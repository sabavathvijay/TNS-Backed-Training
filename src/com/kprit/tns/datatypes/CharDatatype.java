package com.kprit.tns.datatypes;
//Char DataType in Java 
/*
 Char is a Primitive type and Stores a Single 16 bit Unicode character  within single quotes [ ' ' ] 
 -> It is a Integer type so , we can Store Integer value that having Unicode point => [(A = 65), (a = 97)]
 

 

 
 
 */
//Importing Scanner Class from Util Package 
import java.util.Scanner;

public class CharDatatype {
	
	
	//Basic Char Declarations
	
	void CharDeclaration() {
		//char variables
		
		char letter = 'A';
		
		//char using Unicode value
		char unicodevalue = 97;
		
		System.out.println("\n\nThe Char variable " + letter +"\n"
				+"The char Variable using Unicode value of 97 = " +unicodevalue);
		
	}
	
	//Arithmetic with Char
	
	void arithmetic_with_char() {
		char ch1 = 'A';
		char ch2 = (char)(ch1+1);
		char ch3 = (char)(ch2+3);
		char ch4 = (char)(ch3+5);
		System.out.println("\n\nArithmetic with Char :");
		System.out.println("The char1 = "+ ch1);
		System.out.println("The char2 = "+ch2);
		System.out.println("The char3 = "+ch3);
		System.out.println("The char4 = "+ch4);
		
		
	
	}
	
	//Iterating with Char in Loop
	
	void CharLoop() {
		
		//Capital Alphabet
		System.out.println("Capital Alphabet :");
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.print(ch +"\t");
			if(ch == 72 || ch == 79 || ch == 85 ) {
				System.out.println();
			}
		}
		
		
		// Small alphabet
		System.out.println("\n\n");
		System.out.println("Small Alphabet :");
		for(char ch= 'a'; ch<='z';ch++) {
			System.out.print(ch +"\t");
			
			if(ch == 'm' ) {
				System.out.println();
		}
			
		}
	}
	
	//Char check with Conditional Logics
	
	void CharCheckConditions() {
		System.out.println("\n\nChar check with Conditional Logics:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Char = ");
		
		char ch =sc.next().charAt(0);
		
		//Checking for LowerCase 
		
		if (ch>='a' && ch<='z') {
			System.out.println("The Charecter is lowercase = " + ch);
		}
		
		//checking UpperCase
		else if(ch >='A' && ch<='Z') {
			System.out.println("The Charecter is Uppercase = " + ch);
		}
		
		else {
			System.out.println("This is Special Charecter  = " + ch);
		}
		
		
		sc.close(); //Closing the Scanner object for Resource leak
	}
	

}
