package ru.javarush.learning;

import java.util.Scanner;

public class ReverseArr {
	public static void Revarr() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0) {
			int[] myarr =new int[num];
			for(int i=0; i<num; i++) {
				myarr[i] = sc.nextInt();
			}
			if(num%2==0) {
			for (int i=num-1; i>=0; i--) {
				System.out.println(myarr[i]);}
		}else {
			for (int i=0; i<num; i++) {
				System.out.println(myarr[i]);}
		}
		}
		
	
	
	
	sc.close();
	}

}
