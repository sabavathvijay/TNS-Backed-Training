package com.kprit.tns.java.arrays;


//Demo for Arrays
/*
Array is a DataStructure that Store the Homogineous type of Data
=> Array is Fixed size 
=> Array is Contiguous Memory Allocation
There are types of arrays => Single-Dimensional array ,2) Multi-Dimensional array 

And also we have " Custom Array " 
=> Here we can insert different types of Data types in single Object address 


*/



public class ArrayDeclareInitialize {
	
	
	//Array is an INDEX based
	//We can declare arrays in many ways 

	public static void main( String[] args) {
	
//Arrays Declarations for 1-D
	
	//The Array Declarations : Creates Variable to Reference Array
	      // 1)int[] ages ;  2) String names[]; 3)double []salary;
			
 		
	int[] number;  //Preferred One 
	String[]  name; 
	
	
// The Array Initializations can with Size and with elements : Allocating memory and array cannot be used without initialized

	// 1) int[] array = new int[5]; => Know size but don't  know Values
	//and 2)int array[] = {1,2,3}; => Know size and Values 
	
	int[] numbers = {1,2,3,4,5};
	String[] pets= new String[2];
	
	pets[0] ="Dog";
	pets[1] = "Cat";
	
	//Accessing the Array : Using single index value
	System.out.println("Accessing the  Array With Index ");
	System.out.println(pets[0]);
	System.out.println(numbers[3]);
	
	//All at once Using Iterations
	//Normal for loop
	System.out.print("Accessing the  Array - Normal for loop :\n ");
	for(int index =0; index < numbers.length; index++) {
		
		System.out.print(index+ " ");
	}
	//using Enhanced for loop
	System.out.println("\nAccessing the  Array - Enhanced for loop : ");
	for(String pet:pets) {
		System.out.println(pet);
	}
	
	
	
	
	//2-D Arrays Declarations and Initialization: Ueses two Square bracket " [][] "
	
	//Declaration
	int[][] matrix;
	
    //Initializations
	//Setting rows and Columns sizes
	matrix = new int[2][2];
	matrix[0][0]= 2;
	matrix[0][1]= 3;
	matrix[1][0]= 4;
	matrix[1][1]= 5;
	
	//Directly With values
	String[][] Animals = {{"Dog","Cat"},{"cow","Goat"}};
	
	
	//Accessing the 2D Array : Using Iterations by two indexes row and column
	//Normal for loop
	
	System.out.println("Accessing the 2D Array - Normal for loop :");
	for(int row=0;row < matrix.length;row++ ) {
		for(int col=0;col < matrix[row].length; col++) {
			
			System.out.print(matrix[row][col] +" ");
		}
		System.out.println();
	}
	
	System.out.println("Accessing the 2D Array - Enhanced  for loop : ");
	
	//Reduce the Dimension of Array from 2D to 1D
	
	for(String[] animals:Animals) {
		
		//Directly storing Values into variable 
		for(String animal:animals ) {
			
			//Printing the Direct Value for each Iteration
			System.out.print(animal +"  ");
		}
		
		System.out.println();
	}
	
	
	
	
	}

}


