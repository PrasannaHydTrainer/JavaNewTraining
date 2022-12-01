package com.java.thrs;


@FunctionalInterface
interface IDemo {
	int convert(int c);
}

public class FunctionalInterfaceEx1 {

	public static void main(String[] args) {
		IDemo obj1 = (c) -> {
			return c+273;
		};
		System.out.println(obj1.convert(27));
	}
}
