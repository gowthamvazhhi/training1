package com.session.oops;

class bank {
	private int balance;

	public int getBalance() {

		balance = balance + 10 + 10;
		return balance;
	}

}

public class encapsulationexample {

	public static void main(String args[]) {

		bank b = new bank();

		System.out.println(b.getBalance());

	}
}
