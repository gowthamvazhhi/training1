package com.session.collection;

import java.util.*;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetExample {
	public static void main(String[] args) {
		Set<days> set1 = EnumSet.allOf(days.class);
		System.out.println("Week Days:" + set1);
		Set<days> set2 = EnumSet.noneOf(days.class);
		System.out.println("Week Days:" + set2);
		Set<days> set3 = EnumSet.of(days.THURSDAY);
		System.out.println("Week Days:" + set3);
		Set<days> set4 = EnumSet.range(days.MONDAY, days.FRIDAY);
		System.out.println("Week Days:" + set4);

		Iterator<days> it = set1.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}
	}
}
