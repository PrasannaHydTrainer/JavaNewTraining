package com.dxc.lms;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeSearchMain {

	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Number    ");
		empno = sc.nextInt();
		EmployeeDAO dao = new EmployeeDAO();
		try {
			Employee employee = dao.searchEmployee(empno);
			if (employee!=null) {
				System.out.println(employee);				
			} else {
				System.out.println("*** Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
