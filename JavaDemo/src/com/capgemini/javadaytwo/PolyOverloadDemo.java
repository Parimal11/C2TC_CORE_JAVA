//This program demonstrates one of OOPs Concepts "Polymorphism"  type one Method Overloading

package com.capgemini.javadaytwo;

//Public class PolyOverloadDemo is declared
public class PolyOverloadDemo {

	//add() method is declared with integer variable x and y 
	void add(int x, int y){
		
		System.out.println("Add is "+(x+y)); //prints "add is Addition of (x+y)"
	}
	
	//add() method is overloaded with three parameters x,y,z
	void add(int x, int y, int z){
		
		System.out.println("Add is "+(x+y+z));  //prints "add is Addition of (x+y+z)"
	}
	public static void main(String[] args){
		
		//Objects obj is created 
		PolyOverloadDemo obj = new PolyOverloadDemo();
		
		//obj object calls add(5,4) and add(5,5,4)
		obj.add(5, 4);
		obj.add(5, 5, 4);
	}
}
