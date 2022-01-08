package com.javaoo.calculators;
import java.lang.Math;
public class ScientificCalculator {

	public static final double PI = 3.14159;
	private double holdValue;
	
	public final double getValueFrommemory() {//чтобы никто не мог переобределить
		return holdValue;
	}
	public final void putValueInMemory(double holdValue) {// чтобы не могли переобределить метод
		this.holdValue = holdValue;
	}
	public final double exp(double a) {
		return  Math.exp(a);
	}
	public final double log(double a) {
		return Math.log(a);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
