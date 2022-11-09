/** This Program demonstrates use of this keyword for calling instance of variable in java
 * 
 */
package com.capgemini.javadaythree;


public class ThisVariableDemo {

	int num;
	public void setNum(int num){
		
		this.num = num; //refer instance variable of current class
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisVariableDemo obj = new ThisVariableDemo();
		obj.setNum(5);
		System.out.println("Num value : "+obj.num);
	}

}
