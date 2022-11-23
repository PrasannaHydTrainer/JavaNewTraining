package com.java.day1;

public class ArrayEx1 {

	public void show() {
		int[] a = new int[] {42,22,66,3,34};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		for (int i : a) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ArrayEx1 obj = new ArrayEx1();
		obj.show();
	}
}
