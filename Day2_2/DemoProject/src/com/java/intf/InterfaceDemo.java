package com.java.intf;

interface ITraining {
	void name();
	void email();
}

class JeethVyas implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is JeethVyas...");
	}

	@Override
	public void email() {
		System.out.println("Email is jeethvyas@gmail.com");
	}
	
}
class Gowthami implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Gowthami...");
	}

	@Override
	public void email() {
		System.out.println("Email is Gowthami@gmail.com");
	}
	
}
public class InterfaceDemo {
	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Gowthami(), new JeethVyas()	
		};
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}
