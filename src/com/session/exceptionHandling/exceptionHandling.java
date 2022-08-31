package com.session.exceptionHandling;

class exceptionHandling {
	public static void main(String args[]) {
		try {

			int data1 = 100 / 0;
			System.out.println("inside try block");
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		catch (NumberFormatException | ArithmeticException e) {
			e.printStackTrace();
			System.out.println("the exception" + e);

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {

			System.out.println();
		}

		int data3 = 20;
		System.out.println("data");

	}
}