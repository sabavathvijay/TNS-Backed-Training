package com.kprit.tns.controlflowstatements;

import java.util.Scanner;

//The Looping Statements ( Iterative Statements ):
/*
 The Looping Statements are used use execute a Block of code Repeatedly
 There are 3 types of Loppng (Iterative) statements:
 1. for -loop => When we know the no.of Iterations
 2. while -loop => When we don't know the no.of Iteration and it will iterates as long the Condition is 'True'. 
 3. do-pwhile -loop => When we want to Execute code block at list Once before condition Checks.
 
 ==We can use Iteration as Nested too ..! =>  Loops inside Loop.
 

 */

public class IterativeStatements {
	
	//This is Iterative Statement of " for " 
	void for_loop() {
		System.out.println(" This is for_loop Method \n ");
		System.out.println("The Even and Odd numbers b/w 20 :");
		for(int i=0;i <= 20;i++) {
			
			if(i % 2 == 0) {
				System.out.println(i + " Even ");
			}
			else {
				System.out.println(i + " Odd ");
			}
			
		}
	
	}
	
	//This is Iterative Statement of " while  " 
	void while_loop() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" This is for_loop Method \n ");
		
	int num = 5;
	int guess = 0;
	System.out.println("Welcome lets Play a Number Guessing Game.!");
		while(num != guess) {
			
			System.out.println("Guess my number =");
			guess = sc.nextInt();

			
			if(guess<num) {
				System.out.println("guess is small...!");
			}else if(guess >num) {
				System.out.println("\nGuess is greater.!");
			}
			
		
		
	}
		System.out.println("Congrates");
		sc.close();
	}
	
	
	
	
	
}
