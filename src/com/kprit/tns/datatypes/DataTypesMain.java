package com.kprit.tns.datatypes;

public class DataTypesMain {

	public static void main(String[] args) {
		//Creating Reference for DataTypesDemo Class 
		
		DataTypesDemo Obj = new DataTypesDemo();  //This Object is Non-Primitive DataType
		
		
		
		
		System.out.println(Obj.value);
		System.out.println(Obj.value1);
		System.out.println(Obj.value2);
		System.out.println(Obj.value3);
		System.out.println(Obj.value4);
		System.out.println(Obj.value5);
		System.out.println(Obj.value6);
		System.out.println(Obj.value7);
		
		
		//Checking the Type of Object using Class name 
		
		if (Obj instanceof DataTypesDemo) {
		System.out.println("\n\n Yes");
		}
		
	
		//Checking type of Object using getClass and getName
		System.out.println(Obj.getClass().getName());
	}

}
