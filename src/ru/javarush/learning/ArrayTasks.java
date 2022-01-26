package ru.javarush.learning;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayTasks {
	 public static int[][] result = new int[10][];
	public static int[][] MULTIPLICATION_TABLE;
	public static int[][] multiArray;
	public static int[][][] multiArray1 = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

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
	public static void maxi() {
		int min = Integer.MAX_VALUE;

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i:arr) {
			if (i<=min) {
				min = i;
			}
		}
		System.out.println(min);
		sc.close();
	}
	public static void triangleArr() {
		for (int i = 0; i < result.length; i++) {
			result[i] = new int[i+1];
			for (int j = 0; j <= i; j++) {
				result[i][j] = i+j;
				System.out.print(result[i][j]+" ");
			}System.out.println();
			
		}
	}
	public static void mltArr() {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		multiArray = new int[row][];
		for (int i = 0; i < multiArray.length; i++) {
			multiArray[i] = new int[sc.nextInt()];
		
		}
		sc.close();
	}
	public static void mArr() {
		for (int i = 0; i < multiArray1.length; i++) {
			for (int j = 0; j < multiArray1[i].length; j++) {
				for (int j2 = 0; j2 < multiArray1[i][j].length; j2++) {
					System.out.print(multiArray1[i][j][j2]+" ");
				}System.out.println();
				
			}System.out.println();
			
		}
		
		
	}
}
