package com.kprit.tns.oops.inheritance;

public class MultiLevelInheritanceMain {

	public static void main(String[] args) {
		// Instance for child class
		
		MultiLevelInheritancePuppy puppy = new MultiLevelInheritancePuppy();
		
		//calling parent , GrandParent and Puppy methods
		
		
		System.out.println("The Multi-Level Inheritance ");
		puppy.legs(4);
		puppy.sound("Bhoww");
		puppy.myName("Kala Sher");

	}

}
