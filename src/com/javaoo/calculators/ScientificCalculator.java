package com.javaoo.calculators;

public class ScientificCalculator {

	public static final double PI = 3.14159;
	private double holdValue;
	
	public final double getValueFrommemory() {//чтобы никто не мог переобределить
		return holdValue;
	}
	public final void putValueInMemory(double holdValue) {// чтобы не могли переобределить метод
		this.holdValue = holdValue;
	}
	public final static double exp(double a) {
		return(0);
	}
	public final static double log(double a) {
		return(0);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}