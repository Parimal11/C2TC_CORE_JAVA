/*This Program Demonstrates use of this keyword for argument in constructor in java
 * 
 */

package com.capgemini.javadaythree;



public class ThisConstructDemo {
	
	int num;
	ThisConstructDemo(){
		
	}
	ThisConstructDemo(int num){
	
		this.num = num;
	}

	public static void main(String[] args) {
		
		ThisConstructDemo obj = new ThisConstructDemo(5);
		System.out.println("Num value : "+obj.num);

	}

}
