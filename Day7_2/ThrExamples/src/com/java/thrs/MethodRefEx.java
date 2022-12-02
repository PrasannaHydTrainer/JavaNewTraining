package com.java.thrs;

@FunctionalInterface
interface ITest {
	void show();
}

public class MethodRefEx {

	public void display() {
		System.out.println("Welcome to java programming...");
	}
	
	public static void main(String[] args) {
		MethodRefEx obj = new MethodRefEx();
		ITest t1 = obj::display;
		t1.show();
	}
}
