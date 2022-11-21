

package com.capegemini.javadayfive;


public class TwoDimensionalArrayDemo {


	public static void main(String[] args) {
		
		int elementsFirst[][] = new int [2][];
		
		int elementsSecond[][] = {{2,3,6,9},{1,4,5,7}};
		
		for(int i = 0;i < elementsSecond.length;i++) {
			
			for(int j = 0;j < elementsSecond[i].length;j++) {
				
				System.out.print(elementsSecond[i][j] + " ");
				
			}
			System.out.println();
		}

	}

}
