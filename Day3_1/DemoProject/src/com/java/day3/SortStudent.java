package com.java.day3;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		Comparator c = new CityComparator();
		SortedSet students = new TreeSet(c);
		students.add(new Student(1, "Jagan", "Hyderabad", 9.3));
		students.add(new Student(2, "Jasjeet", "Chennai", 8.9));
		students.add(new Student(3, "Gowthami", "Bangalore", 9.5));
		students.add(new Student(4, "Anusha", "Chennai", 7.9));
		students.add(new Student(5, "Rajshree", "Vizag", 8.3));
		students.add(new Student(6, "Divya", "Hyderabad", 8.9));
		System.out.println("Students are  ");
		for (Object ob : students) {
			Student student = (Student)ob;
			System.out.println(student);
		}
	}
}
