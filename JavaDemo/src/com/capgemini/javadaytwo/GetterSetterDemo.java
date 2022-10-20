//This program demonstrates use of getter and setter

package com.capgemini.javadaytwo;

class Car{
	private String doors; //Private String variable doors is created
	private String engine; //Private String variable engine is created
	private String driver; //Private String variable driver is created
	private int speed; 		//Private Integer variable doors is created
	
	//Getter is used here
	public int getSpeed() {
		return speed;
	}
	
	//Setter is used here
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}


public class GetterSetterDemo {

	public static void main(String[] args) {

		//Object car is created
		Car car = new Car();
		
		//car.setSpeed(10) sets speed of car to 10
		car.setSpeed(10);
		
		//Prints speed of car using car.getSpeed() method
		System.out.println(car.getSpeed());

	}

}
