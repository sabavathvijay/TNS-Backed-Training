package com.kprit.tns.oops.polymorphism;

//Overloading the Methods 

public class MethodOverloading {
	
	//Here we are Overloading the same method " sum " but with different parameters
	
	//sum method of int with 2 parameters
	public void sum(int a,int b) {
		
	int sum;
	sum = a+b;
	
	System.out.println("The sum = "+ sum);
	
		
	}
	
	//sum method of int with 3 parameters
	public void sum(int a,int b ,int c) {
		
		int sum;
		sum = a+b+c;
		
		System.out.println("The sum = "+ sum);
		
			
		}
	
	//sum method of float with 2 parameters
	public void sum(float a,float b) {
		
		float sum;
		sum = a+b;
		
		System.out.println("The sum = "+ sum);
		
			
		}
	
	
	//sum method of float with 3 parameters
	public void sum(float a,float b,float c) {
		
		float sum;
		sum = a+b+c;
		
		System.out.println("The sum = "+ sum);
		
			
		}
	
	//sum method of double with 2 parameters
public void sum(double a,double b) {
		
		double sum;
		sum = a+b;
		
		System.out.println("The sum = "+ sum);
		
			
		}


//sum method of double with 3 parameters
public void sum(double a,double b,double c) {
	
	double sum;
	sum = a+b+c;
	
	System.out.println("The sum = "+ sum);
	
		
	}

}
