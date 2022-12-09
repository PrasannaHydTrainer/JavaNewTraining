package com.dxc.lms;

import java.sql.SQLException;
import java.util.Scanner;

public class ApproveDenyMain {

	public static void main(String[] args) {
		int empno, leaveId;
		String status, mgrComments;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Leave Id");
		leaveId = sc.nextInt();
		System.out.println("Enter Manager Id   ");
		empno = sc.nextInt();
		System.out.println("Enter Status (YES/NO)  ");
		status = sc.next();
		System.out.println("Enter Manager Comments   ");
		mgrComments = sc.next();
		LeaveHistoryDAO dao = new LeaveHistoryDAO();
		try {
			System.out.println(dao.acceptOrReject(leaveId, empno, status, mgrComments));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
