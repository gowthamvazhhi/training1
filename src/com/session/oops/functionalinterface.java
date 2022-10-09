package com.session.oops;

@FunctionalInterface
interface laptop {

	public void harddisk();
	  int hashCode();  
	    String toString();  
	    boolean equals(Object obj);  

	default void screen() {

		System.out.println("Screen Size");
	}

	static void keyboard() {
		System.out.println("qwerty keyboard");
	}

}

@FunctionalInterface
interface dell extends laptop {
	public void harddisk();


}




public class functionalinterface implements laptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void harddisk() {
		// TODO Auto-generated method stub
		
	}

}
