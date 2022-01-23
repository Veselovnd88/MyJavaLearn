package ru.codewars.fundamentals;

public class Century {
	public static int getCentury (int number) {
		
		
		return number%100>0?(number/100+1): (number/100);
		
	}
}
