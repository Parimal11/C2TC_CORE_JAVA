/** This Program use of interface in Java Program to achieve Multiple Inheritance
 * 
 */
package com.capegemini.javadayfour;

interface BankOne{

	float rateOfInterest();
}

interface RBIBank{

	float RBIroi();
}

interface WorldBank{

	float Worldroi();
}

//Multiple Inheritance using interface is achieved in class SBI
class SBIFirst implements BankOne, RBIBank, WorldBank{

	@Override
	public float rateOfInterest(){

	return 9.15f;
	}

	@Override
	public float RBIroi(){

		return 8.7f;
	}

	@Override
	public float Worldroi(){

		return 6.7f;
	}
}
class ICICISecond implements BankOne{

	@Override
	public float rateOfInterest(){

		return 9.7f;
	}
}

public class MultipleInheritDemo {

	
	public static void main(String[] args) {
		
		BankOne b = new SBIFirst();
		System.out.println("ROI: " + b.rateOfInterest());
		System.out.println("ROI: " + ((WorldBank) b).Worldroi());
		System.out.println("ROI: " + ((RBIBank) b).RBIroi());

	}

}
