package com.kprit.tns.datatypes;

public class TypeCastingMain {

	public static void main(String[] args) {
		
		
		TypeCastingDemo Obj = new TypeCastingDemo();
		
		Obj.primitiveTypecasting();
		
		
		//Object TypeCasting Objects
		
		//SuperClass
		ObjectTypeCasting_Animal _Obj = new ObjectTypeCasting_Animal();
				//Subclasses
				Dog dog = new Dog();
		
				Cat cat = new Cat();
		
		//Implicit  : By creating Object for Child class
				System.out.println("This is Implicit Object TypeCasting");
				
		ObjectTypeCasting_Animal myDog = new Dog();
		myDog.sound();
		
		//Explicit
		Dog ourDog = (Dog)myDog;
		
		//Fails at Runtime 
		  //Dog yourDog = (cat)myDog;
 
		//We use instanceof Operator for Explicit Object TypeCasting tover come Failure  at Runtime 
		
		if (myDog instanceof Dog) {
			Dog _ourDog = (Dog)myDog;
		}
		else {
			System.out.println(" Cannot Cast myDog ");
		}
		
		ourDog.sound();
		
		
	}

}
