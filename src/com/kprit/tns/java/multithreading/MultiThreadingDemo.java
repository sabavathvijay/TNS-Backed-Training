package com.kprit.tns.java.multithreading;
//Multi-Tasking is of Two types 
// i) Multi-Tasking  -> Process based it is of Multiple programs < Executes multiple process's Single task  at a Time and other tasks of their will be  Waiting for their time to Execute,  we use CPU Maximum  >
// ii) Multi-Threading -> Thread based  it is of Single Program < Executes the Multiple Threads at a time without Depending on Each other  >


//The Multi-Threading  -> Thread is the Basic Unit Of CPU for Individual Execution
// Where as the 
/*
 The Multi-Threading means Executing multiple Threads in Single Program Simultaneously 
 => There are Two ways to Implement multi-threading in Java 
 1) By extending  "Thread" class
 2) By implementing "Runnable" Interface
 
 ======= Thread class ======
 
 => first we Extends the Thread class
 => Write Code in Thread's   " run() "  @Override method 
 => Then make call to Thread by  "start()" method in Main Thread called Main Method , upto this call Start() Main-thread is Single thread but when it makes call then there will be created Multiple-Threads
 => In every Java Program there one Thread Directly called by JVM that is Main Thread so, the  main method is a main thread in java that directly Executed by JVM 
 
 ====> WE can say that the code inside the Thread in run() method is also known as Job for that thread
 
 ======Note ======================
 
 ===> The Process will communicate with OS(Operating System) 
 ===> Where as the Thread is the Basic unit of CPU to Execute Individually
 ===> Every Process consist at-list One Thread 
 
 
 */

public class MultiThreadingDemo {
	
	public static void main(String args[])  throws Exception{
		
		
		
		

		
		//Starting the Second thread by calling Start() method 
		// First Create Object for new thread call
		
		Thread1 t1 = new Thread1();
		

		try {
		t1.start();
		}catch(Exception e) {
			
		}
		
		//Main thread 
		for(int i=0; i<9;i++) {
			System.out.println("This is Main Thread " + i);
			
			//This Sleep() method could exception 
			// here we can throw / Report to caller method but where as to @override method we have to Handle manually with Try-Catch
			
			Thread.sleep(1000);
		}
		
	
		
		//Calling the Thread2  which is the third  thread 
		
		//This third thread will be start from this line so, this thread will be included only when the main thread come and visit to it , until  this thread is not included
	
	//Object for Thread2 class
		
		Thread2 t2 = new Thread2();
		t2.start();
		
	}
	

}
