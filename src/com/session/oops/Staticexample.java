package com.session.oops;

class Teemployee {
	int eid;
	String empname;
	static String ceo;
	
	static {
		ceo = "ganguli"; // calls during class load
		System.out.println("static block");
	}

	public Teemployee() {

		eid = 1;
		empname = "sachin";
		// ceo = "ganguli"; everytime calls when object creation replacement static
		// block
		System.out.println("Constructor block");
	}

	public void display() {

		System.out.println("the eid is " + eid + " The empname is " + empname + " ceo is  " + ceo);
	}

}

public class Staticexample {

	int i = 0; // Non static variable
	static int x = 10; // Static variable

	public static void main(String[] args) {

		Teemployee e = new Teemployee();
		e.display();

		Teemployee e1 = new Teemployee();
		e1.display();
		
		/*
		 static variable are called directly using class name  without creating object
		
		*/
		String ceo = Teemployee.ceo;
		System.out.println("inside Main Method");
		System.out.println("The ceo name " +ceo);

		// System.out.println(i);
		// System.out.println(x);
		
		
		
		 int result=Calculate.cube(5);
		 System.out.println(result);

	}

}
//Static Method

 class Calculate{
	  static int cube(int x){
	  return x*x*x;
	  }
}

