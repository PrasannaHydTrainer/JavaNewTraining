package com.java.abs;

public class AbsCon {

	public static void main(String[] args) {
		Student[] arr = new Student[] {
			new Rajsree(1, "Rajsree", 9.3, "Hyderabad"),
			new Jeevan(3, "Jeevan", 7.8, "Chennai")
		};
		for (Student student : arr) {
			System.out.println(student);
		}
	}
}
