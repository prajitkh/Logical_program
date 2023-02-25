package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class B {

	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee(1, "prajit", "single", "male"));
		arrayList.add(new Employee(1, "balaji", "single", "male"));

		arrayList.add(new Employee(1, "ayushree", "unmarried", "female"));

		arrayList.add(new Employee(1, "leena", "single", "female"));

		arrayList.add(new Employee(1, "sakshi", "single", "female"));
		List<Employee> collect = arrayList.stream().filter(e -> e.getGender().equalsIgnoreCase("male"))
				.collect(Collectors.toList());
		System.out.println(collect);
		// arrayList.forEach(e -> System.out.println(e));

	}

}
