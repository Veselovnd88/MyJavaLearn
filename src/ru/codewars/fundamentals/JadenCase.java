package ru.codewars.fundamentals;



public class JadenCase {
	public String toJadenCase(String phrase) {
		if (phrase== null|| phrase.equals("")) {
			return null;
		}
		String [] splitted = phrase.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String s:splitted) {
			char[] chars = s.toCharArray();
			chars[0]=Character.toUpperCase(chars[0]);
			sb.append(String.valueOf(chars));
			sb.append(" ");
			
		}return sb.toString().trim();		
		
		
		
	}
}
