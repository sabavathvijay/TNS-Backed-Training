package com.kprit.tns.datatypes;


//parent class  (SuperClass)
public class ObjectTypeCasting_Animal {
	
	
	void sound()
	{
		System.out.println("Animal makes Sound");
		
	}

	
	
}

//In every java file we can Create only One Public class
 
class Dog extends ObjectTypeCasting_Animal{

	void sound() {
		System.out.println("Dog can make Sound");	
	}
	
	
}

class Cat extends ObjectTypeCasting_Animal{

	void sound() {
		System.out.println("Cat can also make Sound");	
	}
	
}