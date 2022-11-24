package com.java.day2;

public class StudentArray {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sno=1;
		s1.name="Jagan Mohan";
		s1.cgp=8.4;
		s1.city="Hyderabad";
		
		Student s2 = new Student();
		s2.sno=2;
		s2.name="Archit Suri";
		s2.cgp=9.0;
		s2.city="Delhi";
		
		Student s3 = new Student();
		s3.sno=3;
		s3.name="Divya Alagani";
		s3.cgp=9.9;
		s3.city="Vizag";
		
		Student s4 = new Student();
		s4.sno=4;
		s4.name="Jyoti Anumula";
		s4.cgp=9.3;
		s4.city="Vizag";
		
		Student[] arr = new Student[] {
			s1, s2, s3, s4	
		};
		for (Student s : arr) {
			System.out.println(s);
		}
	}
}
