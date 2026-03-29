package com.kprit.tns.java.multithreading;

public class InterfaceThread1 implements Runnable{

	@Override
	public void run() {
		// Creating the Job
		
		for (int i=0; i<5;i++) {
			System.out.println("InterfaceThread1 :"+i);
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		
	}
	

}
