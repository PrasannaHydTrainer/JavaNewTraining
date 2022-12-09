package com.dxc.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaveHistoryDAO {

	Connection connection;
	PreparedStatement pst;
	
	public List<LeaveHistory> pendingLeaves(int empId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from leave_history where LEAVE_STATUS='PENDING' AND "
				+ " emp_id In(select emp_id from employee where emp_manager_Id=?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs = pst.executeQuery();
		List<LeaveHistory> leaveHistoryList = new ArrayList<LeaveHistory>();
		LeaveHistory leaveHistory = null;
		while(rs.next()) {
			leaveHistory = new LeaveHistory();
			leaveHistory.setLeaveId(rs.getInt("LEAVE_ID"));
			leaveHistory.setEmpId(rs.getInt("EMP_ID"));
			leaveHistory.setLeaveNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
			leaveHistory.setLeaveManagerComments(rs.getString("LEAVE_MNGR_COMMENTS"));
			leaveHistory.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
			leaveHistory.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
			leaveHistory.setLeaveType(LeaveType.valueOf(rs.getString("LEAVE_TYPE")));
			leaveHistory.setLeaveStatus(LeaveStatus.valueOf(rs.getString("LEAVE_STATUS")));
			leaveHistory.setLeaveReason(rs.getString("LEAVE_REASON"));
			leaveHistoryList.add(leaveHistory);
		}
		return leaveHistoryList;
	}
	
	public String acceptOrReject(int leaveId, int managerId, String status, String mgrComments) throws ClassNotFoundException, SQLException {
		LeaveHistory leaveHistory = searchByLeaveId(leaveId);
		Employee employee = new EmployeeDAO().searchEmployee(leaveHistory.getEmpId());
		int mgrId = employee.getEmpMgrId();
		if (managerId!=mgrId) {
			return "You are unauthorized Manager...";
		}
		if (status.toUpperCase().equals("YES")) {
			String cmd = "update leave_history set LEAVE_STATUS='APPROVED', LEAVE_MNGR_COMMENTS=? WHERE LEAVE_ID=?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setString(1, mgrComments);
			pst.setInt(2, leaveId);
			pst.executeUpdate();
			return "Leave Approved...";
		} else {
			String cmd = "update leave_history set LEAVE_STATUS='DENIED', LEAVE_MNGR_COMMENTS=? WHERE LEAVE_ID=?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setString(1, mgrComments);
			pst.setInt(2, leaveId);
			pst.executeUpdate();
			cmd = "Update Employee set EMP_AVAIL_LEAVE_BAL=EMP_AVAIL_LEAVE_BAL+? where EMP_ID=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, leaveHistory.getLeaveNoOfDays());
			pst.setInt(2, leaveHistory.getEmpId());
			pst.executeUpdate();
			return "Leave Rejected...Balance Updated...";
		}
	}

	public LeaveHistory searchByLeaveId(int leaveId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from leave_history where LEAVE_ID=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leaveId);
		ResultSet rs = pst.executeQuery();
		LeaveHistory leaveHistory = null;
		if(rs.next()) {
			leaveHistory = new LeaveHistory();
			leaveHistory.setLeaveId(rs.getInt("LEAVE_ID"));
			leaveHistory.setEmpId(rs.getInt("EMP_ID"));
			leaveHistory.setLeaveNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
			leaveHistory.setLeaveManagerComments(rs.getString("LEAVE_MNGR_COMMENTS"));
			leaveHistory.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
			leaveHistory.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
			leaveHistory.setLeaveType(LeaveType.valueOf(rs.getString("LEAVE_TYPE")));
			leaveHistory.setLeaveStatus(LeaveStatus.valueOf(rs.getString("LEAVE_STATUS")));
			leaveHistory.setLeaveReason(rs.getString("LEAVE_REASON"));
		}
		return leaveHistory;
	}

	
	public List<LeaveHistory> showLeaveHistory(int empId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from leave_history where emp_id=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs = pst.executeQuery();
		List<LeaveHistory> leaveHistoryList = new ArrayList<LeaveHistory>();
		LeaveHistory leaveHistory = null;
		while(rs.next()) {
			leaveHistory = new LeaveHistory();
			leaveHistory.setLeaveId(rs.getInt("LEAVE_ID"));
			leaveHistory.setEmpId(rs.getInt("EMP_ID"));
			leaveHistory.setLeaveNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
			leaveHistory.setLeaveManagerComments(rs.getString("LEAVE_MNGR_COMMENTS"));
			leaveHistory.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
			leaveHistory.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
			leaveHistory.setLeaveType(LeaveType.valueOf(rs.getString("LEAVE_TYPE")));
			leaveHistory.setLeaveStatus(LeaveStatus.valueOf(rs.getString("LEAVE_STATUS")));
			leaveHistory.setLeaveReason(rs.getString("LEAVE_REASON"));
			leaveHistoryList.add(leaveHistory);
		}
		return leaveHistoryList;
	}
	
	public String applyLeave(LeaveHistory leaveHistory) throws ClassNotFoundException, SQLException {
		
		connection = ConnectionHelper.getConnection();
		int noOfDays;
		leaveHistory.setLeaveStatus(LeaveStatus.PENDING);

		long ms = leaveHistory.getLeaveEndDate().getTime() - leaveHistory.getLeaveStartDate().getTime();
		System.out.println(ms);
		noOfDays = (int)( (ms)/(1000 * 60 * 60 * 24));
		noOfDays++;
		Employee employee = new EmployeeDAO().searchEmployee(leaveHistory.getEmpId());
		
		int leaveAvail = employee.getEmpAvailLeaveBal();
		
		int difference = leaveAvail - noOfDays;
		
		System.out.println("Leave Avail  " +leaveAvail);
		System.out.println(noOfDays);
		System.out.println("Differnce  " +difference);

		Date today = new Date();
		
		java.sql.Date sqlToday = new java.sql.Date(today.getTime());
		
		long diff = leaveHistory.getLeaveStartDate().getTime() - sqlToday.getTime();
		int days = (int) (diff)/(1000*60*60*24);
		days++;
		if (days <= 0) {
			return "Leave-Start Date cannot be Yesterday's Date";
		} else if (difference < 0) {
			return "Insufficient Leave Balance...";
		}
		
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
