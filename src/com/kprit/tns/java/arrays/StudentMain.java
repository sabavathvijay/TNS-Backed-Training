package com.kprit.tns.java.arrays;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		
		
		System.out.println("This is Custom Array");
		//Arguments of Name and Id
		
			//	CustomArrayStudent student =new  CustomArrayStudent("Vijay",101);
				
		
		//Converting the CustomArrayStudent class into Array
				Student[] students = new Student[2];
				
				//creating an Object for student of array index 0 from Array student .
				students[0] = new Student("Vijay",101);
				
				//creating an Object for student of array index 1 from Array student .
				students[1] = new Student("Shiva",102);
				
				
				
				
				System.out.println(students[0]);
				System.out.println(students[1]);
				
				StudentMain obj =new StudentMain();
				obj.studentData();
				
				
				
			
				

	}
	
	
	//Students
	
	public void studentData() {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		//Array of size 4
		Student[] student = new Student[4];
		
		for(int i=0; i<student.length;i++) {
			String name;
			int sid;
			
			System.out.println("Enter name = ");      // ?????????
			name = sc.nextLine();
			
			System.out.println("Enter sid = ");
			sid =sc.nextInt();
			
			//Initializing 
			student[i] = new Student(name ,sid);
			
			System.out.println("Inserted");
		}
		
		
		/*
		 int i=0; 
				while(i<student.length) {
			String name;
			int sid;
			
			System.out.println("Enter name = ");
			name = sc.nextLine();
			
			System.out.println("Enter sid = ");
			sid =sc.nextInt();
			
			//Initializing 
			student[i] = new Student(name ,sid);
			
			System.out.println("Inserted");
			i++;
		}
		 */
		
		
		
		
	}
	

}
