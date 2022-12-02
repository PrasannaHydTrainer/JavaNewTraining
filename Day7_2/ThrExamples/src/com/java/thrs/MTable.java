package com.java.thrs;

class Tab3 implements Runnable  {
	TableEx tableEx;
	Tab3(TableEx tableEx) {
		this.tableEx = tableEx;
	}
	@Override
	public void run() {
		tableEx.show(5);
	}
}


class Tab1 implements Runnable  {
	TableEx tableEx;
	Tab1(TableEx tableEx) {
		this.tableEx = tableEx;
	}
	@Override
	public void run() {
		tableEx.show(12);
	}
}

class Tab2 implements Runnable  {
	TableEx tableEx;
	Tab2(TableEx tableEx) {
		this.tableEx = tableEx;
	}
	@Override
	public void run() {
		tableEx.show(13);
	}
}


class TableEx {
	synchronized public void show(int n) {
		int p;
		for(int i=1;i<=10;i++) {
			p = n*i;
			System.out.println(n + " *  " +i+ " =  " +p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MTable {
	
	public static void main(String[] args) {
		
		TableEx obj = new TableEx();
		Tab1 tab1 = new Tab1(obj);
		Tab2 tab2 = new Tab2(obj);
		Tab3 tab3 = new Tab3(obj);
		
		Thread t1 = new Thread(tab1);
		Thread t2 = new Thread(tab2);
		Thread t3 = new Thread(tab3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
