package com.dxc.lms;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class LeaveHistoryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empno;
		System.out.println("Enter Employ Number    ");
		empno = sc.nextInt();
		try {
			List<LeaveHistory> history = new LeaveHistoryDAO().showLeaveHistory(empno);
			for (LeaveHistory leaveHistory : history) {
				System.out.println(leaveHistory);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
