package com.kprit.tns.oops.inheritance;

//Implementing Hybrid-Inheritance for Hierarchy and we use same MultiLevelInheritancePuppy Class to Implement 
public class HybridInheritnaceHierarchy1  extends HybridInheritnaceDemo {
	
	String fromHybrid ="HybridInheritnaceHierarchy";
	public void printHybridInheritnaceHierarchy() {
		
		//calling the  ' from ' veriable From HybridInheritnaceDemo class 
		System.out.println("This Data is from HybridInheritnaceDemo Through HybridInheritnaceHierarchy class  and Variable of HybridInheritnaceDemo class : "+fromDemo);
	
		System.out.println("This Data is from Multi-Level Inheritance Variable of 'MultiLevelInheritancePuppy' class : "+ fromPuppy);
		System.out.println("This Data is from HybridInheritnaceDemoclass  Inherites Variable from class : "+ fromDemo);
	
		System.out.println("This Variable is from Its Own class : "+ fromHybrid);
		
		
	}
	
	@Override
	public void printHybrid() {
		System.out.println("Overriden method 'printHybrid()'  in  HybridInheritnaceHierarchy1  class;  ");
	}

	
}
