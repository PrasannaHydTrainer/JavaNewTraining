package com.java.cons;

public class StaticNew {

	static int count;
	
	public void increment() {
		count++;
		System.out.println("Count is   " +count);
	}
	
	public static void main(String[] args) {
		
		StaticNew obj1 = new StaticNew();
		StaticNew obj2 = new StaticNew();
		StaticNew obj3 = new StaticNew();
		
		obj1.increment();
		obj2.increment();
		obj3.increment();
	}
}
