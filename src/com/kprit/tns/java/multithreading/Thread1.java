package com.kprit.tns.java.multithreading;

//The Override method cannot throws/Report the exception to the parent method
// So, we have to Handle Exception manually using Try-Catch  blocks


//This is a New Thread Executes Separately and Simultaneously
public class Thread1 extends Thread{
	
	@Override 
	public void run(){
		//Creates New Thread 
		
		// Printing thread count
		for(int i=0; i<6;i++) {
			
			System.out.println("Thread1 :" +i);
			
			//Take time So, exception occurs 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			}
			
		}
		
		
		
	}

}
