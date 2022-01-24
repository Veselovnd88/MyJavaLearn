package ru.codewars.fundamentals;

import java.util.List;

public class SmileFaces {
	private static boolean nose(char c) {
		return (c=='-'||c=='~')? true:false;}
	
		private static boolean mouth(char c ) {
			return (c==')'||c=='D')? true:false;}



	public static int countSmileys(List<String> arr) {
	int result = 0;
		for(String str:arr) {
			if(str.charAt(0)==':'|| str.charAt(0)==';') {
					if(str.length()==2) {
						if(mouth(str.charAt(1))) {
							result+=1;
					}
				} if (str.length()==3) {
					if(nose(str.charAt(1))) {
						if(mouth(str.charAt(2))) {
							result+=1;
						}
					}
			}
			}
		}

	return result;
	
	}

}
