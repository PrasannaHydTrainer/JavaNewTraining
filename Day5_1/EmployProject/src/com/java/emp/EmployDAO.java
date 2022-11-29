package com.java.emp;

import java.util.ArrayList;
import java.util.List;

public class EmployDAO {

	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
	}
	
	public String updateEmploy(Employ employNew) {
		Employ employOld = searchEmployDao(employNew.getEmpno());
		if (employOld!=null) {
			for (Employ employ : employList) {
				if (employ.getEmpno()==employNew.getEmpno()) {
					employ.setName(employNew.getName());
					employ.setDept(employNew.getDept());
					employ.setGender(employNew.getGender());
					employ.setDesig(employNew.getDesig());
					employ.setSalary(employNew.getSalary());
				}
				break;
			}
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}
	public String deleteEmployDao(int empno) {
		Employ employDelete = searchEmployDao(empno);
		if (employDelete !=null) {
			employList.remove(employDelete);
			return "Employ Record Deleted Successfully...";
		}
		return "Employ Record Not Found...";
	}
	
	public Employ searchEmployDao(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno()==empno) {
				employFound = employ;
				break;
			}
		}
		return employFound;
	}
	
	public List<Employ> showEmployDao() {
		return employList;
	}
	
	public String addEmployDao(Employ employ) {
		employList.add(employ);
		return "Employ Record Inserted...";
	}
}
