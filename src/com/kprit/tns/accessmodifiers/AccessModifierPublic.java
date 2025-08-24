package com.kprit.tns.accessmodifiers;

import java.util.Scanner;

//This is to check the " public " Access modifier 

public class AccessModifierPublic {
	
	
	//instance variable
	public int instPublic ;
	
	public void printPublic() { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n Enter Num = " );
		
		if(sc.hasNext()) {
		instPublic =sc.nextInt();
		}else {
			System.out.println("NO int input");
		}
		System.out.println("This is Public Access Modifiers from AccessModifiersDemo class  printPublic method of ' com.kprit.tns.accessmodifiers ' package" );
		
		//Object for AccessModifierProtected class 
		AccessModifierProtected Obj = new AccessModifierProtected();
		Obj.printProtected();
		
		sc.close();
	}
	

}
