package com.java.day3;

import java.util.Comparator;

public class EmpnoComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employ e1 = (Employ)o1;
		Employ e2 = (Employ)o2;
		if (e1.empno >= e2.empno) {
			return 1;
		}
		return -1;
	}

}
