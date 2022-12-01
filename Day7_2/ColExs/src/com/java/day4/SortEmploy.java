package com.java.day4;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		// Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet employList = new TreeSet(c);
		employList.add(new Employ(1, "Sabin", 88324));
		employList.add(new Employ(2, "Naren", 90833));
		employList.add(new Employ(3, "Srikar", 98321));
		employList.add(new Employ(4, "Javed", 90211));
		employList.add(new Employ(5, "Lalith", 92213));
		employList.add(new Employ(6, "Krishna", 89044));
		System.out.println("Employ List is  ");
		for (Object ob : employList) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
