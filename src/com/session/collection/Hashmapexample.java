package com.session.collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "Gowtham");
		hmap.put(3, "Kohli");
		hmap.put(2, "sachin");

		for (Map.Entry m : hmap.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
