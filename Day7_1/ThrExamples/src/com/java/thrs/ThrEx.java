package com.java.thrs;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

class C3 implements Runnable {

	@Override
	public void run() {
		Vector<String> names = new Vector<String>();
		names.add("Sabin");
		names.add("Sunny");
		names.add("Prem");
		names.add("Srikar");
		names.add("Rajiv");
		names.add("Anusha");
		names.add("Surabhi");
		names.add("Sindhu");
		for (String s : names) {
			System.out.println("Vector Data is   " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class C2 implements Runnable {

	@Override
	public void run() {
		SortedSet<String> names = new TreeSet<String>();
		names.add("Sabin");
		names.add("Sunny");
		names.add("Prem");
		names.add("Srikar");
		names.add("Rajiv");
		names.add("Anusha");
		names.add("Surabhi");
		names.add("Sindhu");
		for (String s : names) {
			System.out.println("TreeSet   " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class C1 implements Runnable {
	@Override
	public void run() {
		List<String> names= new ArrayList<String>();
		names.add("Sabin");
		names.add("Sunny");
		names.add("Prem");
		names.add("Srikar");
		names.add("Rajiv");
		names.add("Anusha");
		names.add("Surabhi");
		names.add("Sindhu");
		for (String s : names) {
			System.out.println("ArrayList  " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class ThrEx {

	public static void main(String[] args) {
		Thread t1 = new Thread(new C1());
		Thread t2 = new Thread(new C2());
		Thread t3 = new Thread(new C3());
		
		
		t1.start();
		t2.start();
		t3.start();
	}
}
