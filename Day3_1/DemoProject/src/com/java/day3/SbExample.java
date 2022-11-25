package com.java.day3;

public class SbExample {

	public static void main(String[] args) {
		String str = "Hello";
		str.concat(" World");
		System.out.println(str);
		StringBuilder sb = new StringBuilder("Welcome to Java...");
		System.out.println(sb);
		sb.append("\n This is New Content...");
		System.out.println(sb);
		sb.insert(10, "Asha Devu");
		System.out.println(sb);
		sb.delete(10, 15);
		System.out.println(sb);
		sb.replace(10,15, "Jenil");
		System.out.println(sb);
	}
}
