package com.java.day3;

import java.util.Calendar;

public class CalEx1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println("Todays Date  " +cal.get(Calendar.DATE));
		int month =cal.get(Calendar.MONTH);
		month++;
		System.out.println("Month  " + month);
	}
}
