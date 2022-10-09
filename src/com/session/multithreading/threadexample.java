package com.session.multithreading;

public class threadexample extends Thread {

	public void run() {
		System.out.println("inside run");
	}

	void display() {
		System.out.println("inside display method");
	}

	public static void main(String[] args) {

		threadexample te = new threadexample();
		te.display();
		te.start();
		System.out.println("main method");

	}

}
