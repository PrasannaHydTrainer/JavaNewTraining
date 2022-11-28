package com.java.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Custom {

	public static void main(String[] args) {
		System.out.println("Enter Your Name  ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			System.out.println("Name is   " +str);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
