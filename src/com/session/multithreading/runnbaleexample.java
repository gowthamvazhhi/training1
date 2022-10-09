package com.session.multithreading;

public class runnbaleexample implements Runnable {

	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		runnbaleexample m1 = new runnbaleexample();
		Thread t1 = new Thread(m1);
		t1.start();
	}

}
