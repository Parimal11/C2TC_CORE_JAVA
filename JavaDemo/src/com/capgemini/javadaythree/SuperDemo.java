/** This Program Demonstrates use of super keyword in java
 * 
 */
package com.capgemini.javadaythree;

class Vehicle{
	int maxSpeed = 120;
}

class Car extends Vehicle{
	
	int maxSpeed = 180;
	void display(){
		
			System.out.println("Maximum Speed: " +super.maxSpeed); //super keyword invokes instance of parent class variable
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Car small = new Car();
		small.display();
	}

}
