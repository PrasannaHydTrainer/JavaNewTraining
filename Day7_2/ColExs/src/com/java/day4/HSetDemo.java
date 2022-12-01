package com.java.day4;

import java.util.HashSet;
import java.util.Set;

public class HSetDemo {
	public static void main(String[] args) {
		Set names = new HashSet();
		names.add("Sabin");
		names.add("Sunny");
		names.add("Prem");
		names.add("Srikar");
		names.add("Rajiv");
		names.add("Sabin");
		names.add("Sunny");
		names.add("Prem");
		names.add("Srikar");
		names.add("Rajiv");
		names.add("Sunny");
		names.add("Prem");
		names.add("Srikar");
		names.add("Rajiv");
		names.add("Sunny");
		names.add("Prem");
		names.add("Srikar");
		names.add("Rajiv");
		names.add("Sabin");
		names.add("Sunny");
		names.add("Prem");
		names.add("Srikar");
		names.add("Rajiv");
		names.add("Sabin");

		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
