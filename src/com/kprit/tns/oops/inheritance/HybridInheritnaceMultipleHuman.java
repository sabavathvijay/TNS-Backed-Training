package com.kprit.tns.oops.inheritance;


//Implementing the HybridInheritnace with Multiple inheritance using Interfaces
public class HybridInheritnaceMultipleHuman  implements MultipleInheritanceInterfaceSwimmer ,MultipleInheritanceInterfaceWalker {

	@Override
	public void walk() {
		// Overriding the method of MultipleInheritanceInterfaceWalker Interface
	
		System.out.println("Yes, I can walk ");
		
	}

	@Override
	public void swim() {
		// Overriding the method of MultipleInheritanceInterfaceSwimmer
		System.out.println("Yes, I can Swim ");	
	}

	
	
}
