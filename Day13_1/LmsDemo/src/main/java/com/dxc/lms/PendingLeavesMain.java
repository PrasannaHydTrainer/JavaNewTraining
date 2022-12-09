package com.dxc.lms;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class PendingLeavesMain {

	public static void main(String[] args) {
		int empId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id   ");
		empId = sc.nextInt();
		try {
			List<LeaveHistory> pendingLeaves = new LeaveHistoryDAO().pendingLeaves(empId);
			for (LeaveHistory leaveHistory : pendingLeaves) {
				System.out.println(leaveHistory);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
