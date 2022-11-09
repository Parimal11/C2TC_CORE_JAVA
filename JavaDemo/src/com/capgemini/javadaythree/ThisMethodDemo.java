/** This Program Demonstrates use of this keyword for argument in method in java
 * 
 */
package com.capgemini.javadaythree;


public  class ThisMethodDemo {
	
	void function1(ThisMethodDemo obj){
		
		System.out.println("Function 1 invoked");
	}
	void function2(){
		
		function1(this);
	}
	
	public static void main(String[] args) {
		
		ThisMethodDemo obj = new ThisMethodDemo();
		obj.function2();

	}

}
