package com.session.oops;

class x {
	void msg() {
		System.out.println("Hello");
	}
}

class B {
	void msg1() {
		System.out.println("Welcome");
	}
}

class C extends A{ 

	public static void main(String args[]) {
		C obj = new C();
		//obj.msg();// Now which msg() method would be invoked?
	}
}