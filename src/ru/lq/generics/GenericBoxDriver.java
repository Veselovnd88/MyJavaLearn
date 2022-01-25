package ru.lq.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class GenericBoxDriver {
	
	public static void main(String[] args) {

//	GenericBox<Integer> mybox1 = new GenericBox<>();
//	GenericBox<String> mybox2 = new GenericBox<>();
	Set<Integer> myset = new LinkedHashSet<Integer>();
	Integer[] intarr = new Integer[] {7,7,6,5,2,3,4,5,6,7};
	Collections.addAll(myset,intarr);
	System.out.println(myset.toString());
	Map<String, Integer> mymap = new HashMap<String,Integer>();
	mymap.put("a", 1);
	mymap.put("b", 2);
	mymap.put("c", 3);

	
	


}}
