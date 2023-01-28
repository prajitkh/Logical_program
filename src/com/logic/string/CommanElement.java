package com.logic.string;

public class CommanElement {

	public static void main(String[] args) {
		String str = "Prajit, khwashi!! Nagpur NIMAP";

		str = str.replaceAll("[^\\w\\s]", "");

		String[] cc = str.split(" ");

		for (int i = 0; i < cc.length; i++) {

			System.out.println(cc[i].charAt(0));

		}
	}
//		for (int i = 0; i < str.length(); i++) {
//
//			if (i == 0) {
//				System.out.println(str.charAt(i));
//			} else if (str.charAt(i) == ' ') {
//				System.out.println(str.charAt(i + 1));
//			}
//		}

}
