//This is code for Demo class which uses getter and setter for setting and taking values

package com.capgemini.javadaytwo;

public class Demo{
	
	
	private String doors;     //Private String variable doors is created
	private int speed;        //Private Integer variable speed is created
	
	
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
	
	//run() checks weather car is running or not
	public String run() {
		if(doors.equals("closed") && speed >0 ) {
			return "running";
		}
		else 
			return "not running";
		
	}
}
