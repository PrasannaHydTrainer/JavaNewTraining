package com.java.abs;

public abstract class Student {

	static {
		System.out.println("Static Data...");
	}
	int sno;
	String name;
	double cgp;
	String city;

	public Student(int sno, String name, double cgp, String city) {
		this.sno = sno;
		this.name = name;
		this.cgp = cgp;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", cgp=" + cgp + ", city=" + city + "]";
	}
	
}
