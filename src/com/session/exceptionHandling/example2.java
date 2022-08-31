package com.session.exceptionHandling;

public class example2 {

	public static void validate(int age) {

		try {
			if (age < 18) {

				throw new gowthamexception("Person is not eligible to vote");

			}

			else {
				System.out.println("Person is eligible to vote!!");
				throw new IndexOutOfBoundsException();
			}
		} catch (gowthamexception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String args[]) {
		validate(12);
		System.out.println("rest of the code...");

	}
}