package com.java.ex;

public class ArrEx {
	public static void main(String[] args) {
		int[] a=new int[] {4,24};
		try {
			a[10]=42;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Size is Small...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
