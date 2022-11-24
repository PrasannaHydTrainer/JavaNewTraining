package com.java.cons;

public class Cricket {

	static int totalScore;
	
	public void increment(int x) {
		totalScore+=x;
	}
	public static void main(String[] args) {
		Cricket fb = new Cricket();
		Cricket sb = new Cricket();
		Cricket ext = new Cricket();
		
		fb.increment(12);
		sb.increment(32);
		ext.increment(9);
		
		System.out.println(Cricket.totalScore);
	}
}
