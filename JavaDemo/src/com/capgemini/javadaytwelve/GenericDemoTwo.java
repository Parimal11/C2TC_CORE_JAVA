
package com.capgemini.javadaytwelve;

class Data<K,V>
{
	private K key;
	private V value;
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	public <E,N>void display(E element,N number)
	{
	System.out.println("Element:"+element+" "+"Number is"+number);
	}

}


public class GenericDemoTwo {

	public static void main(String[] args) {
		
		
		Data<Integer,String> obj=new Data<Integer,String>(15,"Sanket");
		System.out.println("Key is"+obj.getKey()+" Value is " +obj.getValue());
		
		obj.display(22,"Sanket");
		
		
	}

}

