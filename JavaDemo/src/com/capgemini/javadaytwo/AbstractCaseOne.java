//This Program demonstrates Case One of Abstraction where instance of abstract
//class is not created but abstract can have reference is from other class 
package com.capgemini.javadaytwo;

//abstract class Base is created
abstract class Base{
	
	//abstract method is created fun()
	abstract void fun();
}

//A Derived class is created using extends keyword
class Derived extends Base{
	
	//Does works for fun()
	void fun(){
		
		//Prints "Derived fun() called"
		System.out.println("Derived fun() called");
	}
}



public class AbstractCaseOne {

	public static void main(String[] args) {
		
		/* Uncommenting the following line will cause compiler error as the
		 * line tries to create an instance of abstract class.
		 *Base b = new Base();*/
		
		
		// We can have references of Base type.
		Base b = new Derived(); //abstract class is used to create object using derived class
		b.fun(); //Object b calls fun() method
	}

}
