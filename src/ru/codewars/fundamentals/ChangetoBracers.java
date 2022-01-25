package ru.codewars.fundamentals;

import java.util.HashMap;
import java.util.Map;

public class ChangetoBracers {
	public static String repl(String str) {
		String result;
		StringBuilder sb = new StringBuilder();
		Map<Character,Integer> mymap = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++) {
			if(!mymap.containsKey(str.charAt(i))) {
				mymap.put(str.charAt(i), 1);
			}
			else {
				mymap.put(str.charAt(i), mymap.get(str.charAt(i))+1);
			}
		}
		
		for (int i=0; i<str.length(); i++) {
			if(mymap.get(str.charAt(i))>1) {
				sb.append(')');
			}
			else {
				sb.append('(');
			}
		}
		result = sb.toString();
		
		return result;
	}

}
