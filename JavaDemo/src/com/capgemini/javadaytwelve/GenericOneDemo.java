package com.capgemini.javadaytwelve;

import java.util.LinkedList;
import java.util.List;

class First<T>
{
	
	private T variableOne;

	public First(T variableOne) {
		this.variableOne = variableOne;
	}

	public T getvariableOne() {
		return variableOne;
	}

	@Override
	public String toString() {
		return "Test [variableOne=" + variableOne + "]";
	}
	
	}

public class GenericOneDemo {

	public static void main(String[] args) {
		
		List<First<Object>> obj=new LinkedList<>();
		
		obj.add(new First<Object>("Welcome"));
		obj.add(new First<Object>("To Training"));
		obj.add(new First<Object>(10));
		obj.add(new First<Object>(20.5f));
		obj.add(new First<Object>("Java"));
		obj.add(new First<Object>(10.66));
		
		
		System.out.println(obj);

		

	}
}

