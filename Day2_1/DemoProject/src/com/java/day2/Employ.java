package com.java.day2;

public class Employ {

	int empno;
	String name;
	double basic;
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

	public static void main(String[] args) {
		Employ employ1 = new Employ();
		employ1.empno=1;
		employ1.name="Surabhi";
		employ1.basic=83244;
		
		System.out.println(employ1);
	}
}
