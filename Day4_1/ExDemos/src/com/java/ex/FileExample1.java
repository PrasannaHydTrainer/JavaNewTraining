package com.java.ex;

import java.io.File;

public class FileExample1 {

	public static void main(String[] args) {
		File f1 = new File("D:/java_DxcNov/Day4/ExDemos/src/com/java/ex/Voting.java");
		System.out.println("File Name   " +f1.getName());
		System.out.println("Full Path  " +f1.getPath());
		System.out.println("Parent Directory   " +f1.getParent());
	}
}
