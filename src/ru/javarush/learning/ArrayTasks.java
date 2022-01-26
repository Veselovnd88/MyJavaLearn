package ru.javarush.learning;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks {
	public static int[][] MULTIPLICATION_TABLE;
	public static void removeStrings() {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[6];
		for(int i=0; i<6; i++) {
			arr[i]=sc.nextLine();
		}
		for(int i=0; i<arr.length; i++) {
			String current = arr[i];
				for(int j=i+1;j<arr.length; j++) {
					if(current==null) {
						break;}
						if(current.equals(arr[j])) {
						arr[i]=null;
						arr[j]=null;}
					}
				}
		System.out.println(Arrays.toString(arr));
		
		
		sc.close();
	}
	public static void multTable() {
		 //public static int[][] MULTIPLICATION_TABLE;
		 MULTIPLICATION_TABLE = new int[10][10];
		 for(int i=0; i<10;i++) {
			 for(int j=0; j<10; j++) {
				 MULTIPLICATION_TABLE[i][j] = (i+1)*(j+1);
				 System.out.print(MULTIPLICATION_TABLE[i][j]+" ");
			 }System.out.println();
		 }
		 
	}
}
