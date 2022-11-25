package com.java.gen;

class Data<T> {
	public void swap(T a,T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value  " +a+ " B value  " +b);
	}
}

public class GenEx1 {
	public static void main(String[] args) {
		Data obj = new Data();
		int a=12, b=13;
		obj.swap(a, b);
		double a1=12.5, b1=13.5;
		obj.swap(a1, b1);
		String s1="Jagan", s2="Jenil";
		obj.swap(s1, s2);
		boolean v1=true, v2=false;
		obj.swap(v1, v2);
	}
}
