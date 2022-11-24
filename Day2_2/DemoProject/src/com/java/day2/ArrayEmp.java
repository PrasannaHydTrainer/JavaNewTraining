package com.java.day2;


public class ArrayEmp {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.empno=1;
		e1.name="Anusha";
		e1.basic=38283;

		Emp e2 = new Emp();
		e2.empno=2;
		e2.name="Jenil";
		e2.basic=90433;

		Emp e3 = new Emp();
		e3.empno=3;
		e3.name="Jyothi";
		e3.basic=90423;

		Emp e4 = new Emp();
		e4.empno=4;
		e4.name="Kalyani";
		e4.basic=98333;

		Emp[] arr = new Emp[] {
			e1, e2, e3, e4	
		};
		
		for (Emp emp : arr) {
			System.out.println(emp);
		}
	}
}
