package com.java.day1;

public class VarArgs {

	public void show(String...names) {
		for (String s : names) {
			System.out.print(s + "  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		VarArgs obj = new VarArgs();
		obj.show();
		obj.show("Jhansi");
		obj.show("Jhansi","Jenil","Swetha");
		obj.show("Hema","Swetha","Jitendra","Surabhi");
	}
}
