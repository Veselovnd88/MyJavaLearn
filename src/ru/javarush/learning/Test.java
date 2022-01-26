package ru.javarush.learning;

public class Test {
	 public static int[] array = new int[]{-1, 2, 3, -4, -5};
	public static void main(String[] args) {
		
		for (int i = 0; i<array.length; i++) {
			if(i%2==0)
			{
				array[i] = array[i]*(-1); 
			}
		} 
	} 
}
