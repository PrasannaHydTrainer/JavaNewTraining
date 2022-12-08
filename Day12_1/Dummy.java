package com.java.dxc;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Dummy {

	public static LocalDate leaveYesterday(Date startDate) {
		System.out.println(startDate.getYear()+1900);
		System.out.println(startDate.getMonth()+1);
		System.out.println(startDate.getDate());
		  LocalDate date1 = LocalDate.of(startDate.getYear()+1900, startDate.getMonth()+1, startDate.getDate());  
		  System.out.println(date1);
		LocalDate newDate = date1.minusDays(1);
		System.out.println(newDate);
		return  newDate;
	}
	
	public static void main(String[] args) {
		String sdate="2022-12-12";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			java.util.Date dt = sdf.parse(sdate);
			System.out.println(dt);
			System.out.println(java.sql.Date.valueOf(leaveYesterday(dt)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
