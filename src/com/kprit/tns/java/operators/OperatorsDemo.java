package com.kprit.tns.java.operators;

//Demo for Operators in Java 
/*
 There some Operators in Jave (Operators are Symbols to Perform Operation On Operand/ Variables )
 1. Arithmetic => [+ , - , * , / , %] 
 2. Assignmant => [= , += , -= , *= , /= , %= ]
 3. Relational(Comparison) => [== , != , < , > , <= , >=]
 4. Logical => [&& , || , !]
 5. Bitwise => [& , | , ^ , ~ , << , >> , >>>]
 6. Ternary => [(Condition) ? True : False ]
 7. Unary => [ a++ , ++a , a-- , --a ]
 8. Instanceof => [ <object>  instanceof <Class> ] - (Checks Instance of class returns Boolean Value)
 
 
 
 */

public class OperatorsDemo {
	
	//Operands 
	public int a =5;
	public int b =7;
	//Arithmetic Operations methd
	public static void arithmetic() {
		
		//In static Method , we cannot called Instance Variable Directly ,So, we create Object first
		OperatorsDemo obj = new OperatorsDemo();
		
	System.out.println("These are Arithmetic Operations :");
	System.out.println("The values a= "+obj.a + "and  b=" + obj.b );
	//Add
	int sum = obj.a + obj.b;
	System.out.println("Sum = "+sum);
	//Sub
	int sub = obj.a - obj.b;
	System.out.println("Sub = "+sub);
	//Multiplication
	int mult = obj.a * obj.b;
	System.out.println("Multiplication = "+mult);
	//Division
	int div = obj.a / obj.b;
	System.out.println("Division = "+div);
	//Reminder
	int rem = obj.a % obj.b;
	
	
	}
	
	//Assignment Operators Method
	public static void assignment() {
		
		
		//In static Method , we cannot called Instance Variable Directly ,So, we create Object first
				OperatorsDemo obj = new OperatorsDemo();
		System.out.println("These are Assignment Operations :");
		// = operator
		
		int x = obj.a;
		System.out.println("  = operator " + x);
		// += operator
		  x += 5;
		  System.out.println("  += operator " + x);
		// -= operator
		 x -=obj.a;
		 System.out.println("  -= operator " + x);
		// *= operator
		 x *=obj.a;	
		 System.out.println("  *= operator " + x);
		// /= operator
		 x /=obj.a;	
		 System.out.println("  /= operator " + x);
		// %= operator
		x %=obj.a;
		System.out.println("  %= operator " + x);
		
		
	}
	
	//Relational Operator Method
	void relational() {
		
		
		//The Relational Operations always returns only boolean Values (true or false):
		
		//Local Variables
		int a = 9;
		int b = 8;
		
		System.out.println("These are Relational Operations :" + "a = "+a +" b = "+ b);
		
		System.out.println(" == "+ (a==b));
		System.out.println(" != "+ (a!=b));
		System.out.println(" < "+(a<b));
		System.out.println(" > "+(a > b));
		System.out.println(" <= "+ (a <= b));
		System.out.println(" >= "+(a >= b));
		
		
	}
	
	//Logical Operator Method 
	
	void logical()
	{
		// The Logical Operator are performed on the 2  Expresions(Conditions)
		
		int a = 5, b= 6,c= 2 ;
		System.out.println("These are Logical Operations :" + "a = "+a +" b = "+ b +" c = "+ c);
		// AND ( && ) Operation
		System.out.println(" (a>b) && (a>c)   = " + (  (a>b) && (a>c)  ) );
		System.out.println(" (a<b) && (a>c)   = " + (  (a<b) && (a>c)  ) );
		// OR( || ) Operation
		System.out.println(" (a>b) || (a>c)   = " + (  (a>b) || (a>c)  ) );
		System.out.println(" (a<b) || (a>c)   = " + (  (a>b) || (a<c)  ) );
		
		// NOT ( ! ) Operation
		System.out.println(" !((a>b) || (a>c))   = " + (  !((a>b) || (a>c))  ) );
		System.out.println(" !((a>b) || (a<c))   = " + (  !((a>b) || (a<c))  ) );
		
		
		
		
	}
	
	
	//BitWise  Operator Method 
	
	void bitwise() {
		
		//The Bitwise Operators are Used  to perform the Bits Manipulations (1's and 0's) on Individual bit of the Integer data types .
		//Operator Compares the corresponding bits of Operands
		
		System.out.println("These are Bitwise Operations :");
		
		//Local Variables
		int x =5;
		int  y =4;
		
		//Bitwise AND ( & ) :
		// [Both bits must be '1' then it becomes 1  else 0 ]
		System.out.println(" x & y =  " + (x&y) );
		
		//Bitwise OR ( | ) :
		// [At list one  bit should be '1'  then it becomes 1  else 0   ]
		System.out.println(" x | y =  " + (x|y) );
		
		//Bitwise XOR ( ^ ) :
		// [Both bits must be different then it becomes 1  else 0 ]
		System.out.println(" x ^ y =  " + (x ^ y) );
		//It is Unary Operator ,it  performs 2's complement =  -(x + 1)
		//Bitwise Complement ( ~ ) :
		System.out.println(" ~ y =  " + ( ~y) );
		
		//Bitwise Signed Left Shift ( << ) :
		// It shifts the n bits form left  to  right and fills with 0's  , it keeps sign bit as it is .
		System.out.println(" x =  "+ x +" and  x << 2  = " + (x << 2) );
		
		//Bitwise Signed Right Shift ( >> ) :
		// It shifts the n bits form right to  left and fills with 0's , it keeps sign bit as it is .
		System.out.println(" x =  "+ x +" and  x >> 2   = " + (x >> 2) );
		
		//Bitwise Unsigned Right Shift ( >>> ) :
		// It is same as Right shift  and it shifts the n bits form right to  left and fills with 0's including  sign bit (Used for Negative Numbers)
		System.out.println(" x =  "+ x +" and  x >>> 2   = " + (x >>> 2) );
		System.out.println(" x =  "+ x +" and  x >>> 2   = " + (-x >>> 2) );
	}
	
	//Ternary Operator Method
	
	void ternary() {
		//Used to Assign simple Variable based on Condition
		System.out.println("These are Ternary Operations :");
		int marks = 65;
		int x = 45;
		
		String result;
		 result = (marks >= 50 ) ? " Pass..!"   :   " Fail..!";
		
		
		System.out.println(" The Reult = "+result);
		
        result = (x >= 50 ) ? " Pass..!"   :   " Fail..!";
		
		System.out.println(" The Reult = "+result);
		
	}
	
	//UnaryIncrement Operator Method
	void unaryIncrement() {
		
		int a = 9;
		int b = 5;
		System.out.println(" Initially  a ="+ a+" b ="+ b);
		
		//Pre-Increment
		
		System.out.println( " Pre-Increment");
		System.out.println( " ++a  = " + ++a);
		
		//Post-Increment
		System.out.println( " Post-Increment");
		System.out.println(" b++ = " + b++);
		System.out.println(" b = "+b);
		
		
		
	}
	
	//UnaryDecrement Operator Method
	void unaryDecrement() {
		
		int a = 9;
		int b = 5;
		System.out.println(" Initially  a ="+ a+" b ="+ b);
		
		//Pre-Increment
		
		System.out.println( " Pre-Decrement");
		System.out.println( " --a  = " + --a);
		
		//Post-Increment
		System.out.println( " Post-Decrement");
		System.out.println(" b-- = " + b--);
		System.out.println(" b = "+b);
		
		
	}
	
	
	void instance_of() {
		
		//Object of Parent Class
		OperatorsDemo Obj = new OperatorsDemo();
		
		//Checks Instance of class returns Boolean Value
		if ( Obj instanceof OperatorsDemo) {
			System.out.println("Yes, ' Obj ' is Instance of  class 'OperatorsDemo' ");
		}
			
		
			
		
	}
	

}
