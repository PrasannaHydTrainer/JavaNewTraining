package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenList1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Anusha");
		names.add("Asha");
		names.add("Jenil");
		names.add("Surabhi");
		names.add("Jagan");
	//	names.add(12);
		System.out.println("Names are ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
