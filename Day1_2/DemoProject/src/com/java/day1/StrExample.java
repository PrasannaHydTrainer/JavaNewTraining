package com.java.day1;

public class StrExample {

	public void show() {
		String str = "Welcome to Java Programming...";
		System.out.println(str.replace("Java", "FullStack Java"));
		System.out.println("Length   " +str.length());
		System.out.println("First Occurrence of char 'o' is  " +str.indexOf("o"));
		System.out.println("Char at 5th position  " +str.charAt(5));
		System.out.println("Lower Case String  " +str.toLowerCase());
		System.out.println("Upper Case String   " +str.toUpperCase());
		String s1="Divya",s2="Jitendra",s3="Divya";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		String data = "Welcome,to,java,programming,trainer,prasanna";
		String[] test = data.split(",");
		for (String s : test) {
			System.out.println(s);
		}
	
		String[] names = new String[] {
				"Anusha","Archit","Jyotshna","Surabhi",
				"Jitendra"
			};
		String[] cpy = names;
		for (String s : cpy) {
			System.out.println(s);
		}
		
	}
	public static void main(String[] args) {
		StrExample obj = new StrExample();
		obj.show();
	}
}
