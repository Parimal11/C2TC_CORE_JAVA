//Program Demonstrates use of "for loop" in Java

package com.capgemini.javademo;


//Class declared with name ForloopDemo
public class ForloopDemo {

	//Main Method initiated
	public static void main(String[] args) {
	
	/*Following syntax is used for iteration using for loop to print or iterate various 
	 * statement up-to particular condition
	 * Here for loop prints i:1 to i:10  i.e. in ascending order
	 */
		System.out.println("\n---Increment Operator---");
		for(int i = 1; i<=10 ; i++)   {	
				
			System.out.print("Value of i:");
			System.out.println(i);
			}
		
		
		/*Following syntax is used for iteration using for loop to print or iterate various 
		 * statement up-to particular condition
		 * Here for loop prints j:10 to j:1 i.e. in descending order
		 */
		System.out.println("\n---Decrement Operator---");
		for(int j = 10; j>=1;j--) {
			
			System.out.print("Value of j:");
			System.out.println(j);
		}
	
	}

}
