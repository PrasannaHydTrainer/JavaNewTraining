package com.java.day1;

public class Quiz3 {

	public static void main(String[] args) {
		int x=12;
		int y = x++ + ++x;
		    // 12 + 14
		System.out.println(y);
		x=12;
		y=x-- + --x;
		  // 12 + 10
		System.out.println(y);
		x=12;
		y=x++ + x++ + --x + ++x + ++x + x--;
		// 12 + 13 + 13 + 14 + 15 + 15
		System.out.println(y);
	}
}
