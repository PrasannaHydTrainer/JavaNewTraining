package com.java.day3;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		//Comparator c = new NameComparator();
		// Comparator c = new BasicComparator();
		Comparator c = new EmpnoComparator();
		SortedSet employs = new TreeSet(c);
		employs.add(new Employ(1, "Jyothi", 84823));
		employs.add(new Employ(12, "Archit", 90422));
		employs.add(new Employ(33, "Divya", 91334));
		employs.add(new Employ(14, "Gowthami", 89455));
		employs.add(new Employ(25, "JeethVyass", 80442));
		employs.add(new Employ(36, "Jayanth", 79442));
		employs.add(new Employ(24, "Surabhi", 89442));
		System.out.println("Employ Data  ");
		for (Object ob : employs) {
			System.out.println(ob);
		}
		
	}
}
