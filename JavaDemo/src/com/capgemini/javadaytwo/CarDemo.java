//This is logic code for ConstructorDemo class 

package com.capgemini.javadaytwo;


public class CarDemo {
	
	
	private String doors;   //Private String variable doors is created
	private int speed;		//Private Integer variable speed is created
	
	//Uses getter to return door value
	//getDoors () method
	public String getDoors() {
		return doors;
	}
	
	//Uses setter to set doors value
	//setDoors() method
	public void setDoors(String doors) {
		
		this.doors = doors;
	}
	
	//Uses getter to return speed value
	//getSpeed() method
	public int getSpeed() {
		return speed;
	}
	
	//Uses setter to set speed value
	//setSpeed() method
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	//Parameterized Constructor CarDemo is Created
	public CarDemo(String doors, int speed) {
		
		this.doors = doors;
		this.speed = speed;
	}
	
	//Default Constructor CarDemo is created
	public CarDemo() {
		
		doors = "opened";
		speed = 0;
	}
	
	
	//run() checks weather car is running or not
	public String run() {
		if(doors.equals("closed") && speed >0 ) {
			return "running";
		}
		else 
			return "not running";
	
	}
}


