package com.java.ex;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("d:/files/dataout.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(52);
			dout.writeUTF("Prasanna");
			dout.writeDouble(99434.22);
			dout.writeBoolean(true);
			dout.close();
			fout.close();
			System.out.println("*** Data Stored ***");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
