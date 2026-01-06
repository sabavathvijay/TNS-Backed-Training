package com.kprit.tns.java.collectionsframwork;

import java.util.List;
import java.util.Stack;

/*
 ==> The Stack is used for Last-in-fisrt Out  ( LIFO )
 
 ================== Operations ===============
 
 			1) push(e) -> add the Element at Top            |===========|
 			2 pop()  -> remove the Top element              | 			|
 			3 peek() -> Return the Top element				|===========|
 															|			|
 															|===========|
 															
 															

===> The Stack implements List that Follow LIFO approach 
 															
 															
 */

public class StackMain {

	public static void main(String[] args) {
		
		
		// Declaring Stack 
		Stack<Integer> stack = new Stack<>();
		
		// Pushing into Stack
		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.push(2);
		stack.push(11);
		stack.push(33);
		
		// Popping the Elements
		
		stack.pop();
		
		
		System.out.println(stack);
		
		//looking to Top of the Stack
		System.out.println(stack.peek());

	}

}
