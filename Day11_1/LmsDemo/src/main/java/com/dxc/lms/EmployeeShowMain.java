package com.dxc.lms;

import java.sql.SQLException;
import java.util.List;

public class EmployeeShowMain {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> employeeList;
		try {
			employeeList = dao.showEmploy();
			for (Employee employee : employeeList) {
				System.out.println(employee);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
}
