package com.session.exceptionHandling;

public class exceptioncreation {
	static int c;

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5 };

		System.out.println("Before exception");
		try {

			System.out.println(a[5]);
			c = 10 / 0;

		} catch (ArithmeticException e) {
			System.out.println("inside catch parent block");
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {

			c = 10 / 1;
			System.out.println("inside Array exceptions block");
			System.out.println(e);
		} catch (Exception e) {

		}

		System.out.println("After exception");
	}

}
