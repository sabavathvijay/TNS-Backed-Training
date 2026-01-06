package com.kprit.tns.java.collectionsframwork;

import java.util.HashSet;
import java.util.Set;

/*
 ==> The HashSet is implementation of Set , Where it doesn't allow Duplicates
 
 ====== HashStack ================
 ==> The HashStack  is used , when there is need for not to allow Duplicates , and preferring for  Order
 
 
 */

public class HashSetMain {

	public static void main(String[] args) {
		
		// Declaring the Set using HashSet
		Set<Integer> set = new HashSet<>();
		
		set.add(2);
		set.add(4);
		set.add(6);
		set.add(2);
		
		System.out.println(set);
		
		
		//  size
		
		System.out.println("Size of Set is = "+ set.size());
		
		// remove
		set.remove(2);
		System.out.println(set);
		
		//isEmpty
		
		System.out.println(set.isEmpty());
		
		//Contains
		
		System.out.println(set.contains(6));
		
		//clear
		set.clear();
		System.out.println(set);
		
		
		

	}

}
