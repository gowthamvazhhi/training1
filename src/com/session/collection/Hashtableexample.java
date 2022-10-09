package com.session.collection;

import java.util.Hashtable;

public class Hashtableexample {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht1 = new Hashtable<>();

		ht1.put(1, "one");
		ht1.put(2, "two");
		ht1.put(3, "three");

		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
		

	}

}
