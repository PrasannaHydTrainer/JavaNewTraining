package com.java.thrs;

import java.util.Scanner;

interface ICalc {
	int calc(int a, int b);
}

public class Lambda2 {
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Numbers   ");
		x=sc.nextInt();
		y=sc.nextInt();
		
		ICalc obj1 = (a, b) -> {
			return a+b;
		};
		
		ICalc obj2 = (a, b) -> {
			return a-b;
		};
		
		ICalc obj3 = (a, b) -> {
			return a* b;
		};
		
		System.out.println("Sum is   " +obj1.calc(x, y));
		System.out.println("Sub is   " +obj2.calc(x, y));
		System.out.println("Mult is  " +obj3.calc(x, y));
	}
}
