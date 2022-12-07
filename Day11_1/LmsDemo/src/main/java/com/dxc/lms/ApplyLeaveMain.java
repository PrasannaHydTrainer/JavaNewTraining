package com.dxc.lms;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ApplyLeaveMain {

	public static void main(String[] args) {
		LeaveHistory leaveHistory = new LeaveHistory();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Id   ");
		leaveHistory.setEmpId(sc.nextInt());
		System.out.println("Enter Leave Start-Date (yyyy-MM-dd)  ");
		String sdate = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d1 = sdf.parse(sdate);
			java.sql.Date sd1 = new java.sql.Date(d1.getTime());
			leaveHistory.setLeaveStartDate(sd1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter Leave End-Date (yyyy-MM-dd)  ");
		String edate = sc.next();
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d1 = sdf.parse(edate);
			java.sql.Date sd1 = new java.sql.Date(d1.getTime());
			leaveHistory.setLeaveEndDate(sd1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter LeaveType  (EL) ");
		leaveHistory.setLeaveType(LeaveType.valueOf(sc.next()));
		System.out.println("Enter Leave Reason  ");
		leaveHistory.setLeaveReason(sc.next());
		LeaveHistoryDAO dao = new LeaveHistoryDAO();
		try {
			System.out.println(dao.applyLeave(leaveHistory));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
