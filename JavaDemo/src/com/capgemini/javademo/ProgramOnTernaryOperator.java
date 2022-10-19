//This Program shows use of Ternary Operator in Java

package com.capgemini.javademo;

//Class with name ProgramOnTernaryOperator is declared
public class ProgramOnTernaryOperator {

	//Main method is Initialized
	public static void main(String[] args) {
		
		//Integer Variable variable_1 is declared and assigned value 10 to it
		int variable_1 = 10;
		
		//Prints Value of Variable_1 Before use of Ternary Operator
		System.out.println("Value of Variable Before use of Ternary Operator");
		System.out.println(variable_1);
		
		/*Ternary operator "?" checks the if statement part i.e. if(10 == variable_1) 
		 * then variable_1 is assigned value "1" 
		 * else ":"(Ternary Operator) variable_1 is assigned value 0
		 */
		variable_1 = (10 == variable_1) ? 1 : 0;
		
		//Prints Value of Variable_1 After use of Ternary Operator
		System.out.println("\nValue of Variable After  use of Ternary Operator");
		System.out.println(variable_1);


	}

}
