package com.java.day1;

public class Quiz2 {

	int x;
	public static void main(String[] args) {
		Quiz2 obj1 = new Quiz2();
		obj1.x=12;
		Quiz2 obj2 = obj1;
		obj2.x=13;
		System.out.println(obj1.x);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
