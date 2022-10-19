//This Program shows DecisionMaking using Conditional "If Else" in Java

package com.capgemini.javademo;

//Class with name ProgramOnIfElse is declared
public class ProgramOnIfElse {

	//Main method is Initialized
	public static void main(String[] args) {
		
		int variableOne = 5;

		//Following if condition checks if variableOne is equals to 5 
		// If the condition is satisfied moves forward
		if (variableOne == 5) { 
		
			//Following if condition checks if variableOne is greater than or equals to 5 
			// If the condition is satisfied moves forward
			 if (variableOne >= 5) {
				 
				 //Prints "variableOne is greater than 5" 
				 System.out.println("variableOne is greater than 5"); 
		   }
			 //Else condition will get executed if variableOne is not greater than or equals to 5
			 else {
				 
				//Prints "variableOne is smaller than 5"
				 System.out.println("variableOne is smaller than 5"); 
		   } 
		 
		}
		
		//Following if condition checks if variableOne is equals to 5 
		// If the condition is satisfied moves forward
		if(variableOne == 5){
			
			//Prints "variableOne is equals to 5"
			System.out.println("variableOne equals to 5");
		}
		
		//Following else-if condition checks if variableOne is greater than 5 
		// If the condition is satisfied moves forward
		else if(variableOne > 5){
			
			//Prints "variableOne is greater than 5"
			System.out.println("variableOne is greater than 5");		
		}
		
		//Else condition will get executed if variableOne is not greater than 5
		else {
			
			//Prints "variableOne is smaller than 5"
			System.out.println("variableOne is smaller than 5");
		}


	}

}
