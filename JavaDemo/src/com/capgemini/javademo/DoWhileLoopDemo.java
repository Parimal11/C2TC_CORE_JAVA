//Program Demonstrates use of "do-while loop" in Java

package com.capgemini.javademo;

//Class declared with name DoWhileLoopDemo
public class DoWhileLoopDemo {
	
	//main method
	public static void main(String[] args) {
		
		//Integer variableA is assigned value 11
		int variableA = 11;
		
		/*Following syntax is used for iteration using do-while loop to print or iterate various 
		 * statement up-to particular condition
		 * Here do-while loop iterates till it satisfies condition "variableNo >= 1"
		 * */
		do{
			
			//Prints value of variableA
			System.out.println(variableA);
			
			//Increments value of variableA by 1
			variableA++;
		}while(variableA <= 1); // Here while checks condition to run loop
		
		//Cursor comes out of loop after the condition is false


	}

}
