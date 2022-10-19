//This Program shows use of Switch Case statement using character as parameter in Java 

package com.capgemini.javademo;

//class name CodeSwitchCaseString is declared
public class CodeSwitchCaseString {

	//Main Method Initiated
	public static void main(String[] args) {
		
		//String with name "name" is assigned with "Team"
		String name = "Team";
		
		/*The below code is way  to Use of switch case using String as parameter helps to directly jump on certain case
		 * In following code String is taken as input and jumps on that particular case
		 */
		/*toLowerCase()converts string's all characters in Lower Case*/ 
		switch (name.toLowerCase()){
		
		//Executes Case 'author' if satisfied condition 
			case "author":
				
				//Prints "Anshul" for Case "author"
				System.out.println("Anshul");
				break;   //Statements is terminated through break statement
			
			//Executes Case 'team' if satisfied condition 
			case "team":
				
				//Prints "Team Java Full Stack" for Case "team"
				System.out.println("Team Java Full Stack");
				break;  //Statements is terminated through break statement
				
			//Executes Case 'editor' if satisfied condition 
			case "editor":
				
				//Prints "Anshul & Adhiraj" for Case "editor"
				System.out.println("Anshul & Adhiraj");
				break;  //Statements is terminated through break statement
			
			//If neither of the above case is satisfying condition then default case is executed	
			default:
				System.out.println("Invalid entry");
				break;  //Statements is terminated through break statement
		}


	}

}
