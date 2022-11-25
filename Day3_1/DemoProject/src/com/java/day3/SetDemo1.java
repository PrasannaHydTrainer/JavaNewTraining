package com.java.day3;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		Set names = new HashSet();
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
