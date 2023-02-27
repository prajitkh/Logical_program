package com.logic.string;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Remove_Duplicates {

	public static void main(String[] args) {

		String S = "prajitkhawshunccccccccccccccccccc";

		LinkedHashSet<Character> list = new LinkedHashSet<>();

		for (int i = 0; i < S.length(); i++) {
			list.add(S.charAt(i));
		}
		Iterator itr = list.iterator();
		String s = "";
		while (itr.hasNext()) {
			Character ch = (Character) itr.next();
			s += ch.toString();
		}
		System.out.println(list);

	}
}
