package com.java.cons;

public class Employ {

	int empno;
	String name;
	double basic;
	
	public Employ() {
		this.empno=1;
		this.name="Jenil";
		this.basic=83234;
	}
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	
}
