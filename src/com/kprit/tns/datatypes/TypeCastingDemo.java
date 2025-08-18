package com.kprit.tns.datatypes;

//TypeCasting Demo


/*
The converting Value from one type to another type , It performs b/w  Different type Variables.
They are 2 types 
1. Implicit (Automatic) => [byte -> short -> char -> int -> long -> float -> double  ]  -  (Smaller data type to  Larger )

2. Explicit => [double -> float ->long -> int -> char -> short -> byte ] - 
				(Potential for Data loss , Larger data type to Smaller , Target datatype is placed in front of Value )
				
Note : Java also Support Casting for Objects , so they are also Implicit and Explicit
3. Implicit (Automatic) => [ Subclass - object to a Superclass reference ] - (No risk of Data loss)
4.Explicit =>  [Superclass reference to Subclass reference] -(Risky bcz Complier confuse  , and Occurs ' ClassCastingException ' )
				-(So, to Prevent we use 'instanceof ' Operator to check the type of Object before )

//Therfore we consider there are two main TypeCasting 
 1. Primitive typecasting
 2. Object	typecasting
 */

public class TypeCastingDemo {
	
	public void primitiveTypecasting() {
		byte _Byte = 17;
		short _Short = 97;
		char _Char = 'A';
		int _Int = 101;
		long _Long = 789l;
		
		float _Float = 5678.99f;
		double _Double = 7987.890d;
		
		//Implicit 
		
		short toShort  = _Byte;
		//char toChar = _Short;
		//int  toChar = _Char;
		long toLong = _Int;
		float toFloat = _Long;
		double toDouble = _Float;
		
		
		//Explicit
		
		float _toFloat = (float)_Double;
		long _toLong = (long)_Float;
		int  _toInt = (int)_Long;
		char _toChar = (char)_Int;
		short _toShort = (short)_Char;
		byte _toByte = (byte)_Short;
		
		System.out.println("The Implicit TypeCasting :\n"
				+ "" 
				+ toShort
				+ "\n"
				+ toLong
				+ "\n"
				+ toFloat
				+ "\n"
				+ toDouble);
		
		System.out.println("\n\nThe Explicit TypeCasting :\n"
				+ "" 
				+ _toShort
				+ "\n"
				+ _toLong
				+ "\n"
				+ _toFloat
				+ "\n"
				+ _toChar
				+ "\n"
				+ ""
				+ _toInt
				+ "\n"
				+ _toByte);
		
		
		
				
		
		
	}
	

	
}
