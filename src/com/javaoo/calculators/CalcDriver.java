package com.javaoo.calculators;

public class CalcDriver {

	public static void main(String[] args) {
		
		BasicCalculator calcbase = new BasicCalculator();
		System.out.println(calcbase.add(5, 60));
		System.out.println(calcbase.multiply(50, 10));
		ScientificCalculator sci = new ScientificCalculator();
		System.out.println(sci.exp(5));
		System.out.println(sci.log(5));
		sci.putValueInMemory(10.0);
		System.out.println(calcbase.add(sci.getValueFrommemory(),sci.getValueFrommemory()));

}}
