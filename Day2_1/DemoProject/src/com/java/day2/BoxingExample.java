package com.java.day2;

public class BoxingExample {

	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String str="Welcome";
		
		/* Implement Boxing */
		
		Object ob1=a;
		Object ob2=b;
		Object ob3=str;
		
		/* Implement Unboxing */
		
		int a1 = (Integer)ob1;
		double b1 = (Double)ob2;
		String s1 = (String)ob3;
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(s1);
	}
}
