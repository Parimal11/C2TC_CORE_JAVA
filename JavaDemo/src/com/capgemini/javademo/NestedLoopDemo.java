//This program demonstrates use of "Nested loop" i.e. loop inside another loop

package com.capgemini.javademo;

//Class is NestedLoopDemo declared
public class NestedLoopDemo {

	public static void main(String[] args) {
		
		//First for loop
		for(int first = 1; first <= 10; first++){
			
			//second for loop inside the above loops runs until condition second <= 10
			for(int second = 1; second <= 10; second++){
				
				/*Here output printed will be having first same for each second iteration
				 *  first will change after the second loop iteration is completed
				 *  e.g. first:1 and second:2
				 *  	first:1 and second:3 and so on
				 *  	
				 */
				System.out.println("Value of First: "+first+" and value of Second : "+second);
			}
			//Runs after temporary termination of second loop
			System.out.println("************************");
		}


	}

}
