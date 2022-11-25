package com.java.day3;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Jithendra");
		names.add("Kalyani");
		names.add("Sindhu");
		names.add("Jhansi");
		names.add("Divya");
		names.add("Archit");
		names.add("Jayanth");
		names.add("Gowthami");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
