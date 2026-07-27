package com.creatio.crm.language.basics;

import java.util.LinkedList;
import java.util.List;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
public class TargetIndexProblem {
	public void method(int arr[], int target) {
		List<String> pair = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j=1+i; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					String firstVal = String.valueOf(i);
					String secondVal = String.valueOf(j);
					String pairVal = "[ " + firstVal + " " + secondVal + " ]";
					pair.add(pairVal);
				} 
			}
		}
		System.out.println(pair);
	}

	public static void main(String[] args) {
	int[] arr = {2,7,11,15,0,9,4,7,8,3,2,6,3,5,2};
	int target = 9;
	TargetIndexProblem obj = new TargetIndexProblem();
	obj.method(arr, target);
   }
}
