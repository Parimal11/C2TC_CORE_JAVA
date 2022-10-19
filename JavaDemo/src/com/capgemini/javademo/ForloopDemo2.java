//Program Demonstrates use of "for loop"  also checks condition for prime number in Java

package com.capgemini.javademo;


//Class declared with name ForloopDemo2
public class ForloopDemo2 {

	//Main method
	public static void main(String[] args) {
		
		//Integer variable number assigned value 8
		int number = 8;
		
		//Boolean variable isPrime is set to true
		boolean isPrime = true;
		
		/*Following syntax is used for iteration using for loop to print or iterate various 
		 * statement up-to particular condition
		 * Here for loop iterates till it satisfies condition "number % i == 0"
		 */
		for(int i = 2; i < number/2; i++){
			
			if(number % i == 0){
				
				//If above condition is satisfied isPrime is set to "false"
				isPrime = false;
			}
		}
		
		//Cursor jumps to below If condition after iteration is completed
		if(isPrime == true){
			
			//If above condition is satisfied system prints "The number is a prime number"
			System.out.println("The number is a prime number");
		}
		
		//Else will be executed if above condition is not satisfied
		else{
			
			// Prints "The number is not a prime number" for else condition
			System.out.println("The number is not a prime number");
		}
		


	}

}
