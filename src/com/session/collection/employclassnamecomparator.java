package com.session.collection;

import java.util.Comparator;

public class employclassnamecomparator implements Comparator<employeeclassexample> {

	@Override
	public int compare(employeeclassexample o1, employeeclassexample o2) {
		// TODO Auto-generated method stub
		if (o1.salary == o2.salary)
			return o1.name.compareTo(o2.name);
		else if (o1.salary < o2.salary)
			return 1;
		else
			return -1;

	}
}