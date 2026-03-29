package com.kprit.tns.oops.encapsulation;


//Encapsulation for Student Data
public class StudentVoteApplication {
	
	//Name variable 
	private String name;
	
	//Age variable
	private int age;
	
	//Public Setters and Getters to access from Everywhere
	//Setter methods to set the value to the Variables 

	//name setter method
	public void setName(String name) {
		// "this" keyword refers to current Object
		this.name= name;
		
	}
	//age setter method
		public void setAge(int age) {
			// "this" keyword refers to current Object
			if(age>=18) {
				this.age =age;
			}else {
				System.out.println("Not eligible..!\nYou can't Apply for Vote \n\n");
			}
			
			
		}
		
		
		//Getter methods to Get the value of the Variables 
		
		//Getter method to Get the Name
		public String getName() {
			return this.name;
		}
	//Getter method to get Age
		public int getAge() {
			
			
			return this.age;
		}
	

}
