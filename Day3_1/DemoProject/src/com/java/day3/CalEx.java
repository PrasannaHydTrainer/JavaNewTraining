package com.java.day3;

import java.text.DateFormatSymbols;

public class CalEx {

	public static void main(String[] args) {
		 // Inbuilt function to invoke weekdays by creating
        // an object of DateFormatSymbols
        String[] week_days
            = new DateFormatSymbols().getWeekdays();
 
        // Computing length to get end bound
        // for iteration
        int length = week_days.length;
 
        // Loop is started with 2 because 0th day is
        // saturday and 1st day is sunday
        for (int d = 2; d < (length - 1); d++) {
 
            // Iterating over the string array of weekdays
            // to get respective names
            String day = week_days[d];
 
            // Printing ith index weekday
            System.out.println((d - 1) + "th weekday - "
                               + day);
        }
    }
	
}
