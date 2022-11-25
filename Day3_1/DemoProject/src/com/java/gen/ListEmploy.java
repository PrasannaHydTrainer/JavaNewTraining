package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class ListEmploy {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Jyothi", 84823));
		employList.add(new Employ(2, "Archit", 90422));
		employList.add(new Employ(3, "Divya", 91334));
		employList.add(new Employ(4, "Gowthami", 89455));
		employList.add(new Employ(5, "JeethVyass", 80442));
		
		//employList.add(44);
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
