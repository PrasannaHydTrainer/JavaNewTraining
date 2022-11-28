package com.java.ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjOutEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("d:/files/objout.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject("Date is  ");
			objout.writeObject(new Date()); 
			objout.close();
			fout.close();
			System.out.println("Objects Stored...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
