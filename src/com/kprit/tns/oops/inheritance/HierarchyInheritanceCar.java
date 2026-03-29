package com.kprit.tns.oops.inheritance;

public class HierarchyInheritanceCar extends HierarchyInheritanceVehicle  {

	public void car() {
		
		System.out.println("\nThis is Car");
		//Accessing the Vehicle class by creating instance for Car
		HierarchyInheritanceCar obj = new HierarchyInheritanceCar ();
		
		obj.engine("petrol engine");
		obj.start();
		System.out.println("Running......");
		obj.stop();
		
	}
	
}
