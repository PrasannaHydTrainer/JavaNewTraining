package com.java.day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteStudent {

	public static void main(String[] args) {
		Student student = new Student(1, "Anusha", "Hyderabad", 9.3);
		try {
			FileOutputStream fout = new FileOutputStream("d:/files/student.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(student);
			objout.close();
			fout.close();
			System.out.println("*** Student Objects Stored ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
