package com.java.day3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date obj = new Date();
		System.out.println(obj);
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		System.out.println(sdf.format(obj));
		sdf = new SimpleDateFormat("YYYY");
		System.out.println(sdf.format(obj));
	}
}
