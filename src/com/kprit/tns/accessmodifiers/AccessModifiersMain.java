package com.kprit.tns.accessmodifiers;

public class AccessModifiersMain {
	
	
	public static void main(String args[]) {
		
	
	//Default
	AccessModifiersDemo ObjDefault =new AccessModifiersDemo();
	ObjDefault.printDefault();
	
	//public
		AccessModifierPublic ObjPublic = new AccessModifierPublic();
	ObjPublic.printPublic();
	//protected
		AccessModifierProtected ObjProtected =new AccessModifierProtected();
	ObjProtected.printProtected();
	//private
		//AccessModifierPrivate ObjPrivate =new AccessModifierPrivate();
	//ObjPrivate.Name("vijay");
	
	
	
	}	
}
