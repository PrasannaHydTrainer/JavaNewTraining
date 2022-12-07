package com.dxc.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LeaveHistoryDAO {

	Connection connection;
	PreparedStatement pst;
	
	public String applyLeave(LeaveHistory leaveHistory) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		int noOfDays;
		leaveHistory.setLeaveStatus(LeaveStatus.PENDING);
		long ms = leaveHistory.getLeaveEndDate().getTime() - leaveHistory.getLeaveStartDate().getTime();
		System.out.println(ms);
		noOfDays = (int)( (ms)/(1000 * 60 * 60 * 24));
		noOfDays++;
		System.out.println(noOfDays);
		String cmd = "Insert into Leave_History(LEAVE_NO_OF_DAYS,EMP_ID,LEAVE_START_DATE,"
				+ "LEAVE_END_DATE,LEAVE_TYPE,LEAVE_STATUS,LEAVE_REASON) values(?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, noOfDays);
		pst.setInt(2, leaveHistory.getEmpId());
		pst.setDate(3, leaveHistory.getLeaveStartDate());
		pst.setDate(4, leaveHistory.getLeaveEndDate());
		pst.setString(5, leaveHistory.getLeaveType().toString());
		pst.setString(6, leaveHistory.getLeaveStatus().toString());
		pst.setString(7, leaveHistory.getLeaveReason());
		pst.executeUpdate();
		cmd = "Update Employee set EMP_AVAIL_LEAVE_BAL=EMP_AVAIL_LEAVE_BAL-? Where EMP_ID=?";
		
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, noOfDays);
		pst.setInt(2, leaveHistory.getEmpId());
		pst.executeUpdate();
		return "Leave Applied Successfully...";
	}
}
