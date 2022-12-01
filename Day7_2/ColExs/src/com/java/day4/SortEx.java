package com.java.day4;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEx {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Sabin");
		names.add("Sunny");
		names.add("Kiran");
		names.add("Venkatesh");
		names.add("Akhila");
		names.add("Pavani");
		names.add("Sahithi");
		names.add("Prem");
		names.add("Srikar");
		names.add("Rajiv");
		
		System.out.println("Sorted Data is   ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
