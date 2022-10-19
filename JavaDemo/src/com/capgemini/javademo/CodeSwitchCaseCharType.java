//This Program shows use of Switch Case statement using character as parameter in Java 
  

package com.capgemini.javademo;


//class name CodeSwitchCaseCharType is declared
public class CodeSwitchCaseCharType {
	
	//Main Method Initiated
	public static void main(String[] args) {
		
		//Character alphabet is declared and assigned value 'F'
		char alphabet = 'F';
		
		/*The below code is way  to Use of switch case using Character as parameter helps to directly jump on certain case
		 * In following code variable is taken as input and jumps on that particular case
		 */
		switch (alphabet) {
		
			//Executes Case 'A' OR case 'a' if alpbhabet  entered is either upper or lower case A
			case 'a' : 
			case 'A' : 
				
				//Executes Case 'a' OR A if alphabet entered is A or a 	
				System.out.println("The value of x is a");
				break;//Statements is terminated through break statement
				
			//Executes Case 'B' OR case 'b' if alphabet  entered is either upper or lower case B
			case 'b':
			case 'B' :
				
				
				System.out.println("The value of x is b");
				break;
			case 'c':
			case 'C' :	
				System.out.println("The value of x is c");
				break;
			default:
				System.out.println("The value of x is other than a,b,c");
				break;
		}


	}

}
