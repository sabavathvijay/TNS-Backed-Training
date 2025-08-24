package com.kprit.tns.accessmodifiers;
//There are 4 types of Access modifiers in java
/*
//We use these keywords
1. public => Can be Accessible everywhere i) within class ,ii) other class, iii) Other packages

2. protected => Can accessible only within its own Package and all its Subclass including  subclass are in Different packages can access 

3. private => Can be accessible only within the same class even  cannot accessed outside the Class 

4. default(NO-keyword) => Can be accessible within the same package only

*/

import java.util.*;

//This is to check the " private " Access modifier 

//This is Default Access modifier with No keyword
//default access modifier class
class AccessModifiersDemo {
	
	
	//default access modifier variable
	//instance variable
	 int instPublic ;
	 
	//default access modifier method
	 void printDefault() { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n Enter num = " );
		instPublic =sc.nextInt();
		System.out.println("This is default Access Modifiers from AccessModifiersDemo class  printdefault method of ' com.kprit.tns.accessmodifiers ' package" );
		
		//sc.close();
	}
	
	
	
	

}
