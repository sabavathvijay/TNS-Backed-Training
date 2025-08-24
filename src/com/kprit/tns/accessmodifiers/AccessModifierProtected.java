package com.kprit.tns.accessmodifiers;

import java.util.Scanner;

public class AccessModifierProtected {
	//instance variable public 
	
	public int instProtected;
	
	
	//Access modifier Protected
	protected void printProtected() { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n Enter num = " );
		if(sc.hasNext()) {
		instProtected =sc.nextInt();}
		System.out.println("This is Public Access Modifiers from AccessModifierProtected class printProtected method of ' com.kprit.tns.accessmodifiers ' package" );
		
		AccessModifiersDemo Demo = new AccessModifiersDemo();
		System.out.println("The public Valiable = " + Demo.instPublic );
		
		System.out.println("The public Method of other Class ");
		//Demo.printDefault();
		sc.close();
		
	}
	

}
