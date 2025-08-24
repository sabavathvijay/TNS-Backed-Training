package com.kprit.tns.accessmodifiers;

import java.util.Scanner;

//This is to check the " private " Access modifier 
//The Class can be only  Default or public but in Nested it can be Use all 4 Access modifiers  
public class AccessModifierPrivate {

  private	int age ;
  
  private String  name ;
  
  //Protected
  protected void printName(String name) { 
	  
	  this.name =name;
	      
	  System.out.println(name);
	  
  }
  
  //Private 
   private void printAge(int age){
	  this.age = ++age;
	 // System.out.println(age);
	  System.out.println("The instance variable Age  on ++age = \n Next Year is "+age);
  }
  
   
  static void callPrivateMethod() {
	  AccessModifierPrivate Obj = new AccessModifierPrivate();
	  Scanner sc =new Scanner(System.in);
	  int  Age;
	  String Name;
	
	 
	  
	  
	//calling printName() method 
	  System.out.println("Enter Name =");
	 // Scanner sc =new Scanner(System.in);
	  Obj.name=sc.nextLine() ;
	  Name=Obj.name;
	 
	  //calling printAge() method 
	  System.out.println("Enter age =");
	  Obj.age=sc.nextInt() ;
	    Age= Obj.age;
	   
	  
	  
	  Obj.printName(Name);
	  
	  Obj.printAge(Age);
	  sc.close();
	  
	  
	  
  }
  
  public static void main(String args[]) {
	  
	 AccessModifierPrivate Obj = new AccessModifierPrivate();
	  callPrivateMethod();
	  System.out.println("By calling Object directly, it gives Hash-Value   : "+Obj);
	  System.out.println("\nTo Display String value  we have to Overrived the 'toString() ' method   ");
	  
  }
  
	
}
