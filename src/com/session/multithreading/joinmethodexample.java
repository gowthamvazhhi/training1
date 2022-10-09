package com.session.multithreading;

public class joinmethodexample extends Thread {

	public joinmethodexample(String Threadname) {
		super(Threadname);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " " + i);
			Thread.currentThread().setPriority(10);
		}

	}

	public static void main(String[] args) throws InterruptedException {

		joinmethodexample je1 = new joinmethodexample("thread one");

		joinmethodexample je2 = new joinmethodexample("thread two");
		joinmethodexample je3 = new joinmethodexample("thread three");

		je1.setPriority(5);
		je2.setPriority(10);
		je3.setPriority(7);

		je2.start();

		je1.start();
		je3.start();

		System.out.println("Inside Main Method");
		je2.join();
		System.out.println("Main Method");

	}

}
