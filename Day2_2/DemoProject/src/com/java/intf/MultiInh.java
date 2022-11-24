package com.java.intf;

interface IOne {
	void name();
}

interface ITwo {
	void email();
}

class Demo implements IOne, ITwo {

	@Override
	public void email() {
		System.out.println("Email is Jhansi@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Name is Jhansi...");
	}
	
}
public class MultiInh {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.name();
		obj.email();
	}
}
