package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// --------------亦可以在此直接編譯FileOutputStream-----------------
		try {
			writeTest();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writeTest() throws IOException {
		FileOutputStream out = new FileOutputStream("data.txt");
		out.write(66);
		out.flush();
		out.close();

		// -------------------若處理為小事可以這樣----------------------
		/*
		 * try { FileOutputStream out = new FileOutputStream("data.txt");
		 * out.write(66); out.flush(); out.close(); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
	}

}
