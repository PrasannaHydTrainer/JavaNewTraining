package com.java.thrs;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Sabin");
		names.add("Sunny");
		names.add("Prem");
		names.add("Srikar");
		names.add("Rajiv");
		names.add("Anusha");
		names.add("Surabhi");
		names.add("Sindhu");
		System.out.println("Names are  ");
		names.forEach(x -> {
			System.out.println(x);
		});
	}
}
