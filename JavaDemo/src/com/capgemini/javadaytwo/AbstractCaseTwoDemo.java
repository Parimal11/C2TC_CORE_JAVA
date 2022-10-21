//This Program demonstrates Case Two of Abstraction where 
/*An abstract class can contain constructors in Java. And a constructor of abstract class is
  * called when an instance of a inherited class is created.
 */
package com.capgemini.javadaytwo;

//abstract class BaseDemo is created
abstract class BaseDemo{
	
	//Constructor BaseDemo Created
	BaseDemo(){
		
		System.out.println("BaseDemo Constructor Called"); //Prints "BaseDemo Constructor Called"
	}
	abstract void fun(); //abstract method is created fun()
 }

//A DerivedDemo class is created using extends keyword
class DerivedDemo extends BaseDemo{
	 
	//Constructor DerivedDemo is created
	DerivedDemo(){
		 
		 System.out.println("DerivedDemo Constructor Called"); // Prints "DerivedDemo Constructor Called"
	 }
	
	//fun() created
	 void fun(){
		 
		 System.out.println("DerivedDemo fun() called"); // Prints "DerivedDemo fun() called" 
	 }
}

public class AbstractCaseTwoDemo {


	public static void main(String[] args) {

		DerivedDemo dis = new DerivedDemo(); // DerivedDemo Calls both DerivedDemo and BaseDemo construct0r
		dis.fun(); //calls fun()
	}

}
