package www.kprit.tns.operators;

public class OperatorsMain {

	public static void main(String[] args) {
		
		OperatorsDemo Obj = new OperatorsDemo();
		
		Obj.arithmetic();
		System.out.println();
		//Static method accessing using Class name 
		OperatorsDemo.arithmetic();
		System.out.println();
		Obj.assignment();

		System.out.println();
		Obj.relational();

		System.out.println();
		Obj.logical();
		
		System.out.println();
		Obj.bitwise();

		System.out.println();
		Obj.ternary();

		System.out.println();
		Obj.unaryIncrement();

		System.out.println();
		Obj.unaryDecrement();


		System.out.println();
		Obj.instance_of();
		
		
	}

}
