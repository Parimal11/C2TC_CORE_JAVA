/*This Program shows DecisionMaking Relational Operators with   
 * conditional statements  for Printing True or False used in Java
*/

package com.capgemini.javademo;


//Class ProgramOnConditionalStatements is declared
//Below Class can also be Declared by Name ProgramOnRelationalOperators
public class ProgramOnConditionalStatements {
	
	//main method is initiated
	public static void main(String[] args) {
		
		//Two Integer variable firstNumber and secondNumber are declared
		int firstNumber = 8, secondNumber = 7;
		
		/*Following 'if' statement checks 
		 * whether firstNumber is greater than or equal to secondNumber 
		   with help of relational operator ">="
		 */
        if(firstNumber >= secondNumber){
        	
        	//Prints 'True' if Above condition is satisfied
     	   System.out.println("true");
        }
        /*If Above condition is not satisfied
         * cursor will jump to 'else' statement
         */
        else{
        	//Prints 'False' for else statement
     	   System.out.println("false");
        }


	}

}
