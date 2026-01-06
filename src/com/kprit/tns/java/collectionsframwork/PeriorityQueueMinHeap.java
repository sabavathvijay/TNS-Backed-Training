package com.kprit.tns.java.collectionsframwork;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 ==> The PriorityQueue Implements the Queue so, It can Use the Method/Operations of Queue
 
 ==========================> This will follow the Ordering from Minimum to max
  
 						1) offer(e) => The append at end
 						2) peek()  =>  Returns and Display minimum element
 						3 poll()   => returns and Remove minimum element
  
 
 
 
 */
public class PeriorityQueueMinHeap {

	public static void main(String[] args) {
	
		
		Queue<Integer> pq = new PriorityQueue<>();
		Queue<String> pqs = new PriorityQueue<>();
		
		pq.offer(91);
		pq.offer(3);
		pq.offer(5);
		pq.offer(7);
		
		System.out.println(pq);
		
		pqs.offer("Naveen");
		pqs.offer("Loves");
		pqs.offer("Chithra");
		pqs.offer("Ammu");
		
		System.out.println(pqs);

	}

}
