//This program demonstrates one of OOPs Concepts "Polymorphism"  type one Method Overloading

package com.capgemini.javadaytwo;

//Parent class Super is declared
class Super{
	
	//Method disp() is declared
	void disp(){
		
			//Prints "Super Class"
			System.out.println("Super Class");
			}
	}

//Child class subclass Extends Super
class subclass extends Super{
	
	//Parent class method disp() is overriding here
	@Override
	void disp(){
		
			super.disp();
			System.out.println("Only Sub Class");
		}
	}

//Public class PolyOverloadDemo is declared
public class PolyMethodOverideDemo {
	
	//main method
	public static void main(String[] args) {
		
		//Object declared using subclass
		subclass obj = new subclass();
		obj.disp(); //disp() method is called using object obj
 	}

}
