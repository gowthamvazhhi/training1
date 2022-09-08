package com.session.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhasmapexample {

	public static void main(String args[]) {
		LinkedHashMap<Integer, String> l = new LinkedHashMap<Integer, String>();
		l.put(1, "Gowtham");
		l.put(3, "Kohli");
		l.put(2, "sachin");
		for (Map.Entry m : l.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
