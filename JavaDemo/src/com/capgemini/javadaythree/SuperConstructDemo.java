/** This Program Demonstrates use of super keyword for constructor in java
 * 
 */
package com.capgemini.javadaythree;

class One{
	//Default Constructor Person
	One(){
		System.out.println("One class Constructor");
	}
}

/* subclass Student extending the Person class */
class Two extends One{

	Two(){

		// invoke or call parent class constructor

		super();  //super() calls Default constructor Parent class Constructor

		System.out.println("Two class Constructor");
	}
}
/* Driver program to test*/

public class SuperConstructDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two source = new Two();
	}

}
