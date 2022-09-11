package com.session.collection;

import java.util.Comparator;

public class idcomparatorexample implements Comparator<studentclass> {

	@Override
	public int compare(studentclass s1, studentclass s2) {
		// TODO Auto-generated method stub
		if (s1.rank == s2.rank)
			return s1.name.compareTo(s2.name);
		else if (s1.rank > s2.rank)
			return 1;
		else
			return -1;
	}
}
