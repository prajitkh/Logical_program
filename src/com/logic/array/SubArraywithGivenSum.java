package com.logic.array;

import java.util.ArrayList;

public class SubArraywithGivenSum {

	static ArrayList<Integer> withGiven(int arr[], int n, int s) {

	    ArrayList<Integer> res = new ArrayList<Integer>();
        int target =arr[0]; int i = 0; int j=1;
        if(s==0){
            res.add(-1);
            return res;
        }
      while(j < n){
          while(j < n && target < s){
              target +=arr[j];
              j++;
          }
          while(i < j && target > s){
              target -= arr[i];
              i++;
          }
          if (target == s && i != j){
              res.add(i+1);
              res.add(j);
              break;
          }
      }
      if(res.size() == 0){
          res.add(-1);
      }
      return res;
    }

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 15;
		int len = arr.length;

		System.out.println(withGiven(arr, len, sum));

	}
}
