package com.java.day3;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Anusha");
		names.add("Asha");
		names.add("Jenil");
		names.add("Surabhi");
		names.add("Jagan");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.add(3, "Jayanth");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.remove(2);
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.remove("Jagan");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
