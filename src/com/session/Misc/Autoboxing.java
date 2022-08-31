package com.session.Misc;

public class Autoboxing {

	int i = 12;
	Integer l = Integer.valueOf(i); // boxing

	Integer m = i; // autoboxing

	Integer n = new Integer(3);

	int o = n.intValue();// unboxing

	int p = n;

}
