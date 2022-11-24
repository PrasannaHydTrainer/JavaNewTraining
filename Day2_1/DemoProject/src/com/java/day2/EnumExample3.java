package com.java.day2;

enum LeaveType {
	EL, PL, ML
}

public class EnumExample3 {

	public static void main(String[] args) {
		LeaveType leaveType = LeaveType.EL;
		System.out.println(leaveType);
		LeaveStatus leaveStatus = LeaveStatus.PENDING;
	}
}
