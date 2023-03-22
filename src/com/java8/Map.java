package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("prajit khawshi", "pratiksha ss", "prashik kh", "surapj kkh");
		List<String> dd = list.stream().filter(e -> e.contains("p")).collect(Collectors.toList());
		System.out.println(dd);

		List<String> strings = list.stream().map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
				.collect(Collectors.toList());
		System.out.println(strings);

	}
}
