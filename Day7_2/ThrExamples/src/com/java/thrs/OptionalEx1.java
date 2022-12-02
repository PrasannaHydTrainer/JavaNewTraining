package com.java.thrs;

import java.util.Optional;

public class OptionalEx1 {

	public static void main(String[] args) {
		 String[] str = new String[10];
		 str[5]="Anusha";
	        Optional<String> checkNull = Optional.ofNullable(str[5]);
	        if (checkNull.isPresent()) {
	            System.out.println(str[5].toUpperCase());
	        } else {
	            System.out.println("String Value not Present");
	        }
	}
}
