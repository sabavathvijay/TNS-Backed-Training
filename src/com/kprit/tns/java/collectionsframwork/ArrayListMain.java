package com.kprit.tns.java.collectionsframwork;

import java.util.ArrayList;
import java.util.List;

/*
  
  ====> List can Allow Duplicates
 
 => The ArrayList is used when we need Fast Access to Elements by Index 
 
 
 
 ======================= Operations of List =============================
 
 		1) add(e)
 		2) remove(i)
 		3) isEmpty()
 		4) clear()
 		5) size()
 		6) contains()
 		7) addAll(list)
 		
 
 
 
 */

public class ArrayListMain {

	public static void main(String[] args) {
	
		
		
		// Creating a ArrayList Data-Structure  -> It is Dynamic , means size can change
		List <Integer> arrayList = new ArrayList<>();
		ArrayList<String> friends = new ArrayList<>();
		
		// Inserting elements into array
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		
		
		// Displaying  array
		System.out.println(arrayList + "\n\n");
		
		//Adding 
		//Names
		friends.add("Vijay");
		friends.add("Shiva");
		friends.add("Suman");
		friends.add("Pavan");
		friends.add("Vishnu");
		
		// Displaying  Names
				System.out.println(friends);
				
			// 1) add(e)
				friends.add("praveen");
				//friends.add("praveen");
				System.out.println(friends);
				
		 	// 2) remove(i)
				friends.remove(0);
				System.out.println(friends);
				
				
		 	// 3) isEmpty()
				System.out.println(friends.isEmpty());
				
		 	// 	5) size()
				System.out.println(friends.size());
				
		 	// 	6) contains()
				System.out.println(friends.contains("Vijay"));
				
				// 	4) clear()
				friends.clear();
				System.out.println(friends);
				
				
		

	}

}
