package com.java.day1;

public class StrArrayDemo {

	public void show() {
		String[] names = new String[] {
			"Anusha","Archit","Jyotshna","Surabhi",
			"Jitendra"
		};
		for (String s : names) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		StrArrayDemo obj = new StrArrayDemo();
		obj.show();
	}
}
