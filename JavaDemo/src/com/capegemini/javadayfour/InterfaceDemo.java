/** This Program use of interface in Java Program 
 * 
 */
package com.capegemini.javadayfour;

//Interface Bank is Declared
interface Bank{

	float rateOfInterest();
}

//class SBI inherits bank interface using "implements" keyword
class SBI implements Bank{

	@Override

	public float rateOfInterest(){

		return 9.15f;
	}
}

//class ICICI inherits bank interface using "implements" keyword
class ICICI implements Bank{

	@Override
	public float rateOfInterest(){
			
		return 9.7f;
	}
}

public class InterfaceDemo {

	
	public static void main(String[] args) {
		
		//object b is declared 
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest()); //prints rate of interest of SBI Bank
	}

}
