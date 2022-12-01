package com.java.day4;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List numbers = new ArrayList();
		numbers.add(new Integer(42));
		numbers.add(new Integer(11));
		numbers.add(new Integer(32));
		numbers.add(new Integer(90));
		numbers.add(new Integer(34));
		int sum=0;
		for (Object ob : numbers) {
			sum+=(Integer)ob;
		}
		System.out.println("Sum is   " +sum);
	}
}
