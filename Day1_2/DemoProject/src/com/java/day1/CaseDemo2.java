package com.java.day1;

public class CaseDemo2 {

	public void show(String dayName) {
		switch(dayName) {
		case "Sunday" :
			System.out.println("Its Sunday...");
			break;
		case "Monday" : 
			System.out.println("Its Monday...");
			break;
		case "Tuesday" : 
			System.out.println("Its Tuesday...");
			break;
		case "Wednesday" : 
			System.out.println("Its Wednesday...");
			break;
		case "Thursday" : 
			System.out.println("Its Thursday...");
			break;
		case "Friday" : 
			System.out.println("Its Friday...");
			break;
		case "Saturday" : 
			System.out.println("Its Saturday...");
			break;
		default : 
			System.out.println("Invalid value...");
		}
	}
	public static void main(String[] args) {
		String dayName = "Monday";
		CaseDemo2 obj = new CaseDemo2();
		obj.show(dayName);
	}
}
