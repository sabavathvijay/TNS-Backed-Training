package com.kprit.tns.datatypes;

//Demo for Datatypes
/* There Two types of DataTypes in Java.
 1. Premitive (Directly Holds the Values) ->  [Boolean, Byte, Short, Int, Long, Double, Char. ]-(Stored in Stack Memory )-(Default Value = 0 / false ) 
 
 2. Non-Premitives(They don't store Values Directly. Instead they store a Memory Address /Reference  to the Object that holds the Value. these are created not Predefined)
                  ->  [Classes, Interfaces, Arrays   ]-(Stored in Heap Memory )-(Default value = null )
                  
                  (In Java 'String' is also a Class not a DataType so , it is a Reference DataType)
  
*/
public class DataTypesDemo {
	
	
	// Primitive DataTypes
	
	boolean value = true;
	
	// 1 bit
	byte value2 =127 ;         // 8 bits
	short value1 = 32767;      // 16 bits
	int value3 = 2147483647;		 // 32 bits
	long value4 = 9223372036854775807L;	// 64 bits
	
	float value5 = 3234.141243278345f;		// 32 bits
	double value6 = 3456.14124512345678902345678914f;		//64 bits
	
	char value7 = 'V';  		//16 bits

	
	

}
