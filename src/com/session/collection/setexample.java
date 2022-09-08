package com.session.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set1 = new HashSet<>();
		set1.add("Gowtham");
		set1.add("Sachin");
		set1.add("kohli");
		set1.add("Ashwin");
		set1.add("Bhumrah");
		set1.add("dhoni");
		set1.add(null);

		Iterator it = set1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
