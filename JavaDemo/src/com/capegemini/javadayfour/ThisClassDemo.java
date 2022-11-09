/*This Program Demonstrates use of this keyword for instance of current class in java
 * 
 */

package com.capegemini.javadayfour;

public class ThisClassDemo {
	
	int a;
	int b;
	//Default constructor
	ThisClassDemo(){
	
		a = 10;
		b = 20;
	}
	//Method that returns current class instance
	ThisClassDemo get(){
	
		return this;
	}
	//Displaying value of variables a and b
	
	void display(){
	
		System.out.println("a = " + a + " b = " + b);
	}

	public static void main(String[] args) {
		
		ThisClassDemo object = new ThisClassDemo();
		object.get().display();

	}

}
