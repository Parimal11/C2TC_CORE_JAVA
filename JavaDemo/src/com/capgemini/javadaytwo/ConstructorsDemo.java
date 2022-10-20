//This program demonstrates Use of Constructor in Java

package com.capgemini.javadaytwo;



//Class ConstructorsDemo uses CarDemo class from package com.capgemini.javadaytwo;
public class ConstructorsDemo {

	public static void main(String[] args) {
		
		//Object CarDemo is created with assigning values to parameter
		CarDemo carDemo = new CarDemo("closed",10);
		
		//prints value of run() method
		System.out.println(carDemo.run());

	}

}
