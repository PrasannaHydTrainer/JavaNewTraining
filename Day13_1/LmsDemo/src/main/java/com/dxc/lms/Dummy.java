package com.dxc.lms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dummy {

	public static void main(String[] args) {
		String s1="2022-12-12";
		String s2="2022-12-13";
		
		try {
			Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(s1);
			Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(s2);
			int day1 = d1.getDay();
			int day2 = d2.getDay();
			System.out.println((day2-day1)+1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
