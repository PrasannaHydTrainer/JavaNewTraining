package com.java.cons;

public class Student {

	int sno;
	String sname;
	double cgp;
	String city;
	
	public Student() {
		this.sno=1;
		this.sname="Anusha";
		this.city="Vizag";
		this.cgp=8.3;
	}

	public Student(int sno, String sname, double cgp, String city) {
		this.sno = sno;
		this.sname = sname;
		this.cgp = cgp;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", cgp=" + cgp + ", city=" + city + "]";
	}
	
}
