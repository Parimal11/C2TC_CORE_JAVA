//This Program shows use of Switch Case statement using integer as parameter in Java  
 
package com.capgemini.javademo;

//class name ProgramOnSwitchCase is declared
public class ProgramOnSwitchCase {

	//main method
	public static void main(String[] args) {
		
		//integer variable_No is defined and assigned value 10
		  int variable_No = 10;

		  //If statement checks for condition "variable_No == 1"
		  if (variable_No == 1) {
			  
			  //Prints string "The value of variable_No is 1" if "variable_No == 1"
			  System.out.println("The value of variable_no is 1"); 
			  }
		  
		//Else If statement checks for condition "variable_No == 2"
		  else if (variable_No== 2) {
			  
			//Prints string "The value of variable_No is 1" if "variable_No == 1"
			  System.out.println("The value of variable_no is 2"); 
			  }
		  
		//Else If statement checks for condition "variable_No == 3"
		  else if (variable_No == 3){
			  
			//Prints string "The value of variable_No is 1" if "variable_No == 1"
			  System.out.println("The value of variable_No is 3");
			  }
		  
		//else statement is executed if is"variable_No != 1,2,3"
		  else {
			  
			//Prints string "The value of variable_No is 1" if "variable_No == 1"
			  System.out.println("The value of variable_No is other than 1,2,3"); 
		  }
		 
		/*The below code is another way  to find solution of above problem
		 * Use of switch case using Integers helps to directly jump on certain case
		 * In following code variable is taken as input and jumps on that particular case
		 */
		 System.out.println("\n===Following output is obtained using 'Switch-Case Statement==='");
		  
		switch (variable_No) {
		
		case 1: 
			//Executes Case 1 if Variable_no is 1
			System.out.println("The value of variable_no is 1");
			break;      //Statements is terminated through break statement
		case 2:
			//Executes Case 2 if Variable_no is 2
			System.out.println("The value of variable_no is 2");
			break;      //Statements is terminated through break statement
		case 3:
			//Executes Case 3 if Variable_no is 3
			System.out.println("The value of variable_no is 3");
			break;      //Statements is terminated through break statement
		default:
			//If neither of the above case is satisfying condition then default case is executed
			System.out.println("The value of variable_No is other than 1,2,3");
			break;  //Statements is terminated through break statement

		}


	}

}
