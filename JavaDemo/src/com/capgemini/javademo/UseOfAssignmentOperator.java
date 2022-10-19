//This Program shows use of Assignment Operator in Java

package com.capgemini.javademo;

//Class with name UseOfAssignmentOperator is declared
public class UseOfAssignmentOperator {

	//Main method is Initialized
	public static void main(String[] args) {
		
		//Integer Variable variableA is declared and assigned value 4 to it
		int variableA = 4;
		
		variableA += 5;  // Initiates operation variableA = variableA + 5
		System.out.println("\nValue After += is: "+variableA); // Prints value of variableA
		
		variableA -= 5;  // Initiates operation variableA = variableA - 5
		System.out.println("\nValue After -= is: "+variableA); // Prints value of variableA
		
		variableA *= 5;  //Initiates operation variableA = variableA * 5
		System.out.println("\nValue After *= is: "+variableA); // Prints value of variableA
		
		variableA /= 4;  //Initiates operation variableA = variableA / 4
		System.out.println("\nValue After /= is: "+variableA); // Prints value of variableA
		
		variableA %= 5;    //Initiates operation variableA = variableA % 5
		System.out.println("\nValue After %= is: "+variableA);


	}

}
