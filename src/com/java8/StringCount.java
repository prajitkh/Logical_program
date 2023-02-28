package com.java8;

import java.util.Arrays;
import java.util.List;

public class StringCount {
	public static void main(String[] args) {

		List<String> ss = Arrays.asList("prajit", "balaji", "aa", "er", "sdfjosdfjodsf");
		long counts = ss.stream().filter(e -> e.length() > 3).count();
		System.out.println(counts);
	}

}
