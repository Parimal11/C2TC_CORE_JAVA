//This Program demonstrates one of OOPs Concepts "Hierarchical Inheritance"

package com.capgemini.javadaytwo;

//Class FirstDemo is Parent Class
class FirstDemo{
	
	//DisplayA() method  for class FirstDemo
	void displayA() {
		
		System.out.println("One"); // Prints One
		
	}
}

/*Class SecondDemo is Child class of FirstDemo
Inherits Features of Class FirstDemo
"extends" keyword used to inherit class*/

class SecondDemo extends FirstDemo{
	
	//DisplayB() method  for class SecondDemo
	void displayB() {
		
		System.out.println("Two");  // Prints Two
		
	}
}

/*Class ThirdDemo is Child class of FirstDemo
Inherits Features of Class FirstDemo
"extends" keyword used to inherit class*/

class ThirdDemo extends FirstDemo{
	
	//DisplayC() method  for class ThirdDemo
	void displayC() {
		
		System.out.println("Third");  // Prints Third
		
	}
}

/*Class FourthDemo is Child class of FirstDemo
Inherits Features of Class FirstDemo
"extends" keyword used to inherit class*/

class FourthDemo extends FirstDemo{
	
	//DisplayD() method  for class FourthDemo
	void displayD() {
		
		System.out.println("Four");  // Prints Four
		
	}
}//

//Public class HierarchicalInheritDemo is declared
public class HierarchicalInheritDemo {

	public static void main(String[] args) {
		
		//Object four is created using new keyword
		FourthDemo four = new FourthDemo();
		
		/* here Object two is used to call both displayA() and displayD()
		 * four.displayA(); calls Class FirstDemo
		   four.displayD(); calls Class FourthDemo*/
		four.displayA();
		four.displayD();
		
		//Object third is created using new keyword
		ThirdDemo third = new ThirdDemo();
		
		/* here Object third is used to call both displayA() and displayC()
		 * third.displayA(); calls Class FirstDemo
		   third.displayC(); calls Class ThirdDemo*/
		third.displayA();
		third.displayC();
		
		//Object two is created using new keyword
		SecondDemo two = new SecondDemo();
				
		/* here Object two is used to call both displayA() and displayB()
		 * two.displayA(); calls Class FirstDemo
		   two.displayB(); calls Class SecondDemo*/
		two.displayA();
		two.displayB();
		
		

	}

}
