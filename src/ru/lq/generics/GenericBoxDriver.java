package ru.lq.generics;

public class GenericBoxDriver {
	
	public static void main(String[] args) {

	GenericBox<Integer> mybox1 = new GenericBox<>();
	GenericBox<String> mybox2 = new GenericBox<>();
	
	mybox1.setT(10);
	mybox2.setT("Hello");
	
//	System.out.printf("Hello, this is %s%n", mybox2.getT());
//	System.out.printf("Hello this is %d%n", mybox1.getT());
	Integer[] intarray = {1,2,3,4,5};
	String[] str = {"hate", "evil","vasya"};
	GenericMethod.printArray(intarray);
	GenericMethod.printArray(str);
	
	System.out.println(Maximum.maximum(1, 2, 3));
	System.out.println(Maximum.maximum(2.2, 3.3, 6.6));
	System.out.println(Maximum.maximum("a", "b", "c"));
	

}}
