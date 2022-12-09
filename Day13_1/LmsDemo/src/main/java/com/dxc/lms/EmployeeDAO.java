package com.dxc.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	Connection connection;
	PreparedStatement pst;
	
	public Employee searchEmployee(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employee where EMP_ID=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employee employee = null;
		if(rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("EMP_NAME"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setEmpMobNo(rs.getString("EMP_MOB_NO"));
			employee.setEmpDtJoin(rs.getDate("EMP_DT_JOIN"));
			employee.setEmpMgrId(rs.getInt("EMP_MANAGER_ID"));
			employee.setEmpAvailLeaveBal(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
			employee.setEmpDept(rs.getString("EMP_DEPT"));
		}
		return employee;
	}
	
	public List<Employee> showEmploy() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employee";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee employee = null;
		while(rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("EMP_NAME"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setEmpMobNo(rs.getString("EMP_MOB_NO"));
			employee.setEmpDtJoin(rs.getDate("EMP_DT_JOIN"));
			employee.setEmpMgrId(rs.getInt("EMP_MANAGER_ID"));
			employee.setEmpAvailLeaveBal(rs.getInt("EMP_MANAGER_ID"));
			employee.setEmpDept(rs.getString("EMP_DEPT"));
			employeeList.add(employee);
		}
		return employeeList;
	}
	
	
}
