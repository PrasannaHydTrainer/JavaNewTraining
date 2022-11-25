package com.java.day3;

import java.util.ArrayList;
import java.util.List;

public class ListEmploy {

	public static void main(String[] args) {
		List employs = new ArrayList();
		employs.add(new Employ(1, "Jyothi", 84823));
		employs.add(new Employ(2, "Archit", 90422));
		employs.add(new Employ(3, "Divya", 91334));
		employs.add(new Employ(4, "Gowthami", 89455));
		employs.add(new Employ(5, "JeethVyass", 80442));
		
		for (Object object : employs) {
			System.out.println(object);
		}
	}
}
