package com.kprit.tns.oops.abstraction;

public class AbstractionMain {

	public static void main(String[] args) {
		
		//we cannot creat Object directly to the Abstract class
		//    AbstractionDemoShape shape = new AbstractionDemoShape();
		
		
		//Reference for class  Abstract class
		AbstractionDemoShape shape;
		
		//Object/ Instance for the Inherited class from Abstract class by using Reference 
		
		shape = new AbstractionCircle();
		
		shape.display();
		shape.draw();
		
		
		

	}

}
