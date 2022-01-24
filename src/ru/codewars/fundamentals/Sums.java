package ru.codewars.fundamentals;

import java.util.Arrays;

public class Sums {

	public static int largestPairSum(int[] arr) {
		Arrays.sort(arr);
		int result = arr[arr.length-1]+arr[arr.length-2];
		return result;
		
	}
}
