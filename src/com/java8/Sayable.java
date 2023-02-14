package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sayable {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("s");
		list.add("c");
		list.add("q");
		list.add("rs");
		list.add("sv");

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

	}
}
