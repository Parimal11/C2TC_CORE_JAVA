//This Program shows Primitive DataType float used in Java

package com.capgemini.javademo;

//Class name DataTypeFloat is declared
public class DataTypeFloat {

	public static void main(String[] args) {
		
		//integer value1 is declared
		int value1 = 9/2;
		
		//float value2 is declared
		float value2 = 10f/6f;
		
		//double value3 is declared
		double value3 = 10d/6d;
		
		//prints value1 
		System.out.println("value  1 = "+ value1);// skips values after decimal
		
		//prints value2
		System.out.println("value  2 = "+ value2);//considers values after decimal
		
		//prints value3
		System.out.println("value  3 = "+ value3);//considers values after decimal
		
		
		//integer variable marker is declared
	    int marker = 512;
	    
	    //double variable percentage is declared
	    double percentage = marker * 0.46f;
	    
	    //prints value of percentage variable
	    System.out.println("percentage:"+percentage);
		


	}

}
