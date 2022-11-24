package com.java.day2;

enum WeekDays {
	MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample1 {

	public static void main(String[] args) {
		WeekDays wd = WeekDays.FRIDAY;
		System.out.println(wd);
	}
}
