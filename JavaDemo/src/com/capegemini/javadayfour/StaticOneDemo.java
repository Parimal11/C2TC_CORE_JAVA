package com.capegemini.javadayfour;

public class StaticOneDemo {

	int side;
	static int objectCount=0;
	
	StaticOneDemo(){
	
		objectCount++;
	}
	
	StaticOneDemo(int x){
	
		side=x;
		objectCount++;
		}
	
	public static void main(String[] args) {
	
		StaticOneDemo c1=new StaticOneDemo();
		StaticOneDemo c2=new StaticOneDemo(5);
		StaticOneDemo c3=new StaticOneDemo(8);
		StaticOneDemo c4=new StaticOneDemo(10);
		StaticOneDemo c5=new StaticOneDemo(11);
		System.out.println("Number of Cube Objects: "+objectCount);

	}

}
