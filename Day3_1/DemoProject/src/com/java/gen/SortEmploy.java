package com.java.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		Comparator<Employ> c = new NameComparator();
	//	Set<Employ> employList = new TreeSet<Employ>(c);
		SortedSet<Employ> employList = new TreeSet<Employ>(c);
		employList.add(new Employ(1, "Jyothi", 84823));
		employList.add(new Employ(12, "Archit", 90422));
		employList.add(new Employ(33, "Divya", 91334));
		employList.add(new Employ(14, "Gowthami", 89455));
		employList.add(new Employ(25, "JeethVyass", 80442));
		employList.add(new Employ(36, "Jayanth", 79442));
		employList.add(new Employ(24, "Surabhi", 89442));
		System.out.println("Employ Data  ");
		for (Object ob : employList) {
			System.out.println(ob);
		}
	}
}
