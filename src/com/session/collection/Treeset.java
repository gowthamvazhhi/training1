package com.session.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
	public static void main(String args[]) {
		TreeSet<String> al = new TreeSet<String>();
		al.add("Gowtham");
		al.add("Sachin");
		al.add("Kohli");
		al.add("Ashwin");
		al.add("Gowtham");
		al.add("Bhumrah");
		al.add("Dhoni");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
