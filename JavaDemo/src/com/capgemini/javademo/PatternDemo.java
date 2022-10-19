//This Program demonstrates how to create a particular pattern

package com.capgemini.javademo;

//Class PatternDemo is declared
public class PatternDemo {

	public static void main(String[] args) {
		
		//Nested loops are used for creating pattern
		for (int first = 1; first <= 5; first++){
			for (int second = 1; second <= first; second++) {
				
				//Prints character @ line by line
				System.out.print('@');
			}
			
			//Helps to make pattern for every line
			System.out.println();
		}
		/*prints pattern as
		 * @
		   @@
           @@@
           @@@@
           @@@@@ 
		 */

	}

}
