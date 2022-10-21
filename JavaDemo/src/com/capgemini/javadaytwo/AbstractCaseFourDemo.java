/** This Program demonstrates Case Two of Abstraction where 
 * Abstract classes can also have final methods (methods that cannot be overridden).
 */
package com.capgemini.javadaytwo;

abstract class BaseFour{
	
	//fun() is created using final keyword which cannot be overridden
	final void fun(){
		
		System.out.println("DerivedFour fun() called");
	}
}


class DerivedFour extends BaseFour{
	
}

public class AbstractCaseFourDemo {

	
	public static void main(String[] args) {
		
		BaseFour b = new DerivedFour();
		b.fun(); //calls fun() method

	}

}
