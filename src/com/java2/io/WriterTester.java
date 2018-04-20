package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriterTester {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = new PrintStream("data.txt");
		out.print("Jack\tcosts\t1000\tdollar");
		out.flush();
		out.close();
	}
}
