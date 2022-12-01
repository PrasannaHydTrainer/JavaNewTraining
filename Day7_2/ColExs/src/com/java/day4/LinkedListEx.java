package com.java.day4;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		names.add("Sabin");
		names.add("Sunny");
		names.add("Prem");
		names.add("Srikar");
		names.add("Rajiv");
		
		names.addFirst("Saikiran");
		names.addLast("Kishore");
		System.out.println("Names are   ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
