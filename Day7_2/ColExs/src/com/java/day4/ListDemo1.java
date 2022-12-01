package com.java.day4;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Sabin");
		names.add("Sunny");
		names.add("Prem");
		names.add("Srikar");
		names.add("Rajiv");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
