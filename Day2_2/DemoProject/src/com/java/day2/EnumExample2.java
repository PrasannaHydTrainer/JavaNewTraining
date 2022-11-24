package com.java.day2;

enum OrderStatus {
	ACCEPTED, PENDING, REJECTED
}

public class EnumExample2 {

	public static void main(String[] args) {
		String status = "PENDING";
		OrderStatus ordStatus = OrderStatus.valueOf(status);
		System.out.println(ordStatus);
	}
}
