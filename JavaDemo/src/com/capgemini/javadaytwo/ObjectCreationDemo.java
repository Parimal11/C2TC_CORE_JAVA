//this Program demonstrates Object creation for calling set and get method

package com.capgemini.javadaytwo;


//ObjectCreationDemo Uses Demo Class features from package com.capgemini.javadaytwo
public class ObjectCreationDemo {

	
	public static void main(String[] args) {
		
		//Object is demo created 
		Demo demo = new Demo();
		
		//object demo calls setDoors()method using syntax "demo.setDoors("closed");"
		demo.setDoors("closed");
		
		//object demo calls setSpeed()method using syntax "demo.setSpeed(10);"
		demo.setSpeed(10);
		
		//Prints value of run() method
		System.out.println(demo.run());

	}

}


