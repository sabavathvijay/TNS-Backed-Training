package com.kprit.tns.java.arrays;
//This Custom Array 

public class Student {
	
	//Student Data 
	String name;
	int sId;
	
	
	//Constructor of Different Data type 
	  
	public Student(String name,int id) {
		 
		this.name = name;
		this.sId = id;
		
		//System.out.println(this.sId + " " + this.name);
		
	}
	 
	 // Overriding toString() method 
	 @Override
	/* public String toString() {
		
		return   "Student{"+ "name="+ name +", sId="+ sId +"}";
		 
	 }
	 */
	public String toString() {
		return "Studen[name='"+name+"', sID="+sId+"]";
		 
		 
	 }
	
	
	
	
	
	

}
