package com.kprit.tns.oops.inheritance;

public class HybridInheritnaceMain {

	public static void main(String[] args) {
	
		
		//Creating Reference for parent class 
		MultiLevelInheritancePuppy  puppy;
		
		//Creating object for HybridInheritnaceDemo class to call Override methods only and we cannot also other method of HybridInheritnaceDemo class here
		puppy = new HybridInheritnaceDemo();
		
		puppy.myName("vijju ");
		
		
		//To Call other classes from HybridInheritnaceDemo we must Create Object for HybridInheritnaceDemo  first and then make Call
		HybridInheritnaceDemo demo = new HybridInheritnaceDemo();
		demo.printHybrid();
		

		
		//Reference for Hierarchy Class  the Parent class is HybridInheritnaceDemo..
		
		HybridInheritnaceDemo hierarchy;
		/*
		 To make call we can for Hierarchies inheritance, we must Override those methods otherwise
		 we cannot call Non-Override methods method using Reference of Parent class
		 => and to call those non-Override Methods we Must Create seperate Object and call to them
		 
		 => So , the Main Purpose of the Inheritance is to @Override the Methods of Parent and calling that Overridden methods using reference objects for that child classes..
		 */
		System.out.println("\n\nThe Hierarchy Methods \n\n");
		
		//Object for Child 1 class through Reference of parent class 
		hierarchy = new HybridInheritnaceHierarchy1();
		hierarchy.printHybrid();
		
		//=> And to call Non-Overrideden Methods we create Object for that class and then make Call
		HybridInheritnaceHierarchy1 obj1 = new HybridInheritnaceHierarchy1();
		obj1.printHybridInheritnaceHierarchy();
		
		System.out.println("\n\nThe Overridden in HybridInheritnaceHierarchy2's Method \n\n");
		//Object for Child  class through Reference of parent class
		hierarchy = new HybridInheritnaceHierarchy2();
		hierarchy.printHybrid();
		
		
		
		
		
 
		
		
		
		
		
	}

}
