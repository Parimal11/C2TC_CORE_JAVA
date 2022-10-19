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
		
			//Executes Case 'A' OR case 'a' if albhabet  entered is either upper or lower case A
			case 'a' : 
			case 'A' : 
				
				//Executes Case 'a' OR A if alphabet entered is A or a 	
				System.out.println("The value of alphabet is a");
				break;//Statements is terminated through break statement
				
			//Executes Case 'B' OR case 'b' if alphabet  entered is either upper or lower case B
			case 'b':
			case 'B' :
				
				//Executes Case 'b' OR B if alphabet entered is B or b
				System.out.println("The value of aphabet is b");
				//Statements is terminated through break statement
				break;
				
			//Executes Case 'C' OR case 'c' if alphabet  entered is either upper or lower case C	
			case 'c':
			case 'C' :
				
				//Executes Case 'c' OR C if alphabet entered is C or c 	
				System.out.println("The value of alpabet is c");
				
				
				break;
				
				
			default:
				System.out.println("The value of x is other than a,b,c");
				break;
		}


	}

}
