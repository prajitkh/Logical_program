package com.logic;

public class ArrayFrequncy {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 34, 67, 88, 44, 22, 44, 44, 22 };
		int count[] = new int[arr.length];

		int i, j;
		int c, max = 0;
		for (i = 0; i < arr.length; i++) {
			c = 1;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					c++;
					count[j] = -1;

				}

			}

			if (count[i] != -1)
				count[i] = c;

			if (count[i] > max)
				max = arr[i];

//
//		List<Integer> list = Arrays.asList(5, 6, 34, 67, 88, 44, 22, 44, 44, 22);
//
//		LinkedHashSet<Integer> set = new LinkedHashSet<>();
//		ArrayList<Integer> liss = new ArrayList<>();
//
//		for (int i = 0; i < list.size(); i++) {
//			if (set.add(list.get(i))) {
//				liss.add(Collections.frequency(list, list.get(i)));
//			}
//
//		}
//		set.forEach(ee -> System.out.print(ee + " "));
//
//		liss.forEach(ee -> System.out.print(ee + " "));

		}

	}
}
