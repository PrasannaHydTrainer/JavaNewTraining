package com.java.day3;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("Anusha");
		linkedList.add("Jenil");
		linkedList.add("Kalyani");
		linkedList.add(3, "Sindhu");
		linkedList.add("Sai");
		linkedList.add("Srividya");
		linkedList.add("Swetha");
		
		System.out.println("Linked List Data  ");
		for (Object ob : linkedList) {
			System.out.println(ob);
		}
		
		linkedList.addFirst("Kalpana");
		linkedList.addLast("Jithendra");
		System.out.println("Linked List Data  ");
		for (Object object : linkedList) {
			System.out.println(object);
		}
		
	}
}
