package com.java.day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHSetDemo {

	public static void main(String[] args) {
		Set names = new LinkedHashSet();
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
