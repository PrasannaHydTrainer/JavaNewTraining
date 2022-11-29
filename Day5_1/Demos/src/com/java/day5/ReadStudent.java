package com.java.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudent {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("d:/files/student.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			Student student = (Student)objin.readObject();
			System.out.println(student);
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
