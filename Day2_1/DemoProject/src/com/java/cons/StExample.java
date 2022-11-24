package com.java.cons;

public class StExample {

	public void show() {
		System.out.println("Show Method...");
	}
	
	public static void display() {
		System.out.println("From Display Method...");
	}
	
	public static void main(String[] args) {
		StExample obj = new StExample();
		obj.show();
		StExample.display();
	}
}
