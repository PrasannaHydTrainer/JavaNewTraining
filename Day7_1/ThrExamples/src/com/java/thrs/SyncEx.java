package com.java.thrs;

class Demo {
	synchronized void dispMsg(String name) {
		System.out.print("Hello   " +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" How are u...");
	}
}

class Srividya extends Thread {
	
	Demo demo;
	
	Srividya(Demo demo) {
		this.demo = demo;
	}
	
	@Override
	public void run() {
		demo.dispMsg("Srividya");
	}
}

class Jenil extends Thread {

	Demo demo;
	
	Jenil(Demo demo) {
		this.demo = demo;
	}
	
	@Override
	public void run() {
		demo.dispMsg("Jenil");
	}
}

class Anusha extends Thread {
	Demo demo;
	
	Anusha(Demo demo) {
		this.demo = demo;
	}
	
	@Override
	public void run() {
		demo.dispMsg("Anusha");
	}
}

public class SyncEx {

	public static void main(String[] args) {
		Demo demo = new Demo();
		Anusha anusha = new Anusha(demo);
		Jenil jenil = new Jenil(demo);
		Srividya srividya = new Srividya(demo);
		
		Thread t1 = new Thread(anusha);
		Thread t2 = new Thread(jenil);
		Thread t3 = new Thread(srividya);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
