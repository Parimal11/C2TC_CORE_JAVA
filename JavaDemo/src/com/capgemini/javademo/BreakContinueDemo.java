//This program demonstrates use of 'break' and 'continue' keyword

package com.capgemini.javademo;

//Class is BreakContinueDemo declared
public class BreakContinueDemo {

	//main method
	public static void main(String[] args) {
        
		//For loop starts 
		for(int variable = 1; variable <= 10; variable++){
			
       	 if(variable == 1){
       		 continue; 
       		 /*  continue statement breaks one iteration (in the loop), 
       		 if a specified condition occurs, and continues with the next iteration in the loop.
       		 */
       		 
       		 
       		 //break; can also be used to terminte the loop
       	 }
       	 //Prints value of variable
       	 System.out.println(variable);
        }
		
		

	}

}
