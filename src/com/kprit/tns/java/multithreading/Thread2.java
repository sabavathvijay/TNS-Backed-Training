package com.kprit.tns.java.multithreading;

public class Thread2 extends Thread{
	// Creating thread
	
	//Overriding the Thread's " run() " method to Implement Thread
	@Override
	public void run() {
		
		
		
		//Calling to thread  Thead1 Class in here in this thread 
		//Creating Object for class Threaad1
		Thread1 t1 = new Thread1();
		
		//Starting to thread in Thread1 class
		t1.start();
	
		
		for(int i=0;i<5;i++) {
		try {
			Thread.sleep(1000*2);
		}catch(Exception e) {
			
		}
		
		System.out.println("This is Thread 2");
		
		}
		
	
	
	}

}
