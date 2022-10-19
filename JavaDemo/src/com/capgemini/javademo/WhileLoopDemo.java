//Program Demonstrates use of "while loop" in Java

package com.capgemini.javademo;

//Class declared with name WhileloopDemo
public class WhileLoopDemo {

	//main method
	public static void main(String[] args) {
		
		//Integer variableNo is assigned value 99
		int variableNo = 99;
		
		/*Following syntax is used for iteration using while loop to print or iterate various 
		 * statement up-to particular condition
		 * Here while loop iterates till it satisfies condition "variableNo <= 100"
		 */
		while(variableNo <= 100){
			
			//Prints value of variableNo
			System.out.println(variableNo);
			
			//Increment value of variableNo by 1
			variableNo++;
		}
		//Cursor comes out of loop after the condition is false

	}

}
