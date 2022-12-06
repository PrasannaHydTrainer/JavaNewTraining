package com.java.dxc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDAO {

	Connection connection;
	PreparedStatement pst;
	
	public String updateEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		Employ employFound = searchEmploy(employ.getEmpno());
		if (employFound !=null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "Update Employ Set Name=?, Gender=?, Dept=?, Desig=?, Basic=? "
					+ " WHERE Empno=?";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, employ.getName());
			System.out.println(employ);
			pst.setString(2, employ.getGender().toString());
			pst.setString(3, employ.getDept());
			pst.setString(4, employ.getDesig());
			pst.setDouble(5, employ.getBasic());
			pst.setInt(6, employ.getEmpno());
			System.out.println(pst.executeUpdate());
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}
	
	public String deleteEmploy(int empno) throws ClassNotFoundException, SQLException {
		Employ employFound = searchEmploy(empno);
		if (employFound !=null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "Delete From Employ where empno=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.executeUpdate();
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}
	
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Employ(Empno,name,gender,dept,desig,basic)  "
				+ " values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, employ.getEmpno());
		pst.setString(2, employ.getName());
		pst.setString(3, employ.getGender().toString());
		pst.setString(4, employ.getDept());
		pst.setString(5, employ.getDesig());
		pst.setDouble(6, employ.getBasic());
		pst.executeUpdate();
		return "Employ Record Inserted...";
	}
	
	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		if (rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));			
		}
		return employ;
	}
	
	public List<Employ> showEmploy() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ = null;
		while(rs.next()) {
			employ =new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employList;
	}
}
