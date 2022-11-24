package com.java.abs;


abstract class Training {
	abstract void name();
	abstract void email();
}

class Archit extends Training {

	@Override
	void name() {
		System.out.println("Name is Archit...");
	}

	@Override
	void email() {
		System.out.println("Email is Archit@gmail.com");
	}
	
}

class Deepthi extends Training {

	@Override
	void name() {
		System.out.println("Name is Deepthi...");
	}

	@Override
	void email() {
		System.out.println("Email is deepthi@gmail.com");
	}
	
}

class Divya extends Training {

	@Override
	void name() {
		System.out.println("Name is Divya...");
	}

	@Override
	void email() {
		System.out.println("Email is divya@gmail.com");
	}
	
}

public class AbsDemo {
	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Divya(),
			new Deepthi(),
			new Archit()
		};
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
