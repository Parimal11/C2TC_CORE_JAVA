
package com.capgemini.javadaysix;



class EclipseOne extends Thread{
	
	public void run()
	{
		System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
		System.out.println("Eclipse Thread ID is"+ Thread.currentThread().getId());

	}
}

class calculatorOne extends Thread
{
	public void run()
	{
		System.out.println("calculator Thread name is"+ Thread.currentThread().getName());
		System.out.println("calculator Thread ID is"+ Thread.currentThread().getId());

	}

}

class ChromeOne extends Thread{
	public void run()
	{
		System.out.println("Chrome Thread name is"+ Thread.currentThread().getName());
		System.out.println("Chrome Thread ID is"+ Thread.currentThread().getId());
	}
}

public abstract class ThreadDemoTwo {

	
	
	public static void main(String[] args) {
		EclipseOne e=new EclipseOne();	
	    e.start();
	    
	    calculatorOne c=new calculatorOne();	
	    c.start();
	
	    ChromeOne ch=new ChromeOne();	
	    ch.start();
	    
	   
	    
	    System.out.println("Main Thread name is"+ Thread.currentThread().getName());
		System.out.println("Main Thread ID is"+ Thread.currentThread().getId());

	}

}
