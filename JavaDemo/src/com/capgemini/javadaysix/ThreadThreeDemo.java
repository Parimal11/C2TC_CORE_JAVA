
package com.capgemini.javadaysix;

class EclipseTwo extends Thread{
	
	public void run()
	{
	    for (int i = 0; i < 4; i++) {
		System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
		System.out.println("Eclipse Thread ID is" + Thread.currentThread().getId());
	}
}
}

public class ThreadThreeDemo {

	
	public static void main(String[] args) {
		
		EclipseTwo e=new EclipseTwo();	
	    e.start();
	        
	    	    for (int i = 0; i < 4; i++) {
			System.out.println("Main Thread name is" + Thread.currentThread().getName());
			System.out.println("Main Thread ID is" + Thread.currentThread().getId());

		}

	}

}
