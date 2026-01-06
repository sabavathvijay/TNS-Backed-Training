package com.kprit.tns.java.collectionsframwork;

import java.util.LinkedList;
import java.util.Queue;

/*
 
 The LinkedList can be Implemented using Queue
 
 
 ===> So ,here also  we can have all operations for LinkedList as in the List 
 
  
  ===================  Operations =========================
  
  			1) offer(e)
  			2) peek()
  			3) poll()
  			
 
  
 
 
 */


public class QueueLinkedList {

	public static void main(String[] args) {
		
		
		// LinkedList Declaration using Queue
		
		Queue<Integer> linkedList = new LinkedList<>();
		
		// Inserting the Elements 
		
		linkedList.add(2);
		linkedList.add(12);
		linkedList.add(22);
		linkedList.add(32);
		
		
		
		
		System.out.println(linkedList);
		
		// Inserting using Queue Method 
		linkedList.offer(7);
		linkedList.offer(17);
		linkedList.offer(27);
		linkedList.offer(37);
		
		System.out.println(linkedList);
		
		
		
		
		// Looking at the Head element 
		
		System.out.println(linkedList.peek());
		
		// Returning and Removing the Head Element (First)
		System.out.println(linkedList.poll());
		
		System.out.println(linkedList);
		
		
		
		// Removing the Element directly 
				System.out.println(linkedList.remove(7));
				
		// Removing the Element directly and return boolean
				System.out.println(linkedList);
				
				linkedList.clear();
				//Looking at the Head element
				
				System.out.println(linkedList.isEmpty() + " Empty");
				
	// Without Exception 
				System.out.println(linkedList.peek());
				
				// With Exception if there is No Elements
				/*
				  
			
			
			   System.out.println(linkedList.element());	
				
				System.out.println(linkedList.remove());
				
				
				
				*/
				
				System.out.println(linkedList.peek());

	}

}
