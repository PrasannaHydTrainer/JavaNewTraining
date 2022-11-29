package com.java.emp;

import java.util.List;

public class EmployBAL {

	static StringBuilder sb;
	static EmployDAO dao;
	
	static {
		sb = new StringBuilder();
		dao = new EmployDAO();
	}
	
	public String deleteEmployBal(int empno) {
		return dao.deleteEmployDao(empno);
	}
	
	public List<Employ> showEmployBal() {
		return dao.showEmployDao();
	}
	
	public Employ searchEmployBal(int empno) {
		return dao.searchEmployDao(empno);
	}
	
	public String addEmployBal(Employ employ) throws EmployException {
		if (isValid(employ)==true) {
			return dao.addEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
	
	public String updateEmployBal(Employ employ) throws EmployException {
		if (isValid(employ)==true) {
			return dao.updateEmploy(employ);
		}
		throw new EmployException(sb.toString());
	}
	public boolean isValid(Employ employ) {
		
		boolean flag=true;
		
		if (employ.getEmpno() <= 0) {
			sb.append("Employ No Cannot be zero or Negative...\n");
			flag=false;
		}
		
		if (employ.getName().length() < 5) {
			sb.append("Employ Name contains min. 5 characters...\n");
			flag=false;
		}
		
		if (employ.getDept().length() < 3) {
			sb.append("Employ Dept. Contains min. 3 characters...\n");
			flag=false;
		}
		
		if (employ.getDesig().length() < 4) {
			sb.append("Employ Desig Contains Min. 4 characters...\n");
			flag=false;
		}
		if (employ.getSalary() < 10000 || employ.getSalary() > 90000) {
			sb.append("Employ Salary must be between 10000 and 90000...\n");
			flag=false;
		}
		return flag;
	}
}
