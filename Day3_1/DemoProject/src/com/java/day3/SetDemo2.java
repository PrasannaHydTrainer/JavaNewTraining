package com.java.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		Set names = new LinkedHashSet();
		names.add("Jithendra");
		names.add("Kalyani");
		names.add("Sindhu");
		names.add("Jhansi");
		names.add("Divya");
		names.add("Jithendra");
		names.add("Kalyani");
		names.add("Sindhu");
		names.add("Jhansi");
		names.add("Jithendra");
		names.add("Kalyani");
		names.add("Sindhu");
		names.add("Jhansi");
		names.add("Kalyani");
		names.add("Sindhu");
		names.add("Jhansi");
		names.add("Divya");
		names.add("Kalyani");
		names.add("Sindhu");
		names.add("Jhansi");
		names.add("Divya");
		names.add("Kalyani");
		names.add("Sindhu");
		names.add("Jhansi");
		names.add("Divya");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
