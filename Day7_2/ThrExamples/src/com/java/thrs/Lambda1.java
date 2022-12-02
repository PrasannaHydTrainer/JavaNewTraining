package com.java.thrs;

interface IHello {
	void sayHello();
}

public class Lambda1 {
	public static void main(String[] args) {
		IHello obj1 = () -> {
			System.out.println("Welcome to JDK 1.8");
		};
		
		IHello obj2 = () -> {
			System.out.println("We are from DXC Technologies...");
		};
		
		IHello obj3 = () -> {
			System.out.println("Hi I am Prasanna Trainer...");
		};
		
		obj1.sayHello();
		obj2.sayHello();
		obj3.sayHello();
	}
}
