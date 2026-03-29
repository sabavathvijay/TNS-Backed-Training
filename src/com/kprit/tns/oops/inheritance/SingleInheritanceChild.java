package com.kprit.tns.oops.inheritance;


//Inheriting from SingleInheritanceParent class using " extends "
public class SingleInheritanceChild  extends SingleInheritanceParent{
	
	String shoppingMall ="V-Mall";
	
	
	void myProperties() {
		
		
		 System.out.println("I'm Child and My properties are : ");
		//accessing the land Variables of SingleInheritanceParent class in here
        System.out.println(land +"  lands");
        System.out.println(house +"  House");
        System.out.println(shoppingMall +"  Shopping Mall");
        
        


	}
	
	@Override
	public void iAm() {
		System.out.println("I'm Child  @Overridden");
	}
	
	
	
	

}
