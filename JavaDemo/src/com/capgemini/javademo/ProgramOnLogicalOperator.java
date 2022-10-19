/*This Program shows DecisionMaking Logical Operators with  
 * conditional statements  for Printing True or False and checking certain condition
 * in Java
*/

package com.capgemini.javademo;

//Class ProgramOnLogicalStatements is declared
public class ProgramOnLogicalOperator {

	public static void main(String[] args) {
		 
			//two variables are declared along with values assigned respectively
			int variable_1 = 10; 
			int variable_2 = 11;
		  
			/* Following if statement checks two condition separately and Logical OR
			 * checks condition "If either of the two condition is satisfied it will run inner 
			 * condition"
			 */
			if(!(variable_1 < variable_2) || (variable_1 == variable_2)){ 
			  
				//Prints "Condition is True" if above condition is satisfied
				System.out.println("Condition is TRUE");
				}
			
			//If above condition is not satisfied then else condition will be executed
			else{
			
			  //Prints "Condition is False" if above condition is satisfied
			  System.out.println("Condition is FALSE"); 
			}
		 

			//Here ageOfBoy and ageOfGirl two integer variable is defined and age is specified
			int ageOfBoy = 36;
			int ageOfGirl = 25;
			
			
			System.out.println("\n --CHECKS FOR AGE OF BOY AND GIRL AND PRINTS MESSAGE ACCORDINGLY--");
			/*If condition checks two separate condition and uses Logical AND is use to check 
			 * the final condition "If any of the two condition is false it will not execute 
			 * if statement"
			 */
			if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) {
					
				//Prints "Both Conditions are Satisfied" "ready to get married!" if above condition is satisfied
				System.out.println("Both Conditions are Satisfied ");
				System.out.println("ready to get married!");
				} 
			
			//Else will be executed if "IF statement is NOT SATISFIED"
			else {
				
				//Prints "Anyone OR Both from BOY or GIRL is UNDERAGE" "Wait for it kiddo!" for else statement
				System.out.println("Anyone OR Both from BOY or GIRL is UNDERAGE");
				System.out.println("Wait for it kiddo!");
		}

	}

}
