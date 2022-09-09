package com.session.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashsetex {

	public static void main(String args[]) {
		LinkedHashSet<String> al = new LinkedHashSet<String>();
		al.add("Gowtham");
		al.add("Sachin");
		al.add("kohli");
		al.add("Ashwin");
		al.add("Gowtham");
		al.add("Bhumrah");
		al.add("dhoni");
		al.add(null);
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
