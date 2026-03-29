package com.kprit.tns.oops.inheritance;


//In the Hierarchy Inheritance the child numbers is more to inherite from same parent
/*
1. parent
2. child-1
3. child-2
4. child-3 and can be more 


*/

public class HierarchyInheritanceVehicle {
	
	//Every vehicle will have Engine
	public void engine(String engine) {
		
		System.out.println("The Engine is : "+engine);
		
	}
	
	
	//Every vehicle Starts
public void start() {
	
	System.out.println("Vehicle is Started...");
}


//Every Vehicle will be  Stopped
public void  stop() {
	
	System.out.println("Vehicle is Stopped....");
	
}
	
	
	

}
