/** This Program demonstrates use of super keyword for method in java
 * 
 */
package com.capgemini.javadaythree;

class Person{
	void message(){

		System.out.println("This is person class");
	}
}

/* Subclass Student */
class Student extends Person{
	
	void message(){

		System.out.println("This is student class");
	}
	void display(){

		message();
		super.message(); //super keyword used to invoke message() from parent class Person
	}
}
/* Driver program to test */

public class SuperMethodDemo {

	
	public static void main(String[] args) {
		Student s = new Student();
		s.display();

	}

}
