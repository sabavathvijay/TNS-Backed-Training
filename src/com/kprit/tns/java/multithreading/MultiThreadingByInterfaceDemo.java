package com.kprit.tns.java.multithreading;

//Thread Implementation by Interface
/*
 We can create Thread by Implementing "Runnable" interface
 ==> In Runnable interface there is only one Method that is "run()"
 
 => The first step to create thread is 1. Define the Thread 
 
 ===> Steps to Define thread
 
 1. Create a class that implements the "Runnable" interface
 2. @Override the run() method of Runnable interface 
 3. Define the Job that we want to assign to this Thread
 
  ===> Steps to Start the Thread in Main thread
  
  1. First create  an Object/reference to the Class that we Implemented thread using "Runnable" Interface
  2. Then Create an Instance/Object for Thread class ->(Bcz the we want to start() the Thread in run() method )  
  3. After we Pass the reference of class that we implemented run() from Runnable to Thread().
  4. And now we can start() the Thread with Thread Object 
 
 
 
 */

public class MultiThreadingByInterfaceDemo {

	public static void main(String[] args) throws Exception {
		
		
		// Creating Reference for class that Implemented Runnable Interface for Thread
		InterfaceThread1 r =new InterfaceThread1();   // 
		
		//Creating Object for Thread class to Start the Thread
		//And Passing the Reference of Thread class that we Implemented for run() method
		Thread t = new Thread(r); //======Upto here this program has Single Thread
		
		//Starting the Thread by Thread class Object 
		t.start();              // But From this Line the Program contains Two Threads
		
		//Main thread 
		for(int i=0; i<5;i++) {
			System.out.println("This is Main Thread " + i);
			
			//This Sleep() method could exception 
			// here we can throw / Report to caller method but where as to @override method we have to Handle manually with Try-Catch
		
			//Exception Occurs so, Throw the Exception to JVM at Method Signature
			
			Thread.sleep(1050);
		}
		

		
	}

}
