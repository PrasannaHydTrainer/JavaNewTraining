package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckedEx {

	// convert String to date 
	
	public void convert(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = sdf.parse(date);
		System.out.println(dt);
	}
	public static void main(String[] args) {
		String date = "2022-11-28";
		CheckedEx obj = new CheckedEx();
		try {
			obj.convert(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
