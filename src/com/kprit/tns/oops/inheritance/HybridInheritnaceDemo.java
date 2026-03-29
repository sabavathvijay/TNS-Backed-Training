package com.kprit.tns.oops.inheritance;

//The Hybrid Inheritance is that we can Implement the Multiple type Inheritance together
/*
 
 Here we can use Combination of 
 1. Single
 2. Multi-level
 3. Hierarchy 
 4. Multiple => (This is Possible Using Interface) 
 
 => In java we can not directly implement the multiple Inheritance 
    but we can Achieve this Multiple Inheritance Using Interfaces
    
    -> And the Interface  cannot allow to call method of it Directly but it allow us to create object for its implemented class and then we can make use .
    
    
   => So, the Hybrid Inheritance is Possible only Other than Multiple Inheritance  using class 
       but if we want to achieve Multiple inheritance too then we make Use of Interfaces...
    */

//Inheriting the Multi-level inheritance using " Extends MultiLevelInheritancePuppy " to achieve Hybrid Inheritance 
public class HybridInheritnaceDemo extends MultiLevelInheritancePuppy {
	
	String fromDemo="HybridInheritnaceDemo";
	public void printHybrid() {
		
		
		System.out.println("This is from Hybrid Inheritance That Inherites from Multi-Level Inheritance..");
		
		//calling the  ' from ' variable From MultiLevelInheritancePuppy class 
		System.out.println("This Data is from Multi-Level Inheritance Variable of 'MultiLevelInheritancePuppy' class : "+ fromPuppy);
		System.out.println("This Variable is from Its Own class : "+ fromDemo);
	}
	
	@Override
public void myName(String name) {
		
		
		System.out.println("This is from Hybrid Inheritance That Inherites from Multi-Level Inheritance..");
		
		//calling the  ' from ' variable From MultiLevelInheritancePuppy class 
		System.out.println("This Data is from Multi-Level Inheritance Variable of 'MultiLevelInheritancePuppy' class : "+ fromPuppy);
		System.out.println("This Variable is from Its Own class : "+ fromDemo+ "  \n "+ name);
	}
	
	
	
	

}
