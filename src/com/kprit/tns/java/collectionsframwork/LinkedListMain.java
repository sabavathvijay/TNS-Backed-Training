package com.kprit.tns.java.collectionsframwork;

import java.util.LinkedList;
import java.util.List;

import com.kprit.tns.java.arrays.Fruit;

/*
 ====> LinkedList   
 -> The LinkedList is used when we need for  fast 		 i) Insertion 
 														 ii) Deletion 
 														 
 
 ======================= Operations of List =============================
 
 		1) add(e)
 		2) remove(i)
 		3) isEmpty()
 		4) clear()
 		5) size()
 		6) contains()
 		7) addAll(list)
 		8) get(i)
 		9) addAll(i,list)
 		
 		
 
 
 
 */
 														 
 

public class LinkedListMain {

	public static void main(String[] args) {
		
//LinkedList is uses two interfaces 1) List 2) Queues
		
		// Implementing LinkedList uses List Interface
		
		List<String> fruits = new LinkedList<>();
		List <String> fruit = new LinkedList<>();
		
		
		
		// 1) add(e)

		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("Grapes");
		
		//fruit.offer("A");
		
 		// 2) remove(i)
		
		fruits.remove(2);
		
 		// 3) isEmpty()
		System.out.println(fruits.isEmpty());
		
 		
 		// 5) size()
		System.out.println(fruits.size());
		
 		// 6) contains()
		System.out.println(fruits.contains("Apple"));
 		// 7) addAll(list)
		fruits.addAll(fruit);
		System.out.println(fruits);
		
		System.out.println(fruit.get(2));
	//	fruit.addAll(3,fruit);
		System.out.println(fruit);
		
		// 4) clear()
		fruit.clear();
		System.out.println(fruit);
		
		
		
		
		
		

	}

}
