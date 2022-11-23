package com.java.day1;

public class ForLoopEx1 {

	public void show(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("Welcome to Java...");
		}
	}
	public static void main(String[] args) {
		int n=20;
		ForLoopEx1 obj = new ForLoopEx1();
		obj.show(n);
	}
}
