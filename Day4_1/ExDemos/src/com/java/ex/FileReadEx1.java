package com.java.ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx1 {

	public static void main(String[] args) {
		File f1 = new File("D:/java_DxcNov/Day4/ExDemos/src/com/java/ex/Voting.java");
		int ch;
		try {
			FileReader fr = new FileReader(f1);
			while((ch=fr.read()) != -1) {
				System.out.print((char)ch);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
