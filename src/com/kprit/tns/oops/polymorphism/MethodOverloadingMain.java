package com.kprit.tns.oops.polymorphism;
/*
  It is program of Method Overloading 
 calling Respective Methods of MethodOverloading from here in Main method .
 
 => You can Do Sum for 2 numbers or 3 numbers
 => It allows three types of Number Sum 
 		1. Integers
 		2. Floats
 		3. Doubles
 		
 	so, You just Select the Type you want  and it will call that particular Sum() method of related parameters you Selected	
 
 
 */
import java.util.Scanner;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		
		
		methodMain();
		
	}
	
	//Seperate method  for MethodOverloading
	
		static void methodMain() {
		// Object for the MethodOverloading class
		MethodOverloading overloading = new MethodOverloading();

		Scanner sc = new Scanner(System.in);
		
		//Asking for "Sum" for How many numbers
		System.out.println("Sum of how many Numbers ! \n(2 or 3) ? ");
		int n = sc.nextInt();
		
		
		// Two number " SUM "

		// String Type="yes";
		int type;

		if (n == 2) {

			// Asking Type
			System.out.println("Is it Integer=1,Float =2 ,Double=3 ");
			type = sc.nextInt();

			
			//Iinteger
			
			if (type == 1) {

				System.out.println("Enter 1st num =  ");

				int a = sc.nextInt();
				System.out.println("Enter 2st num =  ");

				int b = sc.nextInt();

				overloading.sum(a, b);

			} else if (type == 2) {

				// float
				
				if (n == 2) {

					System.out.println("Enter 1st num =  ");

					float a = sc.nextFloat();
					System.out.println("Enter 2st num =  ");

					float b = sc.nextFloat();

					overloading.sum(a, b);
				}

				// Double
				if (type == 3) {

					System.out.println("Enter 1st num =  ");

					double a = sc.nextDouble();

					System.out.println("Enter 2st num =  ");
					double b = sc.nextDouble();

					overloading.sum(a, b);

				}
			}

		}

		
		
		// Three number " SUM "
		else if (n == 3) {
			// Asking Type
			System.out.println("Is it Integer=1,Float =2 ,Double=3 ");
			type = sc.nextInt();
			// Integer

			if (type == 1) {
				System.out.println("Enter 1st num =  ");

				int a = sc.nextInt();
				System.out.println("Enter 2st num =  ");

				int b = sc.nextInt();
				System.out.println("Enter 3srd num =  ");

				int c = sc.nextInt();

				overloading.sum(a, b, c);

			}

			// float

			else if (type == 2) {
				System.out.println("Enter 1st num =  ");

				float a = sc.nextFloat();
				System.out.println("Enter 2st num =  ");

				float b = sc.nextFloat();
				System.out.println("Enter 3srd num =  ");

				float c = sc.nextFloat();

				overloading.sum(a, b, c);

			}

			// Double

			if (type == 3) {

				System.out.println("Enter 1st num =  ");

				double a = sc.nextDouble();
				System.out.println("Enter 2st num =  ");

				double b = sc.nextDouble();
				System.out.println("Enter 3srd num =  ");

				double c = sc.nextDouble();

				overloading.sum(a, b, c);

			}

		}
	
	
	//Closing the Resources for Scanner class
	sc.close();
	
	
	}
}
