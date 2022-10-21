/* This Program demonstrates Case Two of Abstraction where 
 * we can have an abstract class without any abstract method. This allows us to
 * create classes that cannot be instantiated, but can only be inherited.
 */
package com.capgemini.javadaytwo;

//abstract class BaseOne is created
abstract class BaseOne{
	
	//method is created fun()
	void fun(){
		
		System.out.println("BaseOne fun() called"); //Prints "BaseOne fun() Called"
	}
}

//A DerivedOne class is created using extends keyword
class DerivedOne extends BaseOne{
}


public class AbstractCaseThreeDemo {


	public static void main(String[] args) {
		
		DerivedOne d = new DerivedOne(); //Object d is created using DerivedOne Class
		d.fun(); //calls fun() method from abstract class

	}

}
