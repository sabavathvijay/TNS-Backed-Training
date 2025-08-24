package tnsbackendtraining;

import com.kprit.tns.accessmodifiers.AccessModifierPublic;

public class TestAccessModifiers {

	public static void main(String[] args) {
		//Creating the Object for the Protected Method in Different Package 
		//but, accessing it  from its package public class as Subclasshere by creating Object for public class.  
		//Note: We can not access the Default class as this , that cannot Work.
		
		AccessModifierPublic Obj = new AccessModifierPublic();
		Obj.printPublic();
	}

}
