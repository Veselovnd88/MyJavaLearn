package ru.codewars.fundamentals;

import java.util.List;

public class binaryToDecimal {
    public static int bTod(List<Integer> binary) {
    	int res=0;
for (int i=binary.size()-1; i>=0;i--) {
	res+=Math.pow(2,binary.size()-1-i)*binary.get(i);
}return res;
}}
