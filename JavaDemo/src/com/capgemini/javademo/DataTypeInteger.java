//This Program shows Primitive Datatype Integer used in Java

package com.capgemini.javademo;

//Class name with DataTypeInteger is declared
public class DataTypeInteger {

	//main method  
	public static void main(String[] args) {
		
		//integer variable max with maximum number is defined
		int max = 2147483647;
		
		//integer variable minimum number is defined
		int min = -2147483648;
		
		//short datatype variable maximum number is defined
		short shortMax = 32767;
		
		//short datatype variable minimum number is defined
		short shortMin = -32768;
		
		//long datatype variable maximum number is defined
		long longMax = 9223372036854775807L;
		
		//long datatype variable minimum number is defined
		long longMin = -9223372036854775808L;
		
		//byte datatype variable maximum number is defined
		byte byteMax = 127;
		
		//byte datatype variable minimum number is defined
		byte byteMin = -128;
		
		//Prints Integer Maximum value
		System.out.println("Prints Integer Maximum =" +max);
		
		//Prints Integer Minimum value
		System.out.println("Prints Integer Minimum =" +min);
		
		//Prints short Integer Maximum value
		System.out.println("Prints short Integer Maximum =" +shortMax);
		
		//Prints short Integer Minimum value
		System.out.println("Prints  short Integer Minimum =" +shortMin);
		
		//Prints long Integer Maximum value
		System.out.println("Prints long Integer Maximum =" +longMax);
		
		//Prints long Integer Minimum value
		System.out.println("Prints long Integer Minimum =" +longMin);
		
		//Prints byte Integer Maximum value
		System.out.println("Prints byte Integer Maximum =" +byteMax);
		
		//Prints byte Integer Minimum value
		System.out.println("Prints byte Integer Minimum =" +byteMin);

	}

}
