package ru.codewars.fundamentals;

public class RowSumOddNumber {
	public static int RowSumOddNumbers(int n) {
		//1
		//3 5
		// 7 9 11 
		int j=-1;
		int sum =0;
		int sum_p=0;
		for (int i=1; i<=n*(n+1)/2;i++ ) {
			j+=2;
			sum+=j;
		}
		j=-1;
		for (int i=1; i<=(n-1)*(n)/2;i++ ) {
			j+=2;
			sum_p+=j;
		}
		return sum- sum_p;
	}
}
