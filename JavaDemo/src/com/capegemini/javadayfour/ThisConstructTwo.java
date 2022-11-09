/*This Program Demonstrates use of this keyword to invoke current class constructor in java
 * 
 */

package com.capegemini.javadayfour;



public class ThisConstructTwo {

	int rollno;
	String name,course;
	float fee;
	
	ThisConstructTwo(int rollno,String name,String course){
	
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	
	ThisConstructTwo(int rollno,String name,String course,float fee){
	
		this(rollno,name,course);//reusing constructor
		this.fee=fee;
	}
	
	void display(){
	
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
	public static void main(String[] args) {
		ThisConstructTwo s1=new ThisConstructTwo(111,"ankit","java");
		ThisConstructTwo s2=new ThisConstructTwo(112,"sumit","java",6000f);
		s1.display();
		s2.display();

	}

}
