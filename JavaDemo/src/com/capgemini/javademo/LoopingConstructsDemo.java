//Program Demonstrates use of various "Looping Constructs (for loop,while loop,do-while loop)" in Java

package com.capgemini.javademo;

//Class LoopingConstructsDemo  is declared
public class LoopingConstructsDemo {
	
	//main method
	public static void main(String[] args) {
			
		System.out.println("*******Following code Displays output for 'for-loop'*******");
		//Following code demonstrates use of "for loop" constructs for iteration
		  for(int first = 1,second = 1; first<10 || second < 10;first++,second++){
			  
			  //increments value of second by 1
			  second++;
			  
			  //Prints value of first and second for every iteration
			  System.out.println("First = "+first+" and Second = "+second); 
		  }

		  System.out.println("\n*******Following code Displays output for 'while-loop'*******");
		  //Following code demonstrates use of "while loop" constructs for iteration 
			  int firstNo = 1, secondNo = 1; //Assign values to two integer variables
			  while(firstNo < 10 || secondNo < 10){ 
				  
				//increments value of firstNo and secondNo by 1
				  firstNo++;
				  secondNo++;
				  //Separately prints values of firstNo and secondNo after every postfix increments
			      System.out.println("FirstNo = "+firstNo+" and SecondNo = "+secondNo); 
			  }	
			
			 System.out.println("\n*******Following code Displays output for 'doWhile-loop'*******");
			int firstNum = 1, secondNum = 1;
			
			//Following code demonstrates use of "do-while loop" constructs for iteration 
			do {
				
				//increments value of firstNum and secondNum by 1
				firstNum++;
				secondNum++;
				
				//Separately prints values of firstNo and secondNo after every postfix increments
				System.out.println("First Number = " + firstNum + " and Second Number = "  + secondNum);
			    } while (firstNum < 10 || secondNum < 10);


	}

}
