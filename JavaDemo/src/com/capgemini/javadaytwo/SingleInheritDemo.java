//This Program demonstrates one of OOPs Concepts "Single Inheritance"

package com.capgemini.javadaytwo;

//Class First is Parent Class
class First{
	
	//Display1() method  for class First
	void display1() {
		
		System.out.println("One"); // Prints One
		
	}
}

/*Class Second is Child class of First
Inherits Features of Class First
"extends" keyword used to inherit class*/

class Second extends First{
	
	//Display2() method  for class Second
	void display2() {
		
		System.out.println("Two");  // Prints Two
		
	}
}


//Public class SingleInheritDemo is declared
public class SingleInheritDemo {
//
	public static void main(String[] args) {
		
		//Object two is created using new keyword
		Second two = new Second();
		
		/* here Object two is used to call both display1() and display2()
		 * two.display1(); calls Class First
		   two.display2(); calls Class Second*/
		two.display1();
		two.display2();
		
		
	}

}
