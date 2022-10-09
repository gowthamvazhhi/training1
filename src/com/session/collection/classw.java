package com.session.collection;

import java.util.ArrayList;
import java.util.List;

public class classw {

	public static void main(String[] args) {

		List<String> a1 = new ArrayList<String>();

		a1.add("Pirahadesh");
		a1.add("Ranjith");
		a1.add("sandhiya");
		a1.add("Gowtham");
		a1.add("Swathi");
		a1.add(3, "Kohli");
		a1.remove("Gowtham");
		
		for (String x : a1) {
			System.out.print(x + " ");
		}
		System.out.println("=======");
		List<String> a2 = new ArrayList<String>();
		a2.add("Sachin");
		a2.add("ABD");
		a2.add("Steyn");
		a2.add("Cook");
		a1.addAll(3, a2);
		for (String x : a1) {
			System.out.print(x + " ");
		}
		for (String x : a1) {
			System.out.println(x + " ,");
		}
	}
}
