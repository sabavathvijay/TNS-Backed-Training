package com.kprit.tns.oops.inheritance;


//This is the Bike class Inhetriting from Vehicle
public class HierarchyInheritanceBike extends HierarchyInheritanceVehicle {
	
public void bike() {
		
	System.out.println("\nThis is Bike");
		//Accessing the Vehicle class by creating instance for bike
		HierarchyInheritanceBike obj = new HierarchyInheritanceBike ();
		
		obj.engine("350 engine");
		obj.start();
		System.out.println("Running......");
		obj.stop();
		
	}

}
