package ru.codewars.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeWarsTest {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		String[] array = new String[] {":(", ";(", ";}", ":-D"};
		arr = Arrays.asList(array);
		int[] arr2 = new int[] {1,2,3,4,5,6};
		System.out.println(Sums.largestPairSum(arr2));

	}

}
