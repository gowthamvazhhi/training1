package com.session.exceptionHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class throwsexample {

	public static void writeToFile() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"));
		bw.write("Test");
		bw.close();
	}

	public static void main(String[] args) throws IOException {

		writeToFile();

		int data3 = 12;
		System.out.println(data3);

	}

}
