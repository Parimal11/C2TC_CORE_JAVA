//This Program demonstrates one of OOPs Concepts "MultiLevel Inheritance" 
//
package com.capgemini.javadaytwo;

//Class FirstDemo is Parent Class
class FirstD{
	
	//DisplayA() method  for class FirstD
	void displayA() {
		
		System.out.println("One"); // Prints One
		
	}
}

/*Class SecondD is Child class of FirstD
Inherits Features of Class FirstD
"extends" keyword used to inherit class*/

class SecondD extends FirstD{
	
	//DisplayB() method  for class SecondD
	void displayB() {
		
		System.out.println("Two");  // Prints Two
		
	}
}

/*Class ThirdD is Child class of SecondD
Inherits Features of Class FirstD,SecondD
"extends" keyword used to inherit class*/

class ThirdD extends SecondD{
	
	//DisplayC() method  for class ThirdD
	void displayC() {
		
		System.out.println("Third");  // Prints Third
		
	}
}

/*Class FourthD is Child class of ThirdD
Inherits Features of Class FirstD,SecondD,ThirdD
"extends" keyword used to inherit class*/

class FourthD extends ThirdD{
	
	//DisplayD() method  for class FourthD
	void displayD() {
		
		System.out.println("Four");  // Prints Four
		
	}
}

//Public class MultiLevelInheritDemo is declared
public class MultiLevelInheritDemo {

	public static void main(String[] args) {
		
		//Object four is created using new keyword
		FourthD four = new FourthD();
				
		/* here Object two is used to call  displayA() and displayD()
		 * four.displayA(); calls Class FirstD
		 *four.displayB(); calls Class SecondD
		 *four.displayC(); calls Class ThirdD
		 *four.displayD; calls class FourthD*/
				four.displayA();
				four.displayB();
				four.displayC();
				four.displayD();

	}

}
