package ru.codewars.fundamentals;

public class Nterms {

		public static String seriesSum(int n) {
			double result = 0;
			int dividor =1;
			for (int i=1; i<=n;i++) {
				result+=(double) 1/dividor;
				dividor+=3;
				
			}
			
			
			
			return String.format("%.2f", result);
			
			

	}

}
