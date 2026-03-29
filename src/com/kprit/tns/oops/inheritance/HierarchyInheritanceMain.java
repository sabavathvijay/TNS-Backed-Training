package com.kprit.tns.oops.inheritance;

public class HierarchyInheritanceMain {

	public static void main(String[] args) {
		//Creating Reference for Vehicle Class
		
		HierarchyInheritanceVehicle vehicle;
		
		//Creating instance for Bike class 
		vehicle = new HierarchyInheritanceBike();
		
		System.out.println("\nCalling Bike From Main Class:\n");
		vehicle.engine("350");
		vehicle.start();
		vehicle.stop();
		
		
		
		// Creating Instance for Car class 
        vehicle = new HierarchyInheritanceCar();
        
		System.out.println("\nCalling Car From Main Class:\n");
		vehicle.engine("Desile");
		vehicle.start();
		vehicle.stop();
		
		
	  	//creating Object for HierarchyInheritanceCar class to direcvtly call using method in it
				System.out.println("\nCalling Bike throgh  HierarchyInheritanceBike class Object :\n");
				HierarchyInheritanceCar car = new HierarchyInheritanceCar();
				car.car();

		//creating Object for HierarchyInheritanceBike class to direcvtly call using method in it
				System.out.println("\nCalling Bike throgh  HierarchyInheritanceBike class Object :\n");
				HierarchyInheritanceBike bike = new HierarchyInheritanceBike();
				bike.bike();
		
	}

}
