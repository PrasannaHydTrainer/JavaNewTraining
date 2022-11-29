package com.java.day5;

import java.io.Serializable;

public class Student implements Serializable {

	private int sno;
	private String name;
	private String city;
	private double cgp;
	
	public Student(int sno, String name, String city, double cgp) {
		this.sno = sno;
		this.name = name;
		this.city = city;
		this.cgp = cgp;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	
}
