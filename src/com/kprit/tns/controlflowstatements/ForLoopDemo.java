package com.kprit.tns.controlflowstatements;

public class ForLoopDemo {


	//This is Iterative Statement of " for " 
	void for_loop() {
		System.out.println(" This is for_loop Method \n ");
		System.out.println("The Even and Odd numbers b/w 20 :");
		for(int i=0;i <= 20;i++) {
			
			if(i % 2 == 0) {
				System.out.println(i + " Even ");
			}
			else {
				System.out.println(i + " Odd ");
			}
			
		}
	
	}
}
