package com.kprit.tns.datatypes;

public class IdentifiersMain {

	public static void main(String[] args) {
		
		Identifiers Obj = new Identifiers();
		
		System.out.println(Obj.$money);
		System.out.println(Obj._char);
		System.out.println(Obj.name);
		System.out.println(Obj.studentId);
		
		
		Obj.Method();
		
		System.out.println(Obj);  // It gives String Representation of an Object ( default output of Object's method toString() ) with className @ Hash code
									// so ,We can @Override toString() method in class to get Readable output,
		
		
			
		}
		
	}


